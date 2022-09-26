package com.thoughtworks.movierental;

import java.util.List;

public class TextStatement {
    public TextStatement() {
    }

    String statement(String customerName, Rentals rentals) {
        return header(customerName) + body(rentals) + footer(rentals.totalAmount(), rentals.frequentRenterPoints());
    }

    String body(List<Rental> rentals) {
        String result = "";
        for (Rental rental : rentals) {
            double figures = rental.amount();
            result += "\t" + rental.getMovie().getTitle() + "\t" +
                    figures + "\n";
        }
        return result;
    }

    String header(String name) {
        return "Rental Record for " + name + "\n";
    }

    String footer(double totalAmount, int frequentRenterPoints) {
        return ("Amount owed is " + totalAmount + "\n") + ("You earned " + frequentRenterPoints
                + " frequent renter points");
    }
}