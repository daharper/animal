package com.singtel.tests;

import com.singtel.*;

import static org.junit.jupiter.api.Assertions.*;

class ParrotTest extends TestBase {
    @org.junit.jupiter.api.Test
    void parrotSay() {
        Parrot parrot = new Parrot();

        parrot.setParrotedSpeaker(Rooster.create());
        parrot.say();
        parrot.setParrotedSpeaker(new Dog());
        parrot.say();
        parrot.setParrotedSpeaker(new Cat());
        parrot.say();
        parrot.setParrotedSpeaker(new Duck());
        parrot.say();
        parrot.setParrotedSpeaker(new Phone());
        parrot.say();

        assertEquals("Cock-a-doodle-doo\r\nWoof, woof\r\nMeow\r\nQuack, quack\r\nring, ring\r\n", outContent.toString());
    }

    @org.junit.jupiter.api.Test
    void fly() {
        Parrot parrot = new Parrot();
        parrot.fly();
        assertEquals("I am flying\r\n", outContent.toString());
    }
}