package com.danjerous;

public class Main {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20, 20, 5);

        Case theCase = new Case("220B", "Dell", "240", dimensions);


        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6 , "v.244");


        PC thePC = new PC(theCase, theMonitor, theMotherboard);

        thePC.powerUp();


        //// THIS IS REALLY AGGREGATION.


        /*To represent effectively composition the parts needs to be instanced into the whole or change the privacy of the parts so the can be access only through the pc */
    }
}
