package com.example.goober.shoppingbasket;

import static android.R.attr.value;

/**
 * Created by goober on 26/11/2017.
 */

public enum Items {

    BREAD(150.00),
    DVD(999.00),
    BACON(1000.00),
    EGGS(130.00);

    public Double value;

    Items(Double value) {
        this.value = value;
    }

    public Double getValue() {
        return value;
    }

}
