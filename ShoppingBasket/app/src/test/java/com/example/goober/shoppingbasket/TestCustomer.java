package com.example.goober.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by goober on 23/11/2017.
 */

public class TestCustomer {

    Customer customer1;
    Customer customer2;

    @Before
    public void setup(){
        customer1 = new Customer("Martin", true);
        customer2 = new Customer("Martin", false);
    }

    @Test

    public void testCustomerHasName(){
        String result = customer1.getName();
        assertEquals("Martin", result);
    }
    @Test

    public void testCustomerHasDiscountCard(){
        Boolean result = customer1.getDiscountCard();
        assertEquals(true, result);
    }
    @Test

    public void testCustomerDoesntHaveDiscountCard(){
        Boolean result = customer2.getDiscountCard();
        assertEquals(false, result);
    }
}
