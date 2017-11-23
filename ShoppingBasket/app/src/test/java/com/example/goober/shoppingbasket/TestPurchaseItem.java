package com.example.goober.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by goober on 22/11/2017.
 */

public class TestPurchaseItem {

    @Before
    public void setup() {

        PurchaseItem bread1 = new PurchaseItem("Warbertons", 150);
        PurchaseItem bread2 = new PurchaseItem("Hovis", 120);
        PurchaseItem dvd1 = new PurchaseItem("Interstellar", 999);
        PurchaseItem dvd2 = new PurchaseItem("Interstellar", 999);
        PurchaseItem bread3 = new PurchaseItem("Hovis", 120);
        PurchaseItem dvd3 = new PurchaseItem("Inception", 599);
    }


    @Test
    public void testGetItemName(){
        PurchaseItem bread1 = new PurchaseItem("Warbertons", 150);
        String result = bread1.getName();
        assertEquals("Warbertons", result);


    }

    @Test
    public void testGetItemPrice(){
        PurchaseItem bread1 = new PurchaseItem("Warbertons", 150);
        int result = bread1.getPrice();
        assertEquals(150, result);

    }
}
