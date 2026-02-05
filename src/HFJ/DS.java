
import java.util.*;

public class DS {

    public static void main(String[] args) {
        new DS().go();
    }

    public void go() {
        List<SongV3> getSongsList = MockSongs.getSongsV2();
        System.out.println(getSongsList);
        getSongsList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));

        System.out.println(getSongsList);

        Set<SongV3> songsSet = new HashSet<>(getSongsList);
        System.out.println(songsSet);

        Set<SongV3> songsTreeSet = new TreeSet<>(getSongsList);
        Set<SongV3> songsTreeSet = new TreeSet<>((o1, o2) -> o1.getBPM().compareTo(o2.getBPM()));

    }

}

class MockSongs {

    public static List<String> getSongStrings() {
        List<String> songs = new ArrayList<>();
        songs.add("somersault");
        songs.add("cassidy");
        songs.add("$10");
        songs.add("havana");
        songs.add("Cassidy");
        songs.add("50 Ways");
        return songs;

    }

    public static List<SongV3> getSongsV2() {
        List<SongV3> songs = new ArrayList<>();

        songs.add(new SongV3("somersault", "zero 7", 147));
        songs.add(new SongV3("cassidy", "grateful dead", 158));
        songs.add(new SongV3("$10", "hitchhiker", 140));
        songs.add(new SongV3("havana", "cabello", 105));
        songs.add(new SongV3("Cassidy", "grateful dead", 158));
        songs.add(new SongV3("50 ways", "simon", 102));
        return songs;
    }
}

class SongV3 {

    private String Title;
    private String artist;
    private int bpm;

    public SongV3(String title, String artist, int bpm) {
        this.Title = title;
        this.artist = artist;
        this.bpm = bpm;
    }

    public int compareTo(SongV3 s) {
        return Title.compareTo(s.getTitle());

    }

    public String getTitle() {
        return Title;
    }

    public String getArtist() {
        return artist;

    }

    public int getBPM() {
        return bpm;

    }

    @Override
    public String toString() {
        return Title;
    }

}
