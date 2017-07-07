package com.example.android.musicalstructure;

public class Song {
    private String title, artist, album;

    public Song() {
    }

    public Song(String title, String artist, String album) {
        this.title = title;
        this.artist = artist;
        this.album = album;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }
}
