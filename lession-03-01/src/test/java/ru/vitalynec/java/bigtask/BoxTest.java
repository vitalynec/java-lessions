package ru.vitalynec.java.bigtask;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.vitalynec.java.bigtask.fruit.Apple;
import ru.vitalynec.java.bigtask.fruit.Orange;

import static org.junit.Assert.assertEquals;

public class BoxTest {

    Box<Apple> appleBox;
    Box<Apple> otherAppleBox;
    Box<Orange> orangeBox;

    @Before
    public void init() {
        appleBox = new Box<>();
        appleBox.putFriut(new Apple());
        appleBox.putFriut(new Apple());
        appleBox.putFriut(new Apple());
        appleBox.putFriut(new Apple());

        orangeBox = new Box<>();
        orangeBox.putFriut(new Orange());
        orangeBox.putFriut(new Orange());
        orangeBox.putFriut(new Orange());
        orangeBox.putFriut(new Orange());
        orangeBox.putFriut(new Orange());
    }

    @Test
    public void getWeight() {
        assertEquals(4f, appleBox.getWeight(), 0.0);
        assertEquals(7.5f, orangeBox.getWeight(), 0.0);
    }

    @Test
    public void compare() {
        Assert.assertFalse(appleBox.compare(orangeBox));
        Assert.assertFalse(orangeBox.compare(appleBox));

        Box<Apple> appleBoxCopy = appleBox;
        Assert.assertTrue(appleBox.compare(appleBoxCopy));
    }

    @Test
    public void replace() {
        otherAppleBox = new Box<>();
        otherAppleBox.putFriut(new Apple());
        otherAppleBox.putFriut(new Apple());

        otherAppleBox.replace(appleBox);

        assertEquals(0f, otherAppleBox.getWeight(), 0.0);
        assertEquals(6f, appleBox.getWeight(), 0.0);
    }
}