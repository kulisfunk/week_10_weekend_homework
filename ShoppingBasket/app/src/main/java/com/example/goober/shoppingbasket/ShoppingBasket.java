package com.example.goober.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by goober on 22/11/2017.
 */

public class ShoppingBasket {

    ArrayList<PurchaseItem> basket = new ArrayList<>();

    public ShoppingBasket() {


    }


    public int getSizeOfBasket() {
        return basket.size();
    }

    public void addItem(PurchaseItem item) {
        basket.add(item);
    }

    public void removeItem(PurchaseItem item) {
        basket.remove(item);
    }

    public void emptyBasket() {
        basket.clear();
    }
}
