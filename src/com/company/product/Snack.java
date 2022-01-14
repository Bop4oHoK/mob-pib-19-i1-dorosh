package com.company.product;

import java.io.Serializable;
import java.math.BigDecimal;

public class Snack extends Product implements Serializable {
    public Snack(String name, String description, BigDecimal discount, BigDecimal price) {
        super(name, description, discount, price);
    }
}