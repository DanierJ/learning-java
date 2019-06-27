package com.danjerous;

import static com.danjerous.ThreadColor.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from the main thread.");

        Thread anotherThread = new AnotherThread();

        anotherThread.start();

        // Thread in anonymous class
        new Thread() {
            public void run() {
                System.out.println(ANSI_CYAN +"Hello from the anonymous class thread.");
            }
        }.start();


        System.out.println(ANSI_PURPLE+"Hello again from the main thread.");
       // anotherThread.start(); // won't work is already started


        // THE SO DECIDES WHO RUNS FIRST
    }
}
