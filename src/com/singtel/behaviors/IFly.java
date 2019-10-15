package com.singtel.behaviors;

public interface IFly {
    default void fly() {
        System.out.println("I am flying");
    }
}
