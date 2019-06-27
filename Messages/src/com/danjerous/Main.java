package com.danjerous;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Message msg = new Message();

        (new Thread(new Writer(msg))).start();
        (new Thread(new Reader(msg))).start();
    }
}

class Message {
    private String message;
    private boolean empty = true;

        //Consumer
    public synchronized String read() {
        while (empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.getMessage();
            }

        }

        empty = true;
        notifyAll();
        return message;
    }

    // Producer
    public synchronized void write(String msg) {
        while (!empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.getMessage();
            }
        }
        empty = false;
        this.message = msg;
        notifyAll();
    }
}

class Writer implements Runnable {
    private Message message;

    public Writer (Message msg) {
        this.message = msg;
    }

    @Override
    public void run() {
        String[] messages = {
                "Humpty Dumpy sat on a wall",
                "Tim pero que mondaaaaa",
                "Siempre sale con unos textos vergaaaaaa",
                "Me azaraaaaaaaaa."
        };

        Random random = new Random();

        for (int i = 0; i <messages.length; i++) {
            message.write(messages[i]);

            try {
                Thread.sleep(random.nextInt(2000));
            } catch (InterruptedException e) {
                e.getMessage();
            }
        }

        message.write("Finished.");
    }
}

class Reader implements Runnable {
    private Message message;

    public Reader(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        Random random = new Random();
        for (String latestMessage = message.read(); !latestMessage.equals("Finished"); latestMessage = message.read()) {
            System.out.println(latestMessage);
            try {
                Thread.sleep(random.nextInt(2000));
            } catch (InterruptedException e) {
                e.getMessage();
            }
        }
    }
}
