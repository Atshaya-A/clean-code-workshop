package com.thoughtworks.movierental;

public class UltraHd extends PriceCode {

    public UltraHd() {
    }

    public double amount(int daysRented) {
        double amount = 0;
        amount += daysRented * 4;
        return amount;
    }
}