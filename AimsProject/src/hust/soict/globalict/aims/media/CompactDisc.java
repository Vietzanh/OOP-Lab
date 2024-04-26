package hust.soict.globalict.aims.media;
import java.util.ArrayList;

public class CompactDisc extends Disc {
    private String artist;
    private ArrayList<Track> tracks;

    public String getArtist() {
        return this.artist;
    }
    public CompactDisc(String title, String category, String director, int length, float cost, String artist) {
        super(title, category, director, length, cost);
        this.artist = artist;
    }

    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("This track is already in the tracks.");
        } else {
            tracks.add(track);
        }
    }
    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
        } else {
            System.out.println("This track is not in the tracks.");
        }
    }
    public int getLength() {
        int sum = 0;
        for (Track track : tracks) {
            sum += track.getLength();
        }
        return sum;
    }

    public String toString() {
        return getTitle() + " - " + getCategory() + " - " + getDirector() + " - " + getArtist()
                + " - " + getLength() + ": " + getCost() + "$";
    }
    public void play() {
        System.out.println("Tracks contains:");
        for (Track track : tracks) {
            System.out.println(track.getTitle());
        }

        for (Track track : tracks) {
            track.play();
        }
    }
}
