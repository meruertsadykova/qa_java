package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FelineKittensParameterizedTest {

    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "1, 1",
            "3, 3",
            "10, 10"
    })
    void getKittensReturnsExpectedCount(int input, int expected) {
        Feline feline = new Feline();
        assertEquals(expected, feline.getKittens(input));
    }
}
