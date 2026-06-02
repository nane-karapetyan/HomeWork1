package song;

import java.util.Objects;

public class Song {
    private String artist;
    private String title;
    private String releaseDate; // dd:mm:yyyy

    public Song(String artist, String title, String releaseDate) {
        this.artist = artist;
        this.title = title;
        this.releaseDate = releaseDate;
    }
    public String getArtist() { return artist; }
    public String getTitle() { return title; }
    public String getReleaseDate() { return releaseDate; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(artist, song.artist) &&
                Objects.equals(title, song.title);
    }
    @Override
    public int hashCode() {
        return Objects.hash(artist, title);
    }
    @Override
    public String toString() {
        return artist + " - " + title + " (" + releaseDate + ")";
    }
}