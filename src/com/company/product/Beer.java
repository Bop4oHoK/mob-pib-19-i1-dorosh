package com.company.product;

import java.io.Serializable;
import java.math.BigDecimal;

public class Beer extends Product implements Serializable {
    public Beer(String name, String description,BigDecimal discount, BigDecimal price) {
        super(name, description, discount, price);
    }
}