package com.singtel.tests;

import com.singtel.Butterfly;

import static org.junit.jupiter.api.Assertions.*;

class ButterflyTest extends TestBase {
    @org.junit.jupiter.api.Test
    void fly() {
        Butterfly butterfly = new Butterfly();
        butterfly.fly();
        assertEquals("I am flying\r\n", outContent.toString());
    }
}
