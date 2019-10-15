package com.singtel;

import com.singtel.behaviors.ISing;

public class Bird extends Animal implements ISing {
    void fly() {
        System.out.println("I am flying");
    }
}
