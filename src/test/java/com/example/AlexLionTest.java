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
    void alexIsAlwaysMaleTest() {
        assertTrue(alex.doesHaveMane());
    }

    @Test
    void alexHasNoKittensTest() {
        assertEquals(0, alex.getKittens());
    }

    @Test
    void alexReturnsListOfFriendsTest() {
        List<String> expected = List.of("Марти", "Глория", "Мелман");
        assertEquals(expected, alex.getFriends());
    }

    @Test
    void alexLivesInZooTest() {
        assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }

    @Test
    void alexCanGetFoodFromFelineTest() throws Exception {
        List<String> food = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(mockFeline.getFood("Хищник")).thenReturn(food);
        assertEquals(food, alex.getFood());
    }
}
