package playlistmanager;

import java.util.LinkedList;
import java.util.ListIterator;

public class PlaylistManager {

    private LinkedList<String> playlist;
    private ListIterator<String> playlistIterator;

    public PlaylistManager() {
        this.playlist = new LinkedList<String>();
        this.playlistIterator = playlist.listIterator();

    }

    public void resetPlaylist() {
        if (!playlist.isEmpty()) {
            System.out.println("--------------------------------------");
            System.out.println("----------Resetting Playlist----------");
            System.out.println("--------------------------------------");
            playlistIterator = playlist.listIterator();
        } else {
            System.out.println("******************");
            System.out.println("Playlist is empty.");
            System.out.println("******************");
        }
    }

    public void addSong(String song) {
        playlist.add(song);
        System.out.printf("---------------------------------------%n");
        System.out.printf("%s, added to playlist%n", song);
        System.out.printf("---------------------------------------%n");
        System.out.println("-------------Resetting playlist--------------");
        System.out.printf("---------------------------------------%n");
        playlistIterator = playlist.listIterator();
    }

    public void playNext() {
        if (!playlist.isEmpty()) {
            if (playlistIterator.hasNext()) {
                System.out.println("-------------------------------------------");
                System.out.println("Now playing: " + playlistIterator.next());
                System.out.println("-------------------------------------------");
            } else {
                System.out.println("****************");
                System.out.println("End of playlist.");
                System.out.println("****************");
            }
        } else {
            System.out.println("******************");
            System.out.println("Playlist is empty.");
            System.out.println("******************");
        }
    }

    public void playAll() {
        System.out.println("-------------------------------------------");
        System.out.println("----------Playing Entire Playlist----------");
        System.out.println("-------------------------------------------");
        if (!playlist.isEmpty()) {
            playlistIterator = playlist.listIterator();
            while (playlistIterator.hasNext()) {
                // System.out.println("-------------------------------------------");
                // System.out.println("Now playing: " + playlistIterator.next());
                // System.out.println("-------------------------------------------");
                playNext();
            }
            System.out.println("****************");
            System.out.println("End of playlist.");
            System.out.println("****************");
            playlistIterator = playlist.listIterator();
        } else {
            System.out.println("******************");
            System.out.println("Playlist is empty.");
            System.out.println("******************");
        }
    }

    public void skip() {
        if (playlistIterator.hasNext()) {
            System.out.println("*********************");
            System.out.println("Skipping to Next Song");
            System.out.println("*********************");
            playlistIterator.next();
        } else {
            System.out.println("***************");
            System.out.println("End of playlist");
            System.out.println("***************");
        }
    }

    public void displayPlaylist() {
        System.out.println("---------------------------------------");
        System.out.println("----------Displaying Playlist----------");
        System.out.println("---------------------------------------");
        if (!playlist.isEmpty()) {
            System.out.println("**************************************");
            System.out.println("Playlist currently contains: " + playlist);
            System.out.println("**************************************");
        } else {
            System.out.println("******************");
            System.out.println("Playlist is empty.");
            System.out.println("******************");
        }
    }

}