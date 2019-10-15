package com.singtel;

import com.singtel.behaviors.IFly;
import com.singtel.behaviors.ISay;

public class Parrot extends Bird implements ISay, IFly {
    private ISay parrotedSpeaker;

    public void setParrotedSpeaker(ISay parrotedSpeaker) {
        this.parrotedSpeaker = parrotedSpeaker;
    }

    @Override
    public void say() {
        parrotedSpeaker.say();
    }
}