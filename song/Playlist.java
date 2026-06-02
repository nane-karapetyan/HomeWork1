package song;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Playlist {
    private List<Song> songs;
    private Song currentlyPlaying;

    public Playlist(List<Song> songs) {
        this.songs = songs;
        this.currentlyPlaying = null;
    }
    public ArrayList<Song> findByTitle(String title) {
        ArrayList<Song> result = new ArrayList<>();
        for (Song song : songs) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                result.add(song);
            }
        }
        return result;
    }
    public void play(Song song) {
        if (songs.contains(song)) {
            currentlyPlaying = song;
            System.out.println("Now playing: " + song);
        } else {
            throw new NoSongInPlaylistException("The song '" + song.getTitle() + "' is not in the playlist.");
        }
    }
    public void pause() {
        if (currentlyPlaying != null) {
            System.out.println("Paused: " + currentlyPlaying);
            currentlyPlaying = null;
        } else {
            System.out.println("No song is currently playing.");
        }
    }
    public void addSong(Song song) {
        songs.add(song);
    }
    public void removeSong(Song song) {
        songs.remove(song);
        if (song.equals(currentlyPlaying)) {
            currentlyPlaying = null;
        }
    }
    public void addAllSongs(Collection<? extends Song> newSongs) {
        songs.addAll(newSongs);
    }
    public Song getCurrentlyPlaying() {
        return currentlyPlaying;
    }
    public List<Song> getAllSongs() {
        return songs;
    }
}
