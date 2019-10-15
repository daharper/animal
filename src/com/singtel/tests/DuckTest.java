package com.singtel.tests;

import com.singtel.Duck;

import static org.junit.jupiter.api.Assertions.*;

class DuckTest extends TestBase {
    @org.junit.jupiter.api.Test
    void say() {
        Duck duck = new Duck();
        duck.say();
        assertEquals("Quack, quack\r\n", outContent.toString());
    }

    @org.junit.jupiter.api.Test
    void swim() {
        Duck duck = new Duck();
        duck.swim();
        assertEquals("I am swimming\r\n", outContent.toString());
    }

    @org.junit.jupiter.api.Test
    void fly() {
        Duck duck = new Duck();
        duck.fly();
        assertEquals("I am flying\r\n", outContent.toString());
    }
}