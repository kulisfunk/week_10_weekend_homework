package com.example.goober.shoppingbasket;

/**
 * Created by goober on 22/11/2017.
 */

public class PurchaseItem {

    String name;
    int price;

    public PurchaseItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
