package com.company.discount;

import java.time.LocalDate;

public class DiscountCard {



    private final int id;
    private final LocalDate birth;

    private final String name;
    private String phone;

    public DiscountCard(int id, String phone, String name, LocalDate birth) {
        this.id = id;
        this.birth = birth;
        this.name = name;
        this.phone = phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public LocalDate getBirth() {
        return birth;
    }

    @Override
    public String toString(){
        return name + " " + birth + " " + phone + " " + " " + id;
    }
}