package hust.soict.dsai.aims.media;

public class Track implements Playable{
    private String title;
    private int length;
    public String getTitle() {
        return title;
    }
    public int getLength() {
        return length;
    }
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }
    public void play() {
        if (this.getLength() > 0) {
            System.out.println("Playing Track: " + this.getTitle());
            System.out.println("Track length: " + this.getLength());
        } else {
            System.out.println("Track cannot be played");
        }
    }
    public boolean equals(Object obj) {
        if (obj instanceof Track) {
            Track track = (Track) obj;
            if (track.getTitle().equals(this.getTitle()) && track.getLength() == this.getLength()) {
                return true;
            }
        }
        return false;
    }
}
