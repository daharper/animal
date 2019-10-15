package com.singtel;

// As requested, avoid inheriting from chicken, used a proxy pattern
// Any chicken like behavior can be proxied to the private instance

public class Rooster extends Bird {
    private final Chicken chicken;

    private Rooster(Chicken chicken) {
        this.chicken = chicken;
    }

    @Override
    public void say() {
        System.out.println("Cock-a-doodle-doo");
    }

    @Override
    public  void walk() {
        chicken.walk();
    }

    public static Rooster create() {
        return new Rooster(new Chicken());
    }
}
