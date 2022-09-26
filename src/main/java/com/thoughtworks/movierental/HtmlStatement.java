package com.thoughtworks.movierental;

import java.util.List;

public class HtmlStatement {
    public HtmlStatement() {
    }

    String statement(String customerName, Rentals rentals) {
        return htmlHeader(customerName) +
                htmlBody(rentals) +
                htmlFooter(rentals.totalAmount(), rentals.frequentRenterPoints());
    }

    String htmlFooter(double totalAmount, int frequentRenterPoints) {
        String footer = " <br>Amount owed is <b>" + totalAmount + "</b> <br>" +
                "You earned <b>" + frequentRenterPoints + "</b> frequent renter points <br>" +
                "</body></html>";
        return footer;
    }

    String htmlHeader(String customerName) {
        String header = "<html><body>" +
                "<h1>Rental Record for <b>" + customerName + "</b> </h1>";
        return header;
    }

    String htmlBody(List<Rental> rentals) {
        String rentalsHtmlOutput = "";
        for (Rental rental : rentals) {
            rentalsHtmlOutput += "<br>" + rental.getMovie().getTitle() + "  " +
                    rental.amount();
        }
        return rentalsHtmlOutput;
    }
}