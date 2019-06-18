package com.danjerous;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("[Dog] " + getName() + " eats bone.");
    }

    @Override
    public void breathe() {
        System.out.println("[Dog] " + getName() + " breathes fast.");
    }
}
