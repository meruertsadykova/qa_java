package com.example;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class FelineTest {

    Feline feline = new Feline();

    @Test
    void eatMeatReturnsCorrectFoodTest() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, feline.eatMeat());
    }

    @Test
    void getFamilyReturnsCorrectValueTest() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    void getKittensWithArgumentTest() {
        assertEquals(5, feline.getKittens(5));
    }

    @Test
    void getKittensReturnsDefault() {
        assertEquals(1, feline.getKittens());  // feline.getKittens() method test
    }
}
