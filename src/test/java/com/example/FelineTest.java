package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

public class FelineTest {

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    Animal animal;

    @Test
    public void eatMeatMockTest() throws Exception {
        Feline feline = new Feline();
        Mockito.when(animal.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getFelineKittensMockTest() throws Exception {
        Feline felineNotMock = new Feline();
        Assert.assertEquals(1, felineNotMock.getKittens());
    }

    @Test
    public void getFelineFamilyMockTest() {
        Feline felineNotMock = new Feline();
        Assert.assertEquals("Кошачьи",felineNotMock.getFamily());
    }
}
