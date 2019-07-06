package com.danjerous;

import com.danjerous.model.Datasource;

import java.beans.Statement;

public class Main {

    public static void main(String[] args) {
        Datasource datasource = new Datasource();

        if (!datasource.open()) {
            System.out.println("Can't open datasource.");
            return;
        }


        datasource.close();
    }
}
