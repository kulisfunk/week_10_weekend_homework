package com.example.goober.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static com.example.goober.shoppingbasket.Items.BACON;
import static com.example.goober.shoppingbasket.Items.BREAD;
import static com.example.goober.shoppingbasket.Items.DVD;
import static com.example.goober.shoppingbasket.Items.EGGS;
import static org.junit.Assert.assertEquals;

/**
 * Created by goober on 23/11/2017.
 */

public class TestDiscount {

    Customer customer1;
    PurchaseItem bread1;
    PurchaseItem dvd1;
    PurchaseItem dvd2;
    PurchaseItem bacon;
    PurchaseItem eggs;
    ShoppingBasket basket;

    @Before
    public void setup(){
        customer1 = new Customer("Martin", true);
        bread1 = new PurchaseItem(BREAD);
        dvd1 = new PurchaseItem(DVD);
        dvd2 = new PurchaseItem(DVD);
        bacon = new PurchaseItem(BACON);
        eggs = new PurchaseItem(EGGS);
        basket = new ShoppingBasket();
    }


    @Test

    public void hasBogofDiscount(){
        basket.addItem(bread1);
        basket.addItem(dvd1);
        basket.addItem(dvd2);
        Discount discount = new Discount(basket, customer1);
        ArrayList items = discount.getItemNamesInBasket();
        HashMap basketSorted = discount.getNumberOccurences(items);
        Double result = discount.bogofDiscount(basketSorted);
        assertEquals(1149.00, result, 0.1);

    }

    @Test

    public void hasMaximumDiscount(){
        basket.addItem(bread1);
        basket.addItem(dvd1);
        basket.addItem(bacon);
        basket.addItem(eggs);
        Discount discount = new Discount(basket, customer1);
        ArrayList items = discount.getItemNamesInBasket();
        HashMap basketSorted = discount.getNumberOccurences(items);
        discount.bogofDiscount(basketSorted);
        double result = discount.maxValueDiscount();
        assertEquals(2051, Math.round(result));

    }

    @Test

    public void hasCustomerDiscount(){
        basket.addItem(bread1);
        basket.addItem(dvd1);

        Discount discount = new Discount(basket, customer1);
        ArrayList items = discount.getItemNamesInBasket();
        HashMap basketSorted = discount.getNumberOccurences(items);
        discount.bogofDiscount(basketSorted);
        discount.maxValueDiscount();
        double result = discount.customerCardDiscount();

        assertEquals(1126, Math.round(result), 0.01);
    }

    @Test
    public void canGetItemNamesInBasket(){
        ArrayList<String> expected = new ArrayList<>();
        expected.add("BREAD");
        expected.add("DVD");
        expected.add("DVD");
        basket.addItem(bread1);
        basket.addItem(dvd1);
        basket.addItem(dvd2);
        Discount discount = new Discount(basket, customer1);
        ArrayList result = discount.getItemNamesInBasket();
        assertEquals(expected, result);
    }

    @Test
    public void canGetNumberOfOccurencesInBasket(){
        HashMap expected = new HashMap();
        expected.put("BREAD", 1);
        expected.put("DVD", 2);
        basket.addItem(bread1);
        basket.addItem(dvd1);
        basket.addItem(dvd2);
        Discount discount = new Discount(basket, customer1);
        ArrayList items = discount.getItemNamesInBasket();
        HashMap result = discount.getNumberOccurences(items);
        assertEquals(expected, result);
    }

    @Test
    public void canGetBogofMultiplierEven(){
        Discount discount = new Discount(basket, customer1);
        int expected = 3;
        int result = discount.bogofMultiplier(6);
        assertEquals(expected, result);
    }

    @Test
    public void canGetBogofMultiplierOdd(){
        Discount discount = new Discount(basket, customer1);
        int expected = 4;
        int result = discount.bogofMultiplier(7);
        assertEquals(expected, result);
    }
}
