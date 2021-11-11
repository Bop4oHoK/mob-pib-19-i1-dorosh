package com.company.product;

import java.math.BigDecimal;

public class Beer extends Product {
    public Beer(String name, String description,BigDecimal discount, BigDecimal price) {
        super(name, description, discount, price);
    }
}