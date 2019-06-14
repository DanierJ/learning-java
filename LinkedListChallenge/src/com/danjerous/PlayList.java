package com.danjerous;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class PlayList {

    private static LinkedList<Song> playList;

    public static void main(String[] args) {

        Album mrAZ = new Album("mrAZ");

        Song song1 = new Song("I'm yours", 4.00);
        Song song2 = new Song("Song for a friend", 5.00);

        mrAZ.getSongList().add(song1);
        mrAZ.getSongList().add(song2);

        LinkedList<Song> playList = new LinkedList<>();

        playList.add(song1);
        playList.add(song2);

        ListIterator listIterator = playList.listIterator();

        while (listIterator.hasNext()) {
            Song song = (Song)listIterator.next();
            System.out.println("Song: " + song.getTitle());
        }


    }
}
