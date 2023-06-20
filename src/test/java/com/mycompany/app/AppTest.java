package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testSayHello() {
        App app = new App();
        assertEquals("Hello World!", app.sayHello());
    }

    @Test
    public void testIsEven() {
        App app = new App();
        assertTrue(app.isEven(2));
        assertFalse(app.isEven(3));
    }

    @Test
    public void testIsNotEven() {
        App app = new App();
        assertFalse(app.isEven(1));
        assertTrue(app.isEven(4));
    }

    @Test
    public void testSayHelloIsNotNull() {
        App app = new App();
        assertNotNull(app.sayHello());
    }

    @Test
    public void testSayHelloIsNotEqual() {
        App app = new App();
        assertNotEquals("Bye World!", app.sayHello());
    }

    @Test
    public void testIsEvenWithZero() {
        App app = new App();
        assertTrue(app.isEven(0));
    }
}
