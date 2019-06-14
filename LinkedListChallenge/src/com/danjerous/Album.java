package com.danjerous;

import java.util.ArrayList;

public class Album {
    private String albumName;
    private ArrayList<Song> songList;

    public Album(String albumName) {
        this.albumName = albumName;
        this.songList = new ArrayList<>();
    }

    public String getAlbumName() {
        return albumName;
    }

    public ArrayList<Song> getSongList() {
        return songList;
    }

    public void showSongList () {
        System.out.println("------- " + albumName + "------");
        for (int i = 0; i < songList.size(); i++) {
            System.out.println((i+1) + ". Title: " + songList.get(i).getTitle() + " [" + songList.get(i).getDuration() + "]");
        }
        System.out.println("==============================\n");
    }

}
