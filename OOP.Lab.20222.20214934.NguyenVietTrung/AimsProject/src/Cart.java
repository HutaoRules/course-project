public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] =  new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    private int qtyOrdered = 0;
    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered < MAX_NUMBER_ORDERED){
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added");
        }
        else{
            System.out.println("The cart is almost full");
        }
    }
//    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
//        if(qtyOrdered + dvdList.length <= MAX_NUMBER_ORDERED){
//            for(int i = 0; i < dvdList.length; i++){
//                itemsOrdered[qtyOrdered] = dvdList[i];
//                qtyOrdered++;
//            }
//            System.out.println("The disc has been added");
//        }
//        else{
//            System.out.println("The cart is almost full");
//        }
//    }
    public void addDigitalVideoDisc(DigitalVideoDisc... dvdList){
        if(qtyOrdered + dvdList.length <= MAX_NUMBER_ORDERED){
            for(int i = 0; i < dvdList.length; i++){
                itemsOrdered[qtyOrdered] = dvdList[i];
                qtyOrdered++;
            }
            System.out.println("The disc has been added");
        }
        else{
            System.out.println("The cart is almost full");
        }
    }/**
     I prefer the allows to pass an arbitrary number of arguments for dvd version because I think it ís more convenient and easier to use.
     **/
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
        if(qtyOrdered < MAX_NUMBER_ORDERED - 1){
            itemsOrdered[qtyOrdered] = dvd1;
            qtyOrdered++;
            itemsOrdered[qtyOrdered] = dvd2;
            qtyOrdered++;
            System.out.println("The disc has been added");
        }
        else{
            System.out.println("The cart is almost full");
        }
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered > 0){
            for(int i = 0; i < qtyOrdered; i++){
                if(itemsOrdered[i].getTitle().equalsIgnoreCase(disc.getTitle())){
                    for(int j = i; j < qtyOrdered - 1; j++){
                        itemsOrdered[j] = itemsOrdered[j + 1];
                    }
                    qtyOrdered--;
                    System.out.println("The disc has been removed");
                    break;
                }
            }
        }
        else{
            System.out.println("The cart is empty");
        }
    }
    public float totalCost(){
        float total = 0;
        for(int i = 0; i < qtyOrdered; i++){
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
    public void getDetail(){
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for(int i = 0; i < qtyOrdered; i++){
            System.out.println(i + 1 + ". DVD - " + itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory() + " - " + itemsOrdered[i].getDirector() + " - " + itemsOrdered[i].getLength() + ": " + itemsOrdered[i].getCost() + "$");
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }
    public boolean searchByID(int id){
        for(int i = 0; i < qtyOrdered; i++){
            if(itemsOrdered[i].getId() == id){
                System.out.println("Found: " + itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory() + " - " + itemsOrdered[i].getDirector() + " - " + itemsOrdered[i].getLength() + ": " + itemsOrdered[i].getCost() + "$");
                return true ;
            }
        }
        System.out.println("Not found any disc with id: " + id);
        return false;
    }
    public boolean searchByTitle(String title){
        for(int i = 0; i < qtyOrdered; i++){
            if(itemsOrdered[i].getTitle().equalsIgnoreCase(title)){
                System.out.println("Found: " + itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory() + " - " + itemsOrdered[i].getDirector() + " - " + itemsOrdered[i].getLength() + ": " + itemsOrdered[i].getCost() + "$");
                return true ;
            }
        }
        System.out.println("Not found any disc with title: " + title);
        return false;
    }
}
