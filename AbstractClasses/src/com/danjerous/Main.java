package com.danjerous;

public class Main {

    public static void main(String[] args) {
	    Dog dog = new Dog("Marci");

	    dog.eat();
	    dog.breathe();

	    Parrot parrot = new Parrot("chopu");
	    parrot.eat();
	    parrot.breathe();
	    parrot.fly();

	    Penguin penguin = new Penguin("Emperor");

	    penguin.fly();
    }
}
