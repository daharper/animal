package com.singtel;

import com.singtel.behaviors.IFly;
import com.singtel.behaviors.ISay;
import com.singtel.behaviors.ISwim;

public class Duck extends Bird implements ISay, ISwim, IFly {
    @Override
    public void say() {
        System.out.println("Quack, quack");
    }
}
