package com.singtel;

import com.singtel.behaviors.IFly;
import com.singtel.behaviors.IMakeSound;

public class Parrot extends Bird implements IFly {
    private IMakeSound parrotedNoise;

    public void setParrotedSpeaker(IMakeSound parrotedNoise) {
        this.parrotedNoise = parrotedNoise;
    }

    @Override
    public void say() {
        parrotedNoise.makeSound();
    }
}