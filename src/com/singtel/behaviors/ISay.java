package com.singtel.behaviors;

public interface ISay extends IMakeSound {
    @Override
    default void makeSound() {
        say();
    }

    default void say() {
        System.out.println("I am vocalizing");
    }
}
