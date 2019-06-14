package com.danjerous;

public class Main {

    public static void main(String[] args) {

        Album mrAZ = new Album("mrAZ");

        Song song1 = new Song("I'm yours", 4.00);
        Song song2 = new Song("Song for a friend", 5.00);

        mrAZ.getSongList().add(song1);
        mrAZ.getSongList().add(song2);


        Album disney = new Album("disney songs");

        Song song3 = new Song("Hombres de acciòn", 3.21);
        Song song4 = new Song("Mi reflejo", 1.56);

        disney.getSongList().add(song3);
        disney.getSongList().add(song4);


        mrAZ.showSongList();
        disney.showSongList();

    }
}
