package com.singtel;

import com.singtel.behaviors.ISay;
import com.singtel.behaviors.IWalk;

public class Dog implements ISay, IWalk {
    @Override
    public void say() {
        System.out.println("Woof, woof");
    }
}
