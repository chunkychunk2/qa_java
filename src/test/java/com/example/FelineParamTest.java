package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

@RunWith(Parameterized.class)
public class FelineParamTest {

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    private String animalKind;
    private int catCount;

    public FelineParamTest(String animalKind, int catCount) {
        this.animalKind = animalKind;
        this.catCount = catCount;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{
                {"Травоядное", 1},
                {"Хищник", 2}
        };
    }


    @Mock
    Feline feline;

    @Mock
    Animal animal;


    @Test
    public void getFelineFoodMockTest() throws Exception {
        feline.getFood(animalKind);
        Mockito.verify(feline, Mockito.times(1)).getFood(animalKind);
        Assert.assertTrue(feline.getFood(animalKind).isEmpty());
    }

    @Test
    public void getFelineKittensWithArgsMockTest() throws Exception {
        feline.getKittens(catCount);
        Mockito.verify(feline, Mockito.times(1)).getKittens(catCount);
        Assert.assertEquals(0, feline.getKittens(catCount));
    }
}
