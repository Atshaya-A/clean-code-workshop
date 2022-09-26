package com.thoughtworks.movierental;

public class NewRelease extends PriceCode {

    public NewRelease() {
    }

    public double amount(int daysRented) {
        double amount = 0;
        amount += daysRented * 3;
        return amount;
    }
}