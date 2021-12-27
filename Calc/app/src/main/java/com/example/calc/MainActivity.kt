package com.example.calc

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var inputText: TextInputEditText
    lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        inputText = findViewById(R.id.inputText)
        textView = findViewById(R.id.textView)
    }

    fun onCalculateBnt(v: View) {
        val fullExpressionUnity: String = inputText.text.toString()
        try {
            val fullExpressionSplit: List<String> =
                fullExpressionUnity.split(" ", ignoreCase = true, limit = 0)
            if (fullExpressionSplit.size >= 4) {
                textView.setText(R.string.ex_num_arg)
            } else {
                val operator: Char = fullExpressionSplit.get(1).single();
                if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
                    textView.setText(R.string.ex_operator);
                } else {
                    try {
                        val x: Double = fullExpressionSplit[0].toDouble()
                        val y: Double = fullExpressionSplit[2].toDouble()
                        if (y == 0.0 && operator == '/') {
                            textView.setText(Double.NaN.toString())
                        } else {
                            textView.setText(calculation(x, y, operator).toString())
                        }
                    } catch (e: Exception) {
                        textView.setText(R.string.ex_to_double)
                    }
                }
            }
        } catch (e: Exception) {
            textView.setText(R.string.ex_split_space)
        }
    }

    fun calculation(x: Double, y: Double, operation: Char): Double {
        when (operation) {
            '+' -> return x + y
            '-' -> return x - y
            '*' -> return x * y
            '/' -> return x / y
            else -> return Double.NaN
        }
    }
}
