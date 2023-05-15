public class CartTest {
    public static void main(String[] args) {
        Cart anOrder = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Little Mermaid", "Animation", 19.99f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Harry Potter", "Science Fiction", 20.99f);
        DigitalVideoDisc items[] = {dvd1, dvd2, dvd3};
        anOrder.addDigitalVideoDisc(dvd4,dvd5,dvd1,dvd2,dvd3);
        anOrder.getDetail();
        anOrder.searchByID(0);
        anOrder.searchByTitle("Star Wars");
    }
}
