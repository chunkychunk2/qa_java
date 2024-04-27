package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;


    @Test
    public void getKittensMockTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самец", feline);
        Assert.assertEquals(1, lion.getKittens());
    }

    @Test
    public void doesHaveFoodMockTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самка", feline);
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }

    @Test
    public void getSexMockTest() throws Exception {
            Lion lion = new Lion("Самка", feline);
            Assert.assertFalse(lion.doesHaveMane());
    }

}
