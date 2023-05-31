package hust.soict.dsai.aims.media;

import java.util.ArrayList;
public class CompactDisc extends Disc implements Playable{
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<Track>();
    public String getArtist() {
        return artist;
    }
    public CompactDisc(String title, String category, String director, float cost, String artist, ArrayList<Track> tracks) {
        super(title, category, director, cost);
        this.setLength(this.getLength());
        this.artist = artist;
        this.tracks = tracks;
    }
    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("Track is already in the list");
        } else {
            tracks.add(track);
            System.out.println("Track added");
        }
    }
    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track removed");
        } else {
            System.out.println("Track not found");
        }
    }
    public int getLength() {
        int length = 0;
        for (Track track : tracks) {
            length += track.getLength();
        }
        return length;
    }
    public void play() {
        System.out.println("Playing CD: " + this.getTitle());
        System.out.println("CD length: " + this.getLength());
        for (Track track : tracks) {
            track.play();
        }
    }
    @Override
    public String toString() {
        return "CD: " + this.getTitle() +" - " + this.getCategory()  + " - " + this.getArtist() + " - " + this.getDirector() + " - " + this.getLength() + " - " + this.getCost();
    }
}
