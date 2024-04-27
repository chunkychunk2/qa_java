package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;


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
                {"Самка", false}
        };
    }

    @Mock
    Feline feline;

    @Mock
    Lion mockLion;

    @Test
    public void haveMineMockTest() throws Exception {
        Lion lion = new Lion(sex, feline);
        Mockito.when(mockLion.doesHaveMane()).thenReturn(mane);
        Assert.assertEquals(mane, lion.doesHaveMane());
    }
}
