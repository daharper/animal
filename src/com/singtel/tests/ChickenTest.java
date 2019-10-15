package com.singtel.tests;

import com.singtel.Chicken;

import static org.junit.jupiter.api.Assertions.*;

class ChickenTest extends TestBase {
    @org.junit.jupiter.api.Test
    void say() {
        Chicken chicken = new Chicken();
        chicken.say();
        assertEquals("Cluck, cluck\r\n", outContent.toString());
    }
}