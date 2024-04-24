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

import java.util.List;

public class FelineTest {

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }


    @Mock
    Animal animal;


    @Mock
    Feline feline;
    @Test
    public void eatMeatMockTest() throws Exception {
        Feline feline = new Feline();
        Mockito.when(animal.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getFelineKittensMockTest() throws Exception {
        Feline felineNotMock = new Feline();
        Mockito.when(feline.getKittens(1)).thenReturn(1);
        Assert.assertEquals(1, felineNotMock.getKittens());
    }

    @Test
    public void getFelineFamilyMockTest() {
        Feline felineNotMock = new Feline();
        Mockito.when(feline.getFamily()).thenReturn("Кошачьи");
        Assert.assertEquals("Кошачьи",felineNotMock.getFamily());
    }
}
