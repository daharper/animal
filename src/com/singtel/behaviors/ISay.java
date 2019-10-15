package com.singtel.behaviors;

public interface ISay {
    default void say() {
        System.out.println("I am vocalizing");
    }
}
