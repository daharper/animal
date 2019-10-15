package com.singtel.behaviors;

public interface ISing {
    default void sing() {
        System.out.println("I am singing");
    }
}