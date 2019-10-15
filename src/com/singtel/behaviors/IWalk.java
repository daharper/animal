package com.singtel.behaviors;

public interface IWalk {
    default void walk() {
        System.out.println("I am walking");
    }
}