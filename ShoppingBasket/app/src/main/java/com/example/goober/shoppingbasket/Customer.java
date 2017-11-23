package com.example.goober.shoppingbasket;

/**
 * Created by goober on 23/11/2017.
 */

public class Customer {

    String name;
    Boolean discountCard;

    public Customer(String name, Boolean discountCard) {
        this.name = name;
        this.discountCard = discountCard;
    }

    public String getName() {
        return name;
    }

    public Boolean getDiscountCard() {
        return discountCard;
    }
}
