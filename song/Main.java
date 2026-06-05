package song;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Song song1 = new Song("System of a Down", "Chop Suey!", "04:09:2001");
        Song song2 = new Song("Pink Floyd", "Comfortably Numb", "30:11:1979");
        Song song3 = new Song("Deep Purple", "Smoke on the Water", "01:03:1972");

        List<Song> initialList = new ArrayList<>();
        initialList.add(song1);
        initialList.add(song2);

        Playlist myPlaylist = new Playlist(initialList);

        myPlaylist.addSong(song3);

        System.out.println("--- Playing songs ---");
        myPlaylist.play(song2);
        System.out.println("Currently playing: " + myPlaylist.getCurrentlyPlaying());

        myPlaylist.pause();
        System.out.println("Currently playing: " + myPlaylist.getCurrentlyPlaying());

        System.out.println("-- Searching for 'Chop Suey!' --");
        ArrayList<Song> foundSongs = myPlaylist.findByTitle("Chop Suey!");
        for (Song s : foundSongs) {
            System.out.println("Found: " + s);
        }
        List<Song> newAlbum = new LinkedList<>();
        newAlbum.add(new Song("Beatles", "Yesterday", "06:08:1965"));
        newAlbum.add(new Song("Queen", "Bohemian Rhapsody", "31:10:1975"));

        myPlaylist.addAllSongs(newAlbum);
        System.out.println("\nTotal songs after adding album: " + myPlaylist.getAllSongs().size());

        System.out.println("--- Testing Exception ---");
        try {
            Song strangerSong = new Song("Unknown", "No Title", "00:00:0000");
            myPlaylist.play(strangerSong);
        } catch (NoSongInPlaylistException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
