package com.danjerous;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {
	 try (ServerSocket serverSocket = new ServerSocket(5000)) {

	     // We want the server to listen to clients that we've assigned
         Socket socket = serverSocket.accept();

         System.out.println("Client Connected.");

         // We use input/output stream to send and receive data.

         BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));

         PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

         while (true) {
             String echoString = input.readLine();
             if (echoString.equals("exit")) {
                 break;
             }

             if (echoString.equals("Hola")) {
                 echoString = "¿Cómo estás?";
             }

             output.println("Echo from server: " + echoString);
         }




     } catch (IOException e) {
         System.out.println("Server exception: " + e.getMessage());
	     e.printStackTrace();
     }
    }
}
