package com.singtel.tests;

import com.singtel.ClownFish;

import static org.junit.jupiter.api.Assertions.*;

class ClownFishTest extends TestBase {
    @org.junit.jupiter.api.Test
    void swim() {
        ClownFish fish = new ClownFish();
        fish.swim();
        assertEquals("I am swimming\r\n", outContent.toString());
    }

    @org.junit.jupiter.api.Test
    void tellJoke() {
        ClownFish fish = new ClownFish();
        fish.tellJoke();
        assertEquals("Laughing Yoga\r\n", outContent.toString());
    }

    @org.junit.jupiter.api.Test
    void describe() {
        ClownFish fish = new ClownFish();
        fish.getDescription();
        assertEquals("Small and colourful (orange)\r\n", outContent.toString());
    }
}