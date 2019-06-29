package com.danjerous;

import java.util.concurrent.locks.ReentrantLock;

public class Main {

    private static ReentrantLock lock = new ReentrantLock(true); // fairness

    public static void main(String[] args) {

        Thread t1 = new Thread(new Worker(ThreadColor.ANSI_PURPLE), "Priority 10");
        Thread t2 = new Thread(new Worker(ThreadColor.ANSI_RED), "Priority 8");
        Thread t3 = new Thread(new Worker(ThreadColor.ANSI_YELLOW), "Priority 6");
        Thread t4 = new Thread(new Worker(ThreadColor.ANSI_GREEN), "Priority 4");
        Thread t5 = new Thread(new Worker(ThreadColor.ANSI_BLUE), "Priority 2");


        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }

    private static class Worker implements  Runnable {
        private int runCount = 1;
        private String threadColor;

        public Worker(String threadColor) {
            this.threadColor = threadColor;
        }

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
               lock.lock();
                try {

                    System.out.format(threadColor + "%s: runCount = %d\n", Thread.currentThread().getName(), runCount++);
                    // Execute critical section of code.
                } finally {
                    lock.unlock();
                }

            }
        }
    }
}
