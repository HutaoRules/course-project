package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;

public class Store {
    private ArrayList<Media> itemInStore = new ArrayList<Media>();
    public void addMedia(Media media) {
        if (itemInStore.contains(media)) {
            System.out.println("Media already exists");
        } else {
            itemInStore.add(media);
            System.out.println("Media added");
        }
    }
    public void removeMedia(Media media) {
        if (itemInStore.contains(media)) {
            itemInStore.remove(media);
            System.out.println("Media removed");
        } else {
            System.out.println("Media not found");
        }
    }
    public void getDetail() {
        System.out.println("***********************STORE***********************");
        for (Media media : itemInStore) {
            System.out.println(media.toString());
        }
        System.out.println("***************************************************");
    }
    public Media searchByTitle(String title){
        for (Media media : itemInStore) {
            if(media.getTitle().equals(title)){
                System.out.println(media.toString());
                return media;
            }
        }
        return null;
    }
    public Media searchByID(int id){
        for (Media media : itemInStore) {
            if(media.getId() == id){
                System.out.println(media.toString());
                return media;
            }
        }
        return null;
    }
}
