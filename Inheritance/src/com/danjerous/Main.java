package com.danjerous;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Hayate", 35, 40, 2, 4, 1, 35, "long");

        dog.eat();

        dog.eat("Meat");
        dog.walk();
        dog.run();
    }
}
