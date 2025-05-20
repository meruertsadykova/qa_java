package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CatTest {

    private Feline feline;

    @BeforeEach
    public void setUp() {
        feline = Mockito.mock(Feline.class);
    }

    @Test
    void getSoundReturnsMeowTest() {
        Cat cat = new Cat(feline);
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    void getFoodReturnsPredatorFood2Test() throws Exception {
        List<String> food = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(food);

        Cat cat = new Cat(feline);
        assertEquals(food, cat.getFood());
    }

}
