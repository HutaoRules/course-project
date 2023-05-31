package hust.soict.dsai.aims.media;
import java.util.Collections;

import java.util.Comparator;

public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost;
    private static int nbMedia = 0;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }
    public float getCost() {
        return cost;
    }
    public Media(String title){
        this.title = title;
        this.id = nbMedia;
        nbMedia++;
    }
    public Media(String title, String category){
        this(title);
        this.category = category;
        this.id = nbMedia;
    }
    public Media(String title, String category, float cost){
        this(title, category);
        this.cost = cost;
        this.id = nbMedia;
    }
    public boolean equals(Object obj) {
        if (obj instanceof Media) {
            Media media = (Media) obj;
            if (this.title == media.getTitle()){
                return true;
            }
        }
        return false;
    }
    public String toString() {
        return  title + " - " + category + " - " + cost;
    }
    public static final Comparator<Media> COMPARATOR_BY_TITLE_COST = new MediaComparatorByTitleCost() ;
    public static final Comparator<Media> COMPARATOR_BY_COST_TITLE = new MediaComparatorByCostTitle() ;
    public static void sortByTitleCost(java.util.ArrayList<Media> list) {
        Collections.sort(list, COMPARATOR_BY_TITLE_COST);
    }
    public static void sortByCostTitle(java.util.ArrayList<Media> list) {
        Collections.sort(list, COMPARATOR_BY_COST_TITLE);
    }
}
