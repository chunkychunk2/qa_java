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

@RunWith(Parameterized.class)
public class LionParamTest {

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    private String sex;

    public LionParamTest(String sex) {
        this.sex = sex;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{
                {"Самец"},
                {"самей"},
                {"Самка"}
        };
    }

    @Mock
    Feline feline;

    @Test
    public void getFoodMockTest() throws Exception {
        try {
            Lion lion = new Lion(sex, feline);

        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        System.out.println(lion.getFood());
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"),lion.getFood());
        }catch (Exception e){
            Assert.assertEquals("Используйте допустимые значения пола животного - самей или самка",e.getMessage());
        }
    }



}
