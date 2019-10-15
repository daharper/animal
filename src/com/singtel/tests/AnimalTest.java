package com.singtel.tests;

import com.singtel.Animal;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest extends TestBase {
    @org.junit.jupiter.api.Test
    void walk() {
        Animal animal = new Animal();
        animal.walk();
        assertEquals("I am walking\r\n", outContent.toString());
    }
}