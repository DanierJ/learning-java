package com.danjerous;

import static com.danjerous.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable {


    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from MyRunnable's implementation of run.");
    }
}
