package com.singtel.tests;

import com.singtel.Rooster;

import static org.junit.jupiter.api.Assertions.*;

class RoosterTest extends TestBase {
    @org.junit.jupiter.api.Test
    void say() {
        Rooster rooster = Rooster.create();
        rooster.say();
        assertEquals("Cock-a-doodle-doo\r\n", outContent.toString());
    }

    @org.junit.jupiter.api.Test
    void walk() {
        Rooster rooster = Rooster.create();
        rooster.walk();
        assertEquals("I am walking\r\n", outContent.toString());
    }
}