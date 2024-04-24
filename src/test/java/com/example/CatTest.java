package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;


public class CatTest {
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    Feline feline;

    @Test
    public void getSoundTest() throws Exception {
        Cat cat = new Cat(feline);
       // Mockito.verify(cat, Mockito.times(1)).getSound();
        Assert.assertEquals("Мяу",cat.getSound());
    }

    @Test
    public void getFoodTest() throws Exception {
        Cat cat = new Cat(feline);
        // Mockito.verify(cat, Mockito.times(1)).getSound();
        Assert.assertTrue(cat.getFood().isEmpty());
    }
}
