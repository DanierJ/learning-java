package com.danjerous;

import com.danjerous.model.Artist;
import com.danjerous.model.Datasource;

import java.beans.Statement;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Datasource datasource = new Datasource();

        if (!datasource.open()) {
            System.out.println("Can't open datasource.");
            return;
        }

        List<Artist> artists = datasource.queryArtist(Datasource.ORDER_BY_DESC);

        if (artists != null) {
           // artists.forEach(artist -> System.out.println("ID: " + artist.getId() + " | name: " + artist.getName()));
        } else {
            System.out.println("No artists.");
        }


        List<String> albumsForArtist = datasource.queryAlbumsForArtist("Iron Maiden", Datasource.ORDER_BY_DESC);

        if (albumsForArtist != null) {
            albumsForArtist.forEach(System.out::println);
        }


        datasource.close();
    }
}
