package LinkedList.Challenge;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private SongList songs;

    public Album(String name) {
        this.name = name;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration) {
        return this.songs.add(new Song(title, duration));
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        Song checkedSong = this.songs.findSong(trackNumber);
        if (checkedSong != null) { //song must exist
            playList.add(checkedSong);
            System.out.println("Song " + checkedSong + " is added to the playlist");
            return true;
        }
        System.out.println("This song doesn't exist, you can't add it to the playlist");
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song checkedSong = this.songs.findSong(title);
        if (checkedSong != null) { //song must exist
            playList.add(checkedSong);
            System.out.println("Song " + checkedSong + " is added to the playlist");
            return true;
        }
        System.out.println("This song doesn't exist, you can't add it to the playlist");
        return false;
    }

    private class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<Song>();
        }

        public boolean add(Song song) {
            if (songs.contains(song)) {
                return false;
            }
            this.songs.add(song);
            return true;
        }

        private Song findSong(String title) {
            for (Song checkedSong : songs) { //= int i=0; i<songs.size(); i++
                // Song song = songs.get(i); song.getTitle
                if (checkedSong.getTitle().equals(title)) {
                    return checkedSong;
                }
            }
            return null;
        }

        public Song findSong(int trackNumber) {
            int index = trackNumber - 1;
            if ((index > 0) && index < songs.size()) {
                return songs.get(index);
            }
            return null;
        }
    }
}

