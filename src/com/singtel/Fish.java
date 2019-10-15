package com.singtel;

import com.singtel.behaviors.ISwim;

public class Fish implements ISwim {
    private final String description;

    Fish(String description) {
        this.description = description;
    }

    public void getDescription() {
        System.out.println(description);
    }
}
