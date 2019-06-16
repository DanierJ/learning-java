package com.danjerous;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class PlayList {

    private static LinkedList<Song> playList = new LinkedList<>();
    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {

        Album mrAZ = new Album("mrAZ", "Json Mraz");

        mrAZ.addSong("I'm yours", 4.00);
        mrAZ.addSong("Song for a friend.", 5.00);

        albums.add(mrAZ);

        ListIterator listIterator = playList.listIterator();

        while (listIterator.hasNext()) {
            Song song = (Song) listIterator.next();
            System.out.println("Song: " + song.getTitle());
        }


    }

    private void addSong(String albumName, Song song) {
        if(findAlbum(albumName) >= 0) {

        }
    }

    private int findAlbum (String albumName) {
        for (int i = 0; i < albums.size() ; i++) {
            if(albums.get(i).getAlbumName().equals(albumName)) {
                return i;
            }
        }

        return -1;
    }
}
