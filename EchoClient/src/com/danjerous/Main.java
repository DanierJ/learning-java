package com.danjerous;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5000)) {

            BufferedReader echoes = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // Timeout
            socket.setSoTimeout(5000);

            PrintWriter stringToEcho = new PrintWriter(socket.getOutputStream(), true);

            Scanner scanner = new Scanner(System.in);

            String echoSring;
            String response;

            do {
                System.out.println("Enter string to be echoed: ");
                echoSring = scanner.nextLine();

                stringToEcho.println(echoSring);

                if (!echoSring.equals("exit")) {
                    response = echoes.readLine();
                    System.out.println(response);
                }
            }while (!echoSring.equals("exit"));

        } catch (SocketTimeoutException e) {
            System.out.println("The socket timed out");

        } catch (IOException e) {
            System.out.println("Client exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
