package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;
public class Book extends Media {
    private List<String> authors = new ArrayList<String>();
    public Book(String title) {
        super(title);
    }
    public Book(String title, String category, float cost) {
        super(title, category, cost);
    }
    public Book(String title, String category,float cost,  ArrayList<String> authors) {
        super(title, category, cost);
        this.authors = authors;
    }
    public void addAuthor(String authorName) {
        if (authors.contains(authorName)) {
            System.out.println("Author already exists");
        } else {
            authors.add(authorName);
            System.out.println("Author added");
        }
    }
    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
            System.out.println("Author removed");
        } else {
            System.out.println("Author not found");
        }
    }
    public String toString() {
        return "Book: " +  super.toString() + " - " + authors.toString();
    }
}
