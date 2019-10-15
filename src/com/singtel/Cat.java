package com.singtel;

import com.singtel.behaviors.ISay;
import com.singtel.behaviors.IWalk;

public class Cat implements ISay, IWalk {
    @Override
    public void say() {
        System.out.println("Meow");
    }
}
