package com.danjerous;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private String albumName;
    private String artist;
    private SongList songList;



    public Album(String albumName, String artist) {
        this.albumName = albumName;
        this.artist = artist;
        this.songList = new SongList();
    }

    public String getAlbumName() {
        return albumName;
    }

    public String getArtist() {
        return artist;
    }

    public void showSongList () {
        System.out.println("------- " + albumName + "------");
        for (int i = 0; i < songList.getSongList().size(); i++) {
            System.out.println((i+1) + ". Title: " + songList.getSongList().get(i).getTitle() + " [" + songList.getSongList().get(i).getDuration() + "]");
        }
        System.out.println("==============================\n");
    }



    public boolean addToPlayList (int trackNumber, List<Song> playList) {

        Song checkedSong = songList.findSong(trackNumber);

        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }

        System.out.println("This album does not have a track " + trackNumber);
        return false;

    }

    public boolean addToPlayList (String title, List<Song> playList) {
        Song checkedSong = songList.findSong(title);

        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }

        System.out.println("The song " + title + " is not in this album.");
        return false;

    }
    public boolean addSong (String title, double duration) {
        return songList.addSong(title, duration);
    }


    private class SongList {
        private ArrayList<Song> songList;

        public SongList() {
            this.songList = new ArrayList<>();
        }

        private Song findSong (String title) {
            for (Song checkedSong : this.songList) {
                if (checkedSong.getTitle().equals(title)) {
                    return checkedSong;
                }
            }
            return null;
        }


        public Song findSong (int trackNumber){
            int index = trackNumber -1;
            if ((index >= 0) && (index<= songList.size())) {
               return songList.get(index);
            }
                return null;
        }

        public boolean addSong (String title, double duration) {

            if(findSong(title) == null) {
                songList.add(new Song(title, duration));
                return true;
            }

            return false;
        }

        public ArrayList<Song> getSongList() {
            return songList;
        }
    }




}
