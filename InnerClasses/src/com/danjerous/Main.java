package com.danjerous;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    private  static Button btnPrint = new Button("Printing");

    public static void main(String[] args) {

        GearBox mcLaren = new GearBox(6);
        //GearBox.Gear first = mcLaren.new Gear(1, 12.3); Can when the inner class is public
      //  System.out.println(first.driveSpeed(1000));  Can when the inner class is public

       // GearBox.Gear second = new GearBox.Gear(2,15.6); can't
        // GearBox.Gear third = new mcLaren.Gear(1, 35.2); can't


        /// Now that the inner class is private.

       /* mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000));

        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(3000));
        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(6000));*/



        ///// LOCAL CLASS
        class ClickListener implements Button.OnClickListener {

            public ClickListener (){
                System.out.println("I'v been attached");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked.");
            }
        }

        btnPrint.setOnClickListener(new ClickListener());


        ///// Anonymous class
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + "was clicked.");
            }
        });
        listen();


    }

    private static void listen() {
        boolean quit = false;
        while (!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }
}
