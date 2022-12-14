package com.thoughtworks.movierental;

public class Childrens extends PriceCode {

    public Childrens() {
    }

    public double amount(int daysRented) {
        double amount = 0;
        amount += 1.5;
        if (daysRented > 3)
            amount += (daysRented - 3) * 1.5;
        return amount;
    }
}