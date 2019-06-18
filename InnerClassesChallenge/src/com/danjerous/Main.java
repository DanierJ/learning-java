package com.danjerous;

import java.util.*;

public class Main {

    private static List<Album> albums = new ArrayList<>();

    public static void main(String[] args) {

       /* Album mrAZ = new Album("mrAZ", "Json Mraz");

        Song song1 = new Song("I'm yours", 4.00);
        Song song2 = new Song("Song for a friend", 5.00);

        mrAZ.getSongList().add(song1);
        mrAZ.getSongList().add(song2);


        Album disney = new Album("disney songs", "Disney");

        Song song3 = new Song("Hombres de acciòn", 3.21);
        Song song4 = new Song("Mi reflejo", 1.56);

        disney.getSongList().add(song3);
        disney.getSongList().add(song4);


        mrAZ.showSongList();
        disney.showSongList();*/

       Album imagineDragons = new Album("Night Visions", "Imagine Dragons");

       imagineDragons.addSong("Radioactive", 3.06);
       imagineDragons.addSong("It's time", 5.30);
       imagineDragons.addSong("Tiptoe", 2.56);
       imagineDragons.addSong("Demons", 4.20);
       imagineDragons.addSong("Hear me", 4.36);
       imagineDragons.addSong("Every Night", 3.56);
       imagineDragons.addSong("On the top of the world", 5.06);
       albums.add(imagineDragons);

       Album mrAz = new Album("Mr.A-Z", "Json Mraz");

       mrAz.addSong("Worldplay", 5.20);
       mrAz.addSong("Mr.Curiosity", 4.23);
       mrAz.addSong("Geek in the pink", 3.10);
       mrAz.addSong("Did you get my message?", 3.15);
       mrAz.addSong("Bella luna", 3.23);
       mrAz.addSong("Song for a friend", 6.23);
       albums.add(mrAz);

        List<Song> playList = new ArrayList<>();

        albums.get(0).addToPlayList("Tiptoe", playList);
        albums.get(0).addToPlayList("Demons", playList);
        albums.get(0).addToPlayList("Monster", playList);

        albums.get(0).addToPlayList(1, playList);
        albums.get(1).addToPlayList(1, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(10, playList);

        play(playList);

    }

    private static void play (List<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;




        ListIterator<Song> listIterator = playList.listIterator();

        if(playList.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                case 1:
                    if(!forward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }

                    if(listIterator.hasNext()) {
                        System.out.println("Now playing + " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the list");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the start of the playlist");
                        forward = false;
                    }
                    break;
                case 3:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list.");
                        }
                    } else {
                        if(listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());

                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the list.");

                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                   printMenu();
                    break;
                case 6:
                    if(playList.size() > 0) {
                        listIterator.remove();
                        if(listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    } else {
                        System.out.println("There's no more songs.");
                    }
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0 - To quit\n" +
                "1 - To play next song\n" +
                "2 - To play previous song\n" +
                "3 - To replay the current song\n" +
                "4 - list songs in the playlist\n" +
                "5 - Print the available actions\n"+
                "6 - Delete current song from playlist."
        );
    }

    private static void printList(List<Song> playList) {
        Iterator<Song> iterator = playList.iterator();

        System.out.println("========================================");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("============================");
    }
}
