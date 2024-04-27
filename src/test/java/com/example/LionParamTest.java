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
public class LionParamTest {

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    private String sex;

    private boolean mane;

    public LionParamTest(String sex, boolean mane) {
        this.sex = sex;
        this.mane = mane;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{
                {"Самец", true},
                {"самей", false},
                {"Самка", false}
        };
    }

    @Mock
    Feline feline;

    @Test
    public void getSexMockTest() throws Exception {
        try {
            Lion lion = new Lion(sex, feline);
            Assert.assertEquals(mane, lion.doesHaveMane());
        } catch (Exception e) {
            Assert.assertEquals("Используйте допустимые значения пола животного - самей или самка", e.getMessage());
        }
    }

    @Test
    public void getFoodMockTest() throws Exception {
            Lion lion = new Lion("Самец", feline);
            Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
            Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }


}
