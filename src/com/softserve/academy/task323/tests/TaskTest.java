package com.softserve.academy.task323.tests;

import com.softserve.academy.task323.task.Task;
import org.junit.Assert;
import org.junit.Test;

public class TaskTest {

    private Task task = new Task();

    @Test
    public void runSimpleTest() {

        int[] rez1 = task.run(4);
        int[] expected = {2,0,0,0};

        Assert.assertArrayEquals(rez1,expected);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithInvalidParameter()
    {
        task.run(-2);
    }

    @Test
    public void testWithZero()
    {
        int[] rez = task.run(0);
        int[] expected = {0,0,0,0};

        Assert.assertArrayEquals(rez,expected);
    }

    @Test
    public void testWithTwoSquareRoot()
    {
        int[] rez = task.run(5);
        int[] expected = {2,1,0,0};

        Assert.assertArrayEquals(rez,expected);
    }

    @Test
    public void testWithThreeSquareRoot()
    {
        int[] rez = task.run(11);
        int[] expected = {3,1,1,0};

        Assert.assertArrayEquals(rez,expected);
    }

    @Test
    public void testWithFourSquareRoot()
    {
        int[] rez = task.run(60);
        int[] expected = {7,3,1,1};

        Assert.assertArrayEquals(rez,expected);
    }


}
