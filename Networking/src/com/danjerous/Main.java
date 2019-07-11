package com.danjerous;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.List;
import java.util.Map;

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
/*
       try {
           /// HOW TO ACCESS A FUCKING LOCATION ON THE INTERNET.

           URL url = new URL("http://example.org");

           URLConnection urlConnection = url.openConnection();
           urlConnection.setDoOutput(true);
           urlConnection.connect();


           BufferedReader inputStream = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));


           /// Retrieving headers

           Map<String, List<String>> headerFields = urlConnection.getHeaderFields();

           for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
               String key = entry.getKey();
               List<String> value = entry.getValue();
               System.out.println("---- key: " + key);

               value.forEach(val -> System.out.println("value: " + val));
           }*/






            // Reading the output
          /* String line = "";

           while (line != null) {
               line = inputStream.readLine();
               System.out.println(line);
           }

           inputStream.close();*/
/*
           BufferedReader inputStream = new BufferedReader(new InputStreamReader(url.openStream()));

            // Reading the output
           String line = "";

           while (line != null) {
               line = inputStream.readLine();
               System.out.println(line);
           }

           inputStream.close();*/

       /*} catch (MalformedURLException e) {
           System.out.println("URL Malformed: " + e.getMessage());

       } catch (IOException e ) {
           System.out.println("IOException: " + e.getMessage());

       }*/

        try {
            /// HOW TO ACCESS A FUCKING LOCATION ON THE INTERNET.

            URL url = new URL("https://jsonplaceholder.typicode.com/users/1");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            connection.setRequestProperty("User-Agent", "Chrome");
            connection.setReadTimeout(30000);

            int responseCode = connection.getResponseCode();
            System.out.println("Response code: " + responseCode);

            if (responseCode != 200) {
                System.out.println("Error reading web page.");
                System.out.println(connection.getResponseMessage());
                return;
            }


            BufferedReader inputReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String line;

            while ((line = inputReader.readLine()) != null) {
                System.out.println(line);
            }

            inputReader.close();


        } catch (MalformedURLException e) {
            System.out.println("URL Malformed: " + e.getMessage());

        } catch (IOException e ) {
            System.out.println("IOException: " + e.getMessage());

        }

    }
}
