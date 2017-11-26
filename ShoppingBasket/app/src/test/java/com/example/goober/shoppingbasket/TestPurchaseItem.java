package com.example.goober.shoppingbasket;

import org.junit.Before;
import org.junit.Test;


import static com.example.goober.shoppingbasket.Items.BREAD;
import static org.junit.Assert.assertEquals;

/**
 * Created by goober on 22/11/2017.
 */

public class TestPurchaseItem {
    PurchaseItem bread1;
    PurchaseItem bread2;
    PurchaseItem bread3;
    PurchaseItem dvd1;
    PurchaseItem dvd2;
    PurchaseItem dvd3 ;

    @Before
    public void setup() {

        bread1 = new PurchaseItem(BREAD);
        bread2 = new PurchaseItem(BREAD);
        bread3 = new PurchaseItem(BREAD);
        dvd1 = new PurchaseItem(Items.DVD);
        dvd2 = new PurchaseItem(Items.DVD);
        dvd3 = new PurchaseItem(Items.DVD);

    }


    @Test
    public void testGetItemName(){
        String result = bread1.getName();
        assertEquals("BREAD", result);


    }

    @Test
    public void testGetItemPrice(){
        Double result = bread1.getPrice();
        assertEquals(150, result, 0.01);

    }
}
