package com.example.goober.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import java.security.ProtectionDomain;

import static com.example.goober.shoppingbasket.Items.BREAD;
import static org.junit.Assert.assertEquals;

/**
 * Created by goober on 22/11/2017.
 */

public class TestPurchaseItem {

    @Before
    public void setup() {

        PurchaseItem bread1 = new PurchaseItem(BREAD);
        PurchaseItem bread2 = new PurchaseItem(BREAD);
        PurchaseItem bread3 = new PurchaseItem(BREAD);
        PurchaseItem dvd1 = new PurchaseItem(Items.DVD);
        PurchaseItem dvd2 = new PurchaseItem(Items.DVD);
        PurchaseItem dvd3 = new PurchaseItem(Items.DVD);

    }


    @Test
    public void testGetItemName(){
        PurchaseItem bread1 = new PurchaseItem(BREAD);
        String result = bread1.getName();
        assertEquals("BREAD", result);


    }

    @Test
    public void testGetItemPrice(){
        PurchaseItem bread1 = new PurchaseItem(BREAD);
        Double result = bread1.getPrice();
        assertEquals(150, result, 0.01);

    }
}
