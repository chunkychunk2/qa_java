package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;

    @Test
    public void getSoundTest() throws Exception {
        Cat cat = new Cat(feline);
        Assert.assertEquals("Мяу",cat.getSound());
    }

    @Test
    public void getFoodTest() throws Exception {
        Cat cat = new Cat(feline);
        Assert.assertTrue(cat.getFood().isEmpty());
    }
}
