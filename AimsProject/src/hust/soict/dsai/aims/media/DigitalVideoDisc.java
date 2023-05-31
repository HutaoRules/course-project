package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
    public DigitalVideoDisc(String title){
        super(title);
    }
    public DigitalVideoDisc(String title, String category, float cost){
        super(title, category, cost);
    }
    public DigitalVideoDisc(String title, String category, String director, float cost){
        super(title, category, director, cost);
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost){
        super(title, category, director, length, cost);
    }
    public void play() {
        if (this.getLength() > 0) {
            System.out.println("Playing DVD: " + this.getTitle());
            System.out.println("DVD length: " + this.getLength());
        } else {
            System.out.println("DVD cannot be played");
        }
    }
    @Override
    public String toString() {
        return "DVD: " + this.getTitle() +" - " + this.getCategory()  + " - " + this.getDirector() + " - " + this.getLength() + " - " + this.getCost();
    }
}