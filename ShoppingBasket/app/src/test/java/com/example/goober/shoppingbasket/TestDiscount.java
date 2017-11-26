package com.example.goober.shoppingbasket;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by goober on 23/11/2017.
 */

public class TestDiscount {


    @Test

    public void hasBogofDiscount(){

    }

    @Test

    public void hasMaximumDiscount(){
        Customer customer1 = new Customer("Martin", true);
        PurchaseItem bread1 = new PurchaseItem(Items.BREAD);
        PurchaseItem dvd1 = new PurchaseItem(Items.DVD);
        PurchaseItem dvd2 = new PurchaseItem(Items.DVD);
        ShoppingBasket basket = new ShoppingBasket();
        basket.addItem(bread1);
        basket.addItem(dvd1);
        basket.addItem(dvd2);
        Discount discount = new Discount(basket, customer1);
        discount.bogof();
        double result = discount.maxValueDiscount();
        assertEquals(1933, Math.round(result));

    }

    @Test

    public void hasCustomerDiscount(){
        Customer customer1 = new Customer("Martin", true);
        PurchaseItem bread1 = new PurchaseItem(Items.BREAD);
        PurchaseItem dvd1 = new PurchaseItem(Items.DVD);
        ShoppingBasket basket = new ShoppingBasket();
        basket.addItem(bread1);
        basket.addItem(dvd1);

        Discount discount = new Discount(basket, customer1);
        discount.bogof();
        discount.maxValueDiscount();
        double result = discount.customerCardDiscount();

        assertEquals(1126, Math.round(result), 0.01);
    }
}
