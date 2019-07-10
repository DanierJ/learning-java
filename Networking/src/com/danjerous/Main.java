package com.danjerous;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class Main {

    public static void main(String[] args) {

       /* try {


            //// BASE URI
            URI baseURI = new URI("https://username:password@myserver.com:5000");

            /// RELATIVE URI
           URI uri1 = new URI("/catalogue/phones?os=android#samsung");
           URI uri2 = new URI("/catalogue/tvs?manufacturer=samsung");
           URI uri3 = new URI("/stores/locations?zip=12345");

            ///// RESOLVED URI
            URI resolvedURI1 = baseURI.resolve(uri1);
            URI resolvedURI2 = baseURI.resolve(uri2);
            URI resolvedURI3 = baseURI.resolve(uri3);

          //  URI uri = new URI("hello");

            // Components of the URI
            // has to be absolute.
            URL url1 = resolvedURI1.toURL();
            URL url2 = resolvedURI2.toURL();
            URL url3 = resolvedURI3.toURL();

            System.out.println("URL1 = " + url1);
            System.out.println("URL2 = " + url2);
            System.out.println("URL3 = " + url3);


            /// Relativize

            URI relativizedURI = baseURI.relativize(resolvedURI2);
            System.out.println("Relative URI = " + relativizedURI);


        } catch (URISyntaxException e ) {
            System.out.println("URI Bad Syntax: " + e.getMessage());
        } catch (MalformedURLException e) {
            System.out.println("URL Malformed: " + e.getMessage());
        } */

       try {
           /// HOW TO ACCESS A FUCKING LOCATION ON THE INTERNET.

           URL url = new URL("http://example.org");

           URLConnection urlConnection = url.openConnection();
           urlConnection.setDoOutput(true);
           urlConnection.connect();


           BufferedReader inputStream = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

            // Reading the output
           String line = "";

           while (line != null) {
               line = inputStream.readLine();
               System.out.println(line);
           }

           inputStream.close();
/*
           BufferedReader inputStream = new BufferedReader(new InputStreamReader(url.openStream()));

            // Reading the output
           String line = "";

           while (line != null) {
               line = inputStream.readLine();
               System.out.println(line);
           }

           inputStream.close();*/




       } catch (MalformedURLException e) {
           System.out.println("URL Malformed: " + e.getMessage());

       } catch (IOException e ) {
           System.out.println("IOException: " + e.getMessage());

       }

    }
}
