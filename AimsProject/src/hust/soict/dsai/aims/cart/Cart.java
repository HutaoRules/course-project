package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;

public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>(MAX_NUMBER_ORDERED);
    public void addMedia(Media media){
        if(itemsOrdered.size() < MAX_NUMBER_ORDERED){
            itemsOrdered.add(media);
            System.out.println("The disc has been added");
        }
        else{
            System.out.println("The cart is almost full");
        }
    }
    public void addMedia(Media... mediaList){
        if(itemsOrdered.size() < MAX_NUMBER_ORDERED){
            for(Media media : mediaList){
                itemsOrdered.add(media);
            }
            System.out.println("The disc has been added");
        }
        else{
            System.out.println("The cart is almost full");
        }
    }
    public void addMedia(Media media1, Media media2){
        if(itemsOrdered.size() < MAX_NUMBER_ORDERED){
            itemsOrdered.add(media1);
            itemsOrdered.add(media2);
            System.out.println("The disc has been added");
        }
        else{
            System.out.println("The cart is almost full");
        }
    }
    public void removeMedia(Media media){
        if(itemsOrdered.contains(media)){
            itemsOrdered.remove(media);
            System.out.println("The disc has been removed");
        }
        else{
            System.out.println("The disc is not in the cart");
        }
    }
    public float totalCost(){
        float total = 0;
        for(int i = 0; i < itemsOrdered.size(); i++){
            total += itemsOrdered.get(i).getCost();
        }
        return total;
    }
    public void getDetail(){
        System.out.println("***********************CART***********************");
        for (Media media : itemsOrdered) {
            System.out.println(media.toString());
        }
        System.out.println("***************************************************");
    }
    public Media searchByID(int id){
        for (Media media : itemsOrdered) {
            if(media.getId() == id){
                System.out.println("Found: " + media.toString());
                return media;
            }
        }
        System.out.println("Not found any disc with id: " + id);
        return null;
    }
    public Media searchByTitle(String title){
        for (Media media : itemsOrdered) {
            if(media.getTitle().equalsIgnoreCase(title)){
                System.out.println("Found: " + media.toString());
                return media;
            }
        }
        System.out.println("Not found any disc with title: " + title);
        return null;
    }
    public void sortByTitle(){
        Media.sortByTitleCost(itemsOrdered);
    }
    public void sortByCost(){
        Media.sortByCostTitle(itemsOrdered);
    }
}
