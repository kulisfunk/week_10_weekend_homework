package com.example.goober.shoppingbasket;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by goober on 22/11/2017.
 */

public class TestShoppingBasket {

    @Test
    public void testShoppingBasketIsEmpty(){

        ShoppingBasket basket = new ShoppingBasket();
        int result = basket.getSizeOfBasket();
        assertEquals(0, result);

    }

    @Test
    public void testCanAddItemToBasket(){
        PurchaseItem bread1 = new PurchaseItem("Warbertons", 150);
        ShoppingBasket basket = new ShoppingBasket();
        basket.addItem(bread1);
        int result = basket.getSizeOfBasket();
        assertEquals(1, result);

    }

    @Test
    public void testCanRemoveItemFromBasket(){
        PurchaseItem bread1 = new PurchaseItem("Warbertons", 150);
        PurchaseItem dvd1 = new PurchaseItem("Interstellar", 999);
        ShoppingBasket basket = new ShoppingBasket();
        basket.addItem(bread1);
        basket.addItem(dvd1);
        basket.removeItem(bread1);
        int result = basket.getSizeOfBasket();
        assertEquals(1, result);

    }

    @Test
    public void testCanEmptyBasket(){
        PurchaseItem bread1 = new PurchaseItem("Warbertons", 150);
        PurchaseItem dvd1 = new PurchaseItem("Interstellar", 999);
        ShoppingBasket basket = new ShoppingBasket();
        basket.addItem(bread1);
        basket.addItem(dvd1);
        basket.emptyBasket();
        int result = basket.getSizeOfBasket();
        assertEquals(0, result);
    }
}
