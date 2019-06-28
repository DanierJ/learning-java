package com.danjerous;

public class Main {

    public static void main(String[] args) {
	    final PolitePerson jane = new PolitePerson("Jane");
	    final PolitePerson jon = new PolitePerson("Jon");

	    new Thread(new Runnable() {
            @Override
            public void run() {
                jane.sayHello(jon);

            }
        }).start();

	    new Thread(new Runnable() {
            @Override
            public void run() {
                jon.sayHello(jane);

            }
        }).start();
	    
    }

    static class PolitePerson {
        private final String name;

        public PolitePerson (String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public synchronized void sayHello(PolitePerson person) {
            System.out.format("%s: %s" + " has said hello to me!%n", this.name, person.getName());
            person.sayHelloBack(this);
        }

        public synchronized void sayHelloBack (PolitePerson person) {
            System.out.format("%s: %s" + " has said hello back to me!%n", this.name, person.getName());
        }
    }
}
