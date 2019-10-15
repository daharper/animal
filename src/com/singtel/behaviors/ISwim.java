package com.singtel.behaviors;

public interface ISwim {
    default void swim() {
        System.out.println("I am swimming");
    }
}
