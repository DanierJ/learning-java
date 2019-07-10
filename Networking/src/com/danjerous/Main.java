package com.danjerous;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Main {

    public static void main(String[] args) {

        try {

            // Absolute URI
            //URI uri = new URI("db://username:password@myserver.com:5000/catalogue/phones?os=android#samsung");

            //// BASE URI

            URI baseURI = new URI("https://username:password@myserver.com:5000");

            URI uri = new URI("https://username:password@myserver.com:5000/catalogue/phones?os=android#samsung");


            /// RELATIVE URI
            uri = new URI("/catalogue/phones?os=android#samsung");

            ///// RESOLVED URI
            URI resolvedURI = baseURI.resolve(uri);

          //  URI uri = new URI("hello");

            // Components of the URI
            // has to be absolute.
            URL url = resolvedURI.toURL();

            System.out.println("URL = " + url);

            System.out.println("Scheme:  " + uri.getScheme());
            System.out.println("Scheme-specific part: " + uri.getRawSchemeSpecificPart());
            System.out.println("Authority: " + uri.getAuthority());
            System.out.println("User info: " + uri.getUserInfo());
            System.out.println("Host: " + uri.getHost());
            System.out.println("Port: " + uri.getPort());
            System.out.println("Path: " + uri.getPath());
            System.out.println("Query: " + uri.getQuery());
            System.out.println("Fragment: " + uri.getFragment());



        } catch (URISyntaxException e ) {
            System.out.println("URI Bad Syntax: " + e.getMessage());
        } catch (MalformedURLException e) {
            System.out.println("URL Malformed: " + e.getMessage());
        }

    }
}
