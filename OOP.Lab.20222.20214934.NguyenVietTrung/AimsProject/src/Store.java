 public class Store {
    DigitalVideoDisc itemInStore[] = new DigitalVideoDisc[999];
    public void addDVD(DigitalVideoDisc disc) {
        for (int i = 0; i < 999; i++) {
            if (itemInStore[i] == null) {
                itemInStore[i] = disc;
                System.out.println("The disc has been added");
                break;
            }
        }
    }
    public void removeDVD(DigitalVideoDisc disc) {
        for (int i = 0; i < 999; i++) {
            if (itemInStore[i] == disc) {
                itemInStore[i] = null;
                System.out.println("The disc has been removed");
                break;
            }
        }
    }
}
