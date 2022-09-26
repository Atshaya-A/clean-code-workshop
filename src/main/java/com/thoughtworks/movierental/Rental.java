package com.thoughtworks.movierental;

public class Rental {
    private final Regular regular = new Regular();
    private final NewRelease newRelease = new NewRelease();
    private final Childrens childrens = new Childrens();
    private final UltraHd ultraHd = new UltraHd();
    private int daysRented;
    private Movie movie;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    double amount() {
        return create(getMovie().getPriceCode()).amount(getDaysRented());
    }

    public PriceCode create(int priceCode){
        switch (priceCode) {
            case Movie.REGULAR:
                return new Regular();
            case Movie.NEW_RELEASE:
                return new NewRelease();
            case Movie.CHILDRENS:
                return new Childrens();
            case Movie.ULTRA_HD:
                return new UltraHd();
            default:
                throw new RuntimeException("Invalid Price code");
        }
    }
}