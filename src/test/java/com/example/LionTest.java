package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Lion lion;

    @Test
    public void getKittensMockTest() throws Exception {
        lion.getKittens();
        Mockito.verify(lion, Mockito.times(1)).getKittens();
        Assert.assertEquals(0, lion.getKittens());
    }

    @Test
    public void doesHaveManeMockTest() throws Exception {
        lion.doesHaveMane();
        Mockito.verify(lion, Mockito.times(1)).doesHaveMane();
        Assert.assertFalse(lion.doesHaveMane());
    }


}
