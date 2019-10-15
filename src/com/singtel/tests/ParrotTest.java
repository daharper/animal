package com.singtel.tests;

import com.singtel.*;

import static org.junit.jupiter.api.Assertions.*;

class ParrotTest extends TestBase {
    @org.junit.jupiter.api.Test
    void parrotSay() {
        Parrot parrot = new Parrot();

        parrot.setParrotedNoise(Rooster.create());
        parrot.makeSound();
        parrot.setParrotedNoise(new Dog());
        parrot.makeSound();
        parrot.setParrotedNoise(new Cat());
        parrot.makeSound();
        parrot.setParrotedNoise(new Duck());
        parrot.makeSound();
        parrot.setParrotedNoise(new Phone());
        parrot.makeSound();

        assertEquals("Cock-a-doodle-doo\r\nWoof, woof\r\nMeow\r\nQuack, quack\r\nring, ring\r\n", outContent.toString());
    }

    @org.junit.jupiter.api.Test
    void fly() {
        Parrot parrot = new Parrot();
        parrot.fly();
        assertEquals("I am flying\r\n", outContent.toString());
    }
}