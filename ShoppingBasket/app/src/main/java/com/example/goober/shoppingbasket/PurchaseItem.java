package com.example.goober.shoppingbasket;

import static android.R.attr.name;

/**
 * Created by goober on 22/11/2017.
 */

public class PurchaseItem {

    private Items basketItem;

    public PurchaseItem(Items item) {
        this.basketItem = item;
    }

    public String getName() {
        return basketItem.name();
    }

    public Double getPrice() {

        return this.basketItem.getValue();
    }
}
