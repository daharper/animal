package com.singtel.tests;

import com.singtel.Dolphin;

import static org.junit.jupiter.api.Assertions.*;

class DolphinTest extends TestBase {
    @org.junit.jupiter.api.Test
    void swim() {
        Dolphin dolphin = new Dolphin();
        dolphin.swim();
        assertEquals("I am swimming\r\n", outContent.toString());
    }
}