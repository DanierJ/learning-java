package com.danjerous;

public abstract class Bird extends Animal implements CanFly{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("[Bird] "+ getName() + " eats worms.");
    }

    @Override
    public void breathe() {
        System.out.println("[Bird] "+ getName() + " breathes slowly.");
    }

    @Override
    public void fly() {
        System.out.println(getName()+ " is flapping its wings");
    }
}
