package com.thoughtworks.movierental;

public class Regular extends PriceCode {

    public Regular() {
    }

    public double amount(int daysRented1) {
        double thisAmount = 0;
        thisAmount += 2;
        if (daysRented1 > 2)
            thisAmount += (daysRented1 - 2) * 1.5;
        return thisAmount;
    }
}