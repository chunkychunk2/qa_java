package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class LionTest {

    @Test
    public void getKittensTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самец", feline);
        Assert.assertEquals(1, lion.getKittens());
    }

    @Test
    public void doesHaveFoodTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самка", feline);
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }

    @Test
    public void unknownSexTest() {
        try {
            Feline feline = new Feline();
            Lion lion = new Lion("тест", feline);
            lion.doesHaveMane();
        } catch (Exception e) {
            Assert.assertEquals("Используйте допустимые значения пола животного - самей или самка", e.getMessage());
        }

    }
}
