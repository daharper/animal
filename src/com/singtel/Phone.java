package com.singtel;

import com.singtel.behaviors.IMakeSound;

public class Phone implements IMakeSound {
    @Override
    public void makeSound() {
        System.out.println("ring, ring");
    }
}
