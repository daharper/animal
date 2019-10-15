package com.singtel.tests;

import com.singtel.Bird;

import static org.junit.jupiter.api.Assertions.*;

class BirdTest extends TestBase {
    @org.junit.jupiter.api.Test
    void sing() {
        Bird bird = new Bird();
        bird.sing();
        assertEquals("I am singing\r\n", outContent.toString());
    }

    @org.junit.jupiter.api.Test
    void walk() {
        Bird bird = new Bird();
        bird.walk();
        assertEquals("I am walking\r\n", outContent.toString());
    }
}
