package com.singtel.tests;

import com.singtel.ClownFish;
import com.singtel.Shark;

import static org.junit.jupiter.api.Assertions.*;

class SharkTest extends TestBase {
    @org.junit.jupiter.api.Test
    void swim() {
        Shark shark = new Shark();
        shark.swim();
        assertEquals("I am swimming\r\n", outContent.toString());
    }

    @org.junit.jupiter.api.Test
    void eatFish() {
        Shark shark = new Shark();
        shark.eat(new ClownFish());
        assertEquals("Yum!\r\n", outContent.toString());
    }

    @org.junit.jupiter.api.Test
    void describe() {
        Shark shark = new Shark();
        shark.getDescription();
        assertEquals("Large and grey\r\n", outContent.toString());
    }
}