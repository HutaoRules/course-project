package hust.soict.dsai.test.cart;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.Track;

import java.util.ArrayList;

public class CartTest {
    public static void main(String[] args) {
        Cart anOrder = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Little Mermaid", "Animation", 19.99f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Harry Potter", "Science Fiction", 20.99f);
        Track track1 = new Track("Track1", 1);
        Track track2 = new Track("Track2", 2);
        Track track3 = new Track("Track3", 3);
        Track track4 = new Track("Track4", 4);
        ArrayList<Track> tracks = new ArrayList<Track>();
        tracks.add(track1);
        tracks.add(track2);
        tracks.add(track3);
        tracks.add(track4);
        CompactDisc cd1 = new CompactDisc("CD1", "Music", "Artist1", 10.99f,"asdasd", tracks);
        Book book1 = new Book("Book1", "Science", 10.99f, new ArrayList<String>());
        anOrder.addMedia(dvd4,dvd5,dvd1,dvd2,dvd3,cd1,book1);
        anOrder.getDetail();
    }
}
