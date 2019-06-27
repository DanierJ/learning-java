package com.danjerous;

public class Main {

    public static void main(String[] args) {
         Countdown countdown = new Countdown();


         CountdownThread t1 = new CountdownThread(countdown);

         t1.setName("Thread 1");
         CountdownThread t2 = new CountdownThread(countdown);
         t2.setName("Thread 2");

         t1.start();
         t2.start();
    }

}

class Countdown {
    private int i; // race condition. Thread interference. When they share same resources.

    // The instances of an object are located on the heap. The local variables on thread stack.

    public void doCountdown() { // By synchronizing the method if a thread is executing it the other threads can't access it till it's done.
        String color;

        switch (Thread.currentThread().getName()) {
            case "Thread 1":
                color = ThreadColor.ANSI_CYAN;
                break;
            case "Thread 2":
                color = ThreadColor.ANSI_PURPLE;
                break;
                default:
                    color = ThreadColor.ANSI_GREEN;
        }

        synchronized (this) {
            for (i = 10; i > 0; i--){
                System.out.println(color + Thread.currentThread().getName() + ": i = " + i);
            }
        }
    }

}

class CountdownThread extends Thread {
    private Countdown threadCountdown;

    public CountdownThread (Countdown countdown) {
        threadCountdown = countdown;
    }

    public void run() {
        threadCountdown.doCountdown();
    }

}
