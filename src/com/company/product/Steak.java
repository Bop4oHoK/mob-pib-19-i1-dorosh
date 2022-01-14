package com.company.product;

import java.io.Serializable;
import java.math.BigDecimal;

public class Steak extends Product implements Serializable {

    public Steak(String name, String description, BigDecimal discount, BigDecimal price) {
        super(name, description, discount, price);
    }
}