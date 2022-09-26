package com.thoughtworks.movierental;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RentalTest {

    @Test
    void amount() {
        Rental movie1 = new Rental(new Movie("Hulk", Movie.ULTRA_HD), 4);
        assertEquals(16, movie1.amount());
    }
}