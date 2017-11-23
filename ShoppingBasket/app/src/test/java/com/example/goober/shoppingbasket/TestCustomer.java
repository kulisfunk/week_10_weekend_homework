package com.example.goober.shoppingbasket;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by goober on 23/11/2017.
 */

public class TestCustomer {

    @Test

    public void testCustomerHasName(){
        Customer customer1 = new Customer("Martin", true);
        String result = customer1.getName();
        assertEquals("Martin", result);
    }
    @Test

    public void testCustomerHasDiscountCard(){
        Customer customer1 = new Customer("Martin", true);
        Boolean result = customer1.getDiscountCard();
        assertEquals(true, result);
    }
    @Test

    public void testCustomerDoesntHaveDiscountCard(){
        Customer customer1 = new Customer("Martin", false);
        Boolean result = customer1.getDiscountCard();
        assertEquals(false, result);
    }
}
