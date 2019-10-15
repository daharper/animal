package com.singtel;

public class Shark extends Fish{
    public Shark() {
        super("Large and grey");
    }

    public void eat(Fish fish) {
        System.out.println("Yum!");
    }
}
