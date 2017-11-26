package com.example.goober.shoppingbasket;

import static android.R.attr.value;

/**
 * Created by goober on 23/11/2017.
 */

public class Discount {
    private ShoppingBasket newBasket;
    Double bogofValue;
    Double maxValue;
    Double finalValue;
    private double basketValue;
    private Customer customer;

    public Discount(ShoppingBasket newBasket, Customer customer) {
        this.newBasket = newBasket;
        this.customer = customer;
        basketValue = newBasket.getBasketBaseValue();
    }

//    return value of basket taking into account any buy-one-get-one-free discount
    public double bogof(){
        bogofValue = basketValue;
        return bogofValue;
    }

    public double maxValueDiscount(){
        if (bogofValue >= 2000) {
            maxValue = (bogofValue * (90.00 / 100.00));
            return maxValue;
        }else{
            maxValue = bogofValue;
            return maxValue;
        }
    }


    public double customerCardDiscount(){
        if (customer.getDiscountCard() == true) {

            finalValue = (maxValue * (98.00 / 100.00));
            return finalValue;
        }else{
            return maxValue;
        }
    }
}
