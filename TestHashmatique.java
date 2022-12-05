import java.util.HashMap;
import java.util.Set;

public class TestHashmatique {
    public static void main(String[] args) {
        
        // Print lyrics from a song title
        MapHashmatique mapHashmatique = new MapHashmatique();
        HashMap<String, String> trackList = mapHashmatique.createTrackList();
        System.out.println(trackList.get("I Climb a Little Stair"));

        // Print all tracknames and lyrics
        Set<String> tracks = trackList.keySet();
        for (String track : tracks) {
            System.out.println("\r");
            System.out.println(track);
            System.out.println(trackList.get(track));
        }
    }
}