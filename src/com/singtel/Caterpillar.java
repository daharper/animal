package com.singtel;

import com.singtel.behaviors.ISay;
import com.singtel.behaviors.IWalk;

public class Caterpillar implements IWalk, ISay {
    @Override
    public void walk() {
        System.out.println("I am crawling");
    }

    public Butterfly metamorphose() {
        return new Butterfly(this);
    }

    @Override
    public void say() {
        System.out.println("Whistle, Crunch");
    }
}
