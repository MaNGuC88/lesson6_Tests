package com.example.lesson6;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MathTest {

    private Math math;

    @Before
    public void setUp() {
        math = new Math();
        System.out.println("Before");
    }

    @Test
    public void add() {
        assertEquals(7, math.add(2,5));
        System.out.println("add");
    }

    @Test
    public void sub() {
        assertEquals(5, math.sub(10,5));
        System.out.println("sub");
    }

    @Test
    public void divByZeroB() {
        assertEquals(0, math.div(5,0));
        System.out.println("divByZero");
    }

    @Test
    public void divByZeroA() {
        assertEquals(0, math.div(0,2));
        System.out.println("divByZero");
    }

    @Test
    public void reverseTwoWords() {
        assertEquals("World Hello", math.reverse("Hello World"));
        System.out.println("reverseTwoWords");
    }

    @Test
    public void reverseThreeWords() {
        assertEquals("Three Two One", math.reverse("One Two Three"));
        System.out.println("reverseThreeWords");
    }

    @Test
    public void reverseFourWords() {
        assertEquals("Four Three Two One", math.reverse("One Two Three Four"));
        System.out.println("reverseFourWords");
    }

    @Test
    public void reverseCommaWords() {
        assertEquals("Three Two One", math.reverse("One,Two,Three"));
        System.out.println("reverseTwoWords");
    }

    @Test
    public void reverseEmptyWords() {
        assertEquals("", math.reverse(""));
        System.out.println("reverseEmptyWords");
    }

    @Test
    public void reverseDoubleSpaceWords() {
        assertEquals("Two One", math.reverse("One  Two"));
        System.out.println("reverseDoubleSpaceWords");
    }

    @After
    public void tearDown() {
        math = null;
        System.out.println("After");
    }

}
