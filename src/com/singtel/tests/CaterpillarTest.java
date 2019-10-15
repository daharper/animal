package com.singtel.tests;

import com.singtel.Butterfly;
import com.singtel.Caterpillar;

import static org.junit.jupiter.api.Assertions.*;

class CaterpillarTest extends TestBase {
    @org.junit.jupiter.api.Test
    void walk() {
        Caterpillar caterpillar = new Caterpillar();
        caterpillar.walk();
        assertEquals("I am crawling\r\n", outContent.toString());
    }

    @org.junit.jupiter.api.Test
    void toButterfly() {
        Caterpillar caterpillar = new Caterpillar();
        Butterfly butterfly = caterpillar.metamorphose();
        butterfly.fly();
        assertEquals("I am flying\r\n", outContent.toString());
    }

    @org.junit.jupiter.api.Test
    void say() {
        Caterpillar caterpillar = new Caterpillar();
        caterpillar.say();
        assertEquals("Whistle, Crunch\r\n", outContent.toString());
    }
}

