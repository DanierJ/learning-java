package com.danjerous;

/*
class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends  Movie {

    public Jaws() {
        super("Jaws");
    }

    public String plot () {
        return "A shark eats lots of people";
    }
}


class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attemp to take over planet";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze.";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Starwars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over Univer";
    }
}

class Forgatable extends  Movie {
    public Forgatable() {
        super("Forgetable");
    }

}
*/

class Car {
    private String name;
    private String colour;
    private String model;
    private Boolean engine = true;
    private int numWheels = 4;
    private int numCylinders;

    public Car(String name, String colour, String model, int numCylinders) {
        this.name = name;
        this.colour = colour;
        this.model = model;
        this.numCylinders = numCylinders;
    }


    public String startEngine () {
        return "[Car] startEngine() called.";
    }

    public String accelerate () {
        return "[Car] accelerate() called.";
    }

    public void breaking () {
        System.out.println("[Car] breaking() called.");
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public String getModel() {
        return model;
    }

    public Boolean getEngine() {
        return engine;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public int getNumCylinders() {
        return numCylinders;
    }
}


class BMW extends Car {
    public BMW(String name, String colour, String model, int numCylinders) {
        super(name, colour, model, numCylinders);
    }

    @Override
    public String accelerate() {
        return "[BMW] accelerate() * 2 called.";
    }
}

class Toyota extends Car {
    public Toyota(String name, String colour, String model, int numCylinders) {
        super(name, colour, model, numCylinders);
    }

    @Override
    public String accelerate() {
        return "[Toyota] accelerate() * 3 called.";
    }
}

class Mercedes extends Car {
    public Mercedes(String name, String colour, String model, int numCylinders) {
        super(name, colour, model, numCylinders);
    }

    @Override
    public String accelerate() {
        return "[Mercedes] accelerate() * 4 called ";
    }
}





public class Main {

    public static void main(String[] args) {

        for (int i = 1; i < 4; i++) {
            Car car = randomCar();
            System.out.println("The car " + car.getName() + " just " + car.startEngine() + " and " + car.accelerate());
        }

    /*


       TODO: Override the appropriate methods to demonstrate polymorphism in use.

       TODO: put all classes in the one java file (this one)
    * */


/*
        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie # " + i + " : " + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n");
        }


    }

    public static Movie randomMovie () {
        int random = (int) (Math.random() * 5) + 1;

        System.out.println("Random number generated was: " + random);


        switch (random) {

            case 1:
                return new Jaws();

            case 2:
                return new IndependenceDay();

            case 3:
                return new MazeRunner();

            case 4:
                return new StarWars();

            case 5:
                return new Forgatable();
        }

        return null;

 */
    }

    public static Car randomCar () {
        int random = (int) (Math.random() * 3) + 1;

        System.out.println("Random number generated was: " + random);


        switch (random) {

            case 1:
                return new BMW("Biemdou", "Magenta",    "254x", 5  );

            case 2:
                return new Toyota("Toyis", "Red", "kio5", 8);

            case 3:
                return new Mercedes("Merci", "White", "klos6", 10);

        }
        return null;
    }



}
