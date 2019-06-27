package com.danjerous;

import static com.danjerous.ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread {

    @Override
    public void run() {
        System.out.println(ANSI_BLUE +"Hello from another thread.");
    }
}
