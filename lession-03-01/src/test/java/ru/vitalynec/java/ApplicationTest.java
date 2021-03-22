package ru.vitalynec.java;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class ApplicationTest {

    Object[] testArray;

    @Before
    public void init() {
        testArray = new Integer[]{1, 2, 3};
    }

    @Test
    public void swap() {

        Application.swap(testArray, 0, 2);
        Assert.assertArrayEquals(new Integer[]{3, 2, 1}, testArray);
    }

    @Test
    public void toArrayList() {
        Assert.assertTrue(Application.toArrayList(testArray) instanceof List);
        Assert.assertEquals(Application.toArrayList(testArray).size(), testArray.length);
        Assert.assertSame(Application.toArrayList(testArray).get(0), testArray[0]);
        Assert.assertSame(Application.toArrayList(testArray).get(1), testArray[1]);
        Assert.assertSame(Application.toArrayList(testArray).get(2), testArray[2]);
    }
}