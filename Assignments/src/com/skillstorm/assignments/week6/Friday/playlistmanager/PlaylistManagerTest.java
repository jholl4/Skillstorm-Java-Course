package playlistmanager;

public class PlaylistManagerTest {

    public static void main(String[] args) {
        PlaylistManager manager = new PlaylistManager();
        System.out.println("Testing displayPlaylist() method with an empty playlist");
        manager.displayPlaylist();

        manager.addSong("Head Like A Hole, by Nine Inch Nails");
        manager.addSong("Closer, by Nine Inch Nails");
        manager.addSong("Discipline, by Nine Inch Nails");
        manager.addSong("Perfect Drug, by Nine Inch Nails");
        manager.addSong("Terrible Lie, by Nine Inch Nails");

        manager.playAll();

        manager.displayPlaylist();

        System.out.println();
        System.out.println("Playing a second time to ensure iterator was reset");
        System.out.println();

        manager.playAll();

        System.out.println();
        System.out.println("Testing the playNext and skip methods");
        manager.displayPlaylist();
        System.out.println();

        manager.playNext();
        manager.skip();
        manager.playNext();

        System.out.println();
        System.out.println(
                "Now that we've played two songs we'll test the playAll method to ensure it plays from the beginning");
        System.out.println();

        manager.playAll();
        System.out.println();
        System.out.println("Testing skip() method through whole playlist to the end");
        System.out.println();

        manager.skip();
        manager.skip();
        manager.skip();
        manager.skip();
        manager.skip();
        manager.skip();
        manager.skip();

        System.out.println();
        System.out.println("Testing playNext through end of playlist");
        System.out.println();

        manager.resetPlaylist();
        manager.playNext();
        manager.playNext();
        manager.playNext();
        manager.playNext();
        manager.playNext();
        manager.playNext();
        manager.playNext();

    }

}
