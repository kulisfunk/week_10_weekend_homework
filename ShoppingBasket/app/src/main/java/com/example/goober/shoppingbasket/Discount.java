package com.example.goober.shoppingbasket;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


/**
 * Created by goober on 23/11/2017.
 */

public class Discount {
    private ShoppingBasket newBasket;
    private HashMap basketSorted;
    private double bogofValue;
    private double maxValue;
    private double finalValue;
    private Customer customer;

    public Discount(ShoppingBasket newBasket, Customer customer) {
        this.newBasket = newBasket;
        this.customer = customer;
    }


    public ArrayList<String> getItemNamesInBasket(){
        ArrayList<String> contents = new ArrayList();

        for (int index = 0;  index < newBasket.getSizeOfBasket(); index++)
            contents.add(newBasket.getNameOfItemInBasket(index));

        return contents;
    }

    public HashMap getNumberOccurences(ArrayList contents){
        basketSorted = new HashMap();

        Set<String> uniqueSet = new HashSet<String>(contents);
        for (String name : uniqueSet) {

          basketSorted.put(name, Collections.frequency(contents, name));
        }
        return basketSorted;
    }

    public int bogofMultiplier(int value){
        int remainder = value%2;
        if (remainder > 0){
            int weight = ((value -1) /2) + 1;
            return weight;

        }else{
            return value/2;
        }
    }


    public double bogofDiscount(HashMap basketSorted){
        bogofValue = 0.0;
        Map<String, Integer> map = basketSorted;
        for (String key : map.keySet() ) {
            int value = map.get(key);
            int multi = bogofMultiplier(value);
            Items single = Items.valueOf(key);
            double bogofSingle = single.getValue();
            bogofValue += bogofSingle * multi;
        }
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
