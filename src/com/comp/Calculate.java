package com.comp;

import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class Calculate {

    public static void main(String[] args) {
        System.out.print("\nHello, my dear User!\nWith my help You will be able to take advantage of the basic features (Such as + - * /).\nYou should separate each character by a space. For example: 4 * 8\n");
        Scanner inputValue = new Scanner(System.in);
        String fullExpressionUnity = inputValue.nextLine();
        inputValue.close();
        String[] fullExpressionSplit = fullExpressionUnity.split(" ");
        int expres = 0;
        if (fullExpressionSplit.length >= 4) {
            System.out.println("Invalid number of arguments");
            expres = 1;
        }
        char operator = fullExpressionSplit[1].charAt(0);
        if (operator != '+' && operator != '-' && operator != '*' && operator != '/')
        {
            System.out.println("Entered invalid operator\nPlease try again");
            expres = 1;
        }
        double x = parseDouble(fullExpressionSplit[0]), y = parseDouble(fullExpressionSplit[2]);
        if (expres == 1){
            System.exit(1);
        }
        if (y == 0 && operator == '/') {
            System.out.print("= NaN");
        }
        else {
            System.out.print("=" + calculation(x, y, operator));
        }
    }
    public static double calculation(double x, double y, char operation){
        switch (operation){
            case ('+'):
                return x + y;
            case ('-'):
                return x - y;
            case ('*'):
                return x * y;
            case ('/'):
                return x / y;
            default: return 0;
        }
    }
}