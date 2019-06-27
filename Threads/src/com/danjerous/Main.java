package com.danjerous;

import static com.danjerous.ThreadColor.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from the main thread.");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== Another Thread ==");

        anotherThread.start();

        // Interrupting
        // anotherThread.interrupt();


       // anotherThread.run(); if you do this, the thread is gonna get called from the thread that called run(), in this case the main thread.

        // Thread in anonymous class
        new Thread() {
            public void run() {
                System.out.println(ANSI_CYAN +"Hello from the anonymous class thread.");
            }
        }.start();

       // Thread myRunnableThread = new Thread(new MyRunnable());

        Thread myRunnableThread = new Thread(new MyRunnable(){
            @Override
            public void run() {
                System.out.println(ANSI_RED +"Hello from the anonymous class's implementation of run().");
                try {
                    anotherThread.join(3000);
                    System.out.println(ANSI_RED + "AnotherThread terminated, or timed out, so I'm running again.");
                } catch (InterruptedException e) {
                    System.out.println(ANSI_RED + "I couldn't wait after all. I was interrupted.");
                }
            }
        });

        myRunnableThread.start();
       // myRunnableThread.interrupt();


        System.out.println(ANSI_PURPLE+"Hello again from the main thread.");
       // anotherThread.start(); // won't work is already started


        // THE SO DECIDES WHO RUNS FIRST
    }
}
