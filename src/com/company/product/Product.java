package com.company.product;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public abstract class Product implements Serializable {

    private final String description;
    private final String name;
    private final BigDecimal discount;

    private BigDecimal price;

    public Product(String name, String description, BigDecimal discount, BigDecimal price){
        this.description = description;
        this.price = price;
        this.name = name;
        this.discount = discount;
    }


    public BigDecimal getDiscount() { return discount;}
    public String getDescription(){
        return  description;
    }
    public BigDecimal getDiscountPrice() { return price.multiply(BigDecimal.valueOf(1).subtract(discount)); }

    public BigDecimal getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return "Название: " + name + " Описание: " + description + " Цена со скидкой: " + getDiscountPrice() + " Цена без скидки: " + price;
    }
}