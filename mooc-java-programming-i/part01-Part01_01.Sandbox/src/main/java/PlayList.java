
import java.util.ArrayList;



/**
 *
 * @author emaphis
 */
public class PlayList {
    private ArrayList<String> songs;

    public PlayList() {
        songs = new ArrayList();
    }

    public void addSong(String song) {
        songs.add(song);
    }

    public void removeSong(String song) {
        songs.remove(song);
    }

    public void printSong() {
        for (String song : songs) {
            System.out.println(song);
        }
    }

}
