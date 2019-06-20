package com.danjerous;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    Theatre theatre = new Theatre("Procinal", 8, 12);
	//    theatre.getSeats();

        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
        printList(seatCopy);

        seatCopy.get(1).reserve();
         if(theatre.reservedSeat("A02")) {
             System.out.println("Please pay for seat.");
         } else {
             System.out.println("Seat already reserved.");
         } //Separated lists but referring to the same objects.

        //Collections.reverse(seatCopy);
       // Collections.shuffle(seatCopy);
      //  Collections.swap(seatCopy, 1, 1);
        System.out.println("Printing seatCopy");
        printList(seatCopy);
        System.out.println("Printing theatre.seat");
        printList(theatre.seats);

        Theatre.Seat minSeat = Collections.min(seatCopy);
        Theatre.Seat maxSeat = Collections.max(seatCopy);

        System.out.println("Min seat number is " + minSeat.getSeatNumber());
        System.out.println("Max seat number is " + maxSeat.getSeatNumber());


    }

    public static void printList (List<Theatre.Seat> list) {
        for (Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("=============================================");
    }
}
