package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {


    @Test
    public void getKittensMockTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самец", feline);
        Assert.assertEquals(1, lion.getKittens());
    }

    @Test
    public void doesHaveManeMockTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самка", feline);
        Assert.assertFalse(lion.doesHaveMane());
    }


}
