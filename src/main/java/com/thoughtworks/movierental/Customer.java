package com.thoughtworks.movierental;

public class Customer {
    private final String name;
    private final TextStatement textStatement = new TextStatement();
    private final HtmlStatement htmlStatement = new HtmlStatement();
    private final Rentals rentals = new Rentals();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        return textStatement.statement(getName(), rentals);
    }

    public String htmlStatement() {
        return htmlStatement.statement(getName(), rentals);
    }
}