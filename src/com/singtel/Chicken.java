package com.singtel;

import com.singtel.behaviors.ISay;

public class Chicken extends Bird implements ISay {
    @Override
    public void say() {
        System.out.println("Cluck, cluck");
    }
}
