package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AlexLionTest {

    private Feline mockFeline;
    private AlexLion alex;

    @BeforeEach
    void setUp() throws Exception {
        mockFeline = Mockito.mock(Feline.class);
        alex = new AlexLion(mockFeline);
    }

    @Test
    void alexIsAlwaysMale() {
        assertTrue(alex.doesHaveMane());
    }

    @Test
    void alexHasNoKittens() {
        assertEquals(0, alex.getKittens());
    }

    @Test
    void alexReturnsListOfFriends() {
        List<String> expected = List.of("Марти", "Глория", "Мелман");
        assertEquals(expected, alex.getFriends());
    }

    @Test
    void alexLivesInZoo() {
        assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }

    @Test
    void alexCanGetFoodFromFeline() throws Exception {
        List<String> food = List.of("Рыба", "Птицы");
        Mockito.when(mockFeline.getFood("Хищник")).thenReturn(food);
        assertEquals(food, alex.getFood());
    }
}
