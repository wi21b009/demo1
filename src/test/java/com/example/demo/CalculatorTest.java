package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    //einfach im Calculator > rechte Taste > generate > Test... (und nicht verändern)

    Calculator calculator = new Calculator();

    @Test
    void addTest1() { //klassischer Test hat keinen Input (= leere Klammern) und gibt nichts zurück (= void)
        //Arrange > input setzten und auch den Wert, den ich erwarte
        int a = 5;
        int b = 6;

        int expected = 11;

        //Act > hier ist der Code, welcher ausgeführt wird
        int result = calculator.add(a,b);

        //Assert > vergleichen von erwarteten und tatsächlichen Werten
        assertEquals(expected, result);
    }

    @Test
    void addTest2() {
        assertEquals(50, calculator.add( 10,40));
    }

    @Test
    void multTest() {
        assertEquals(27, calculator.mult(3,9));
    }

    @Test
    void subTest() {
        assertEquals(13, calculator.sub(20,7));
    }

    @Test
    void divTest1() {
        assertEquals(6, calculator.div(6,1));
    }

    @Test
    void divTest() { //Test auf Exceptions
        assertThrows(ArithmeticException.class, () -> {
            calculator.div(6,0);
        });
    }

}