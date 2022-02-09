package com.example.lesson6;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CustomMathTest {
    CustomMath math;

    @Before
    public void setup(){
        math = new CustomMath();
        System.out.println("Before");
    }

    @Test
    public void simpleAddCase(){
        assertEquals("10",math.add("5","5"));
        System.out.println("simpleAddCase");
    }

    @Test
    public void emptyFieldCase() {
        assertEquals("Empty Fields",math.add("",""));
        assertEquals("Empty Fields",math.mult("",""));
        assertEquals("Empty Fields",math.div("",""));
        assertEquals("Empty Fields",math.sub("",""));
        System.out.println("emptyFieldCase");
    }

    @Test
    public void lettersFieldsCase() {
        assertEquals("Wrong format",math.add("sdf","sdfds"));
        assertEquals("Wrong format",math.mult("sdf","sdfds"));
        assertEquals("Wrong format",math.sub("sdf","sdfds"));
        assertEquals("Wrong format",math.div("sdf","sdfds"));
        System.out.println("emptyFieldCase");
    }

    @Test
    public void oneFieldEmpty() {
        assertEquals("2",math.add("","2"));
        assertEquals("0",math.mult("","2"));
        assertEquals("-2",math.sub("","2"));
        assertEquals("0",math.div("","2"));
        System.out.println("oneFieldEmpty");
    }

    @Test
    public void spacedFieldsCase() {
        assertEquals("6",math.add("     2     ","    4     "));
        assertEquals("8",math.mult("     2     ","    4     "));
        assertEquals("3",math.div("     6     ","    2     "));
        assertEquals("-2",math.sub("     2     ","    4     "));
        System.out.println("spacedFieldsCase");
    }
    @Test
    public void divByZero(){
        assertEquals("by zero",math.div("2","0"));
        System.out.println("divByZero");
    }

    @Test
    public void multByZero() {
        assertEquals("0",math.mult("0","4"));
    }


    @Test
    public void reverseTWoWordsCase() {
        assertEquals("World Hello",math.reverseString("Hello World"));
    }

    @Test
    public void threeAndMoreWordsCase() {
        assertEquals("Five Four Three Two One",math.reverseString("One Two Three Four Five"));
    }

    @Test
    public void spacedWordsCase() {
        assertEquals("Five Four Three Two One",math.reverseString("     One     Two Three     Four Five   "));
    }

    @Test
    public void emptyStringCase() {
        assertEquals("",math.reverseString(""));
        System.out.println("emptyStringCase");
    }

    @Test
    public void commaReversedCase() {
        assertEquals("Five,Four,Three,Two,One",math.reverseString("One,Two,Three,Four,Five"));
    }

    @Test
    public void oneWordCase() {
        assertEquals("One",math.reverseString("One"));
        System.out.println("oneWordCase");
    }
    @After
    public void tearDown() {
        math = null;
        System.out.println("After");
    }

}
