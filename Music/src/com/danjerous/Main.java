package com.danjerous;

import com.danjerous.model.Artist;
import com.danjerous.model.Datasource;
import com.danjerous.model.SongArtist;

import java.beans.Statement;
import java.util.List;
import java.util.Scanner;

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


        List<String> albumsForArtist = datasource.queryAlbumsForArtist("Carole King", Datasource.ORDER_BY_ASC);

        if (albumsForArtist != null) {
            // albumsForArtist.forEach(System.out::println);
        }


        List<SongArtist> songArtists = datasource.querySongArtists("Go Your Own Way", Datasource.ORDER_BY_ASC);

        if (songArtists != null) {
            songArtists.forEach(songArtist -> System.out.println("Artist: " + songArtist.getArtistName() + ", Album: " + songArtist.getAlbumName() + ", Track: " + songArtist.getTrack()));
        }

        datasource.querySongMetadata();

        System.out.println("Count: " + datasource.getCount("songs"));

       /* if (datasource.createViewForSongArtists()) {
           // System.out.println("View created.");
        }*/



        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a song title: ");

        String title = scanner.nextLine();



        songArtists = datasource.querySongInforView(title);

        if (songArtists != null) {
            songArtists.forEach(songArtist -> System.out.println("Artist: " + songArtist.getArtistName() + ", Album: " + songArtist.getAlbumName() + ", Track: " + songArtist.getTrack()));
        } else {
            System.out.println("Nothing.");
        }


        datasource.close();

    }

}
