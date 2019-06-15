package com.danjerous;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String albumName;
    private String artist;
    private ArrayList<Song> songList;

    public Album(String albumName, String artist) {
        this.albumName = albumName;
        this.artist = artist;
        this.songList = new ArrayList<>();
    }

    public String getAlbumName() {
        return albumName;
    }

    public String getArtist() {
        return artist;
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

    public boolean addSong (String title, double duration) {

        if(findSong(title) == null) {
            songList.add(new Song(title, duration));
            return true;
        }

        return false;
    }

    private Song findSong (String title) {
        for (Song checkedSong : this.songList) {
            if (checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addToPlayList (int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber -1;
        if ((index >= 0) && (index<= songList.size())) {
            playList.add(songList.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;

    }

    public boolean addToPlayList (String title, LinkedList<Song> playList) {
        Song checkedSong = findSong(title);

        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }

        System.out.println("The song " + title + " is not in this album.");
        return false;

    }
}
