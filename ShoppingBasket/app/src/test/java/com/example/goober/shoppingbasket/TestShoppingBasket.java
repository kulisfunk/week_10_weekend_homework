package com.example.goober.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by goober on 22/11/2017.
 */

public class TestShoppingBasket {

    ShoppingBasket basket;
    PurchaseItem bread1;
    PurchaseItem dvd1;

    @Before
    public void setup(){
        basket = new ShoppingBasket();
        bread1 = new PurchaseItem(Items.BREAD);
        dvd1 = new PurchaseItem(Items.DVD);
    }

    @Test
    public void testShoppingBasketIsEmpty(){
        int result = basket.getSizeOfBasket();
        assertEquals(0, result);

    }

    @Test
    public void testCanAddItemToBasket(){
        basket.addItem(bread1);
        int result = basket.getSizeOfBasket();
        assertEquals(1, result);

    }

    @Test
    public void testCanRemoveItemFromBasket(){
        basket.addItem(bread1);
        basket.addItem(dvd1);
        basket.removeItem(bread1);
        int result = basket.getSizeOfBasket();
        assertEquals(1, result);

    }

    @Test
    public void testCanEmptyBasket(){
        basket.addItem(bread1);
        basket.addItem(dvd1);
        basket.emptyBasket();
        int result = basket.getSizeOfBasket();
        assertEquals(0, result);
    }

    @Test
    public void testBasketValue(){
        basket.addItem(bread1);
        basket.addItem(dvd1);
        int result = basket.getBasketBaseValue();
        assertEquals(1149, result);
    }
}
