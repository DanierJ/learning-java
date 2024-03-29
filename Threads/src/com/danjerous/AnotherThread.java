package com.danjerous;

import static com.danjerous.ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread {

    @Override
    public void run() {
        System.out.println(ANSI_BLUE +"Hello from " + currentThread().getName());

        // Putting sleep

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(ANSI_BLUE + "Another thread woke me up.");
            return;
        }

        System.out.println(ANSI_BLUE + "Five seconds have passed and I'm awake");
    }
}
