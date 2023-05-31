package hust.soict.dsai.aims;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.*;

import java.util.ArrayList;
import java.util.Scanner;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.store.Store;

public class Aims {
    Store store = new Store();
    Cart cart = new Cart();
    int choice;
    Scanner sc = new Scanner(System.in);
    public static void showMenu(){
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }
    public void show(){
        boolean runtime = true;
        while (runtime){
            showMenu();
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    showStore();
                    break;
                case 2:
                    System.out.println("Options: ");
                    System.out.println("--------------------------------");
                    System.out.println("1. Add a media");
                    System.out.println("2. Remove a media");
                    int choice1 = sc.nextInt();
                    switch (choice1) {
                        case 1:
                            System.out.println("Options: ");
                            System.out.println("--------------------------------");
                            System.out.println("1. Add a book");
                            System.out.println("2. Add a DVD");
                            System.out.println("3. Add a CD");
                            int choice2 = sc.nextInt();
                            switch (choice2){
                                case 1:
                                    System.out.println("Enter the title of the book: ");
                                    String title = sc.nextLine();
                                    System.out.println("Enter the category of the book: ");
                                    String category = sc.nextLine();
                                    System.out.println("Enter the cost of the book: ");
                                    float cost = sc.nextFloat();
                                    System.out.println("Enter the author of the book: ");
                                    ArrayList<String> author = new ArrayList<String>();
                                    String authorName = sc.nextLine();
                                    String[] authors =  authorName.split(" ");
                                    for (String a: authors){
                                        author.add(a);
                                    }
                                    System.out.println("Enter the content of the book: ");
                                    String content = sc.nextLine();
                                    Book book = new Book(title, category, cost, author);
                                    store.addMedia(book);
                                    break;
                                case 2:
                                    System.out.println("Enter the title of the DVD: ");
                                    title = sc.nextLine();
                                    System.out.println("Enter the category of the DVD: ");
                                    category = sc.nextLine();
                                    System.out.println("Enter the cost of the DVD: ");
                                    cost = sc.nextFloat();
                                    System.out.println("Enter the director of the DVD: ");
                                    String director = sc.nextLine();
                                    System.out.println("Enter the length of the DVD: ");
                                    int length = sc.nextInt();
                                    DigitalVideoDisc dvd = new DigitalVideoDisc(title, category, director, length, cost);
                                    store.addMedia(dvd);
                                    break;
                                case 3:
                                    System.out.println("Enter the title of the CD: ");
                                    title = sc.nextLine();
                                    System.out.println("Enter the category of the CD: ");
                                    category = sc.nextLine();
                                    System.out.println("Enter the cost of the CD: ");
                                    cost = sc.nextFloat();
                                    System.out.println("Enter the director of the CD: ");
                                    director = sc.nextLine();
                                    System.out.println("Enter the artist of the CD: ");
                                    String artist = sc.nextLine();
                                    System.out.println("Enter the length of the CD: ");
                                    ArrayList<Track> tracks = new ArrayList<Track>();
                                    CompactDisc cd = new CompactDisc(title, category, director, cost, artist, tracks);
                                    store.addMedia(cd);
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("Enter the title of the media: ");
                            String title = sc.nextLine();
                            Media med = store.searchByTitle(title);
                            store.removeMedia(med);
                            break;
                    }



                    break;
                case 3:
                    showCart();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    runtime = false;
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }
    public static void storeMenu(){
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media's detail");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }
    public void showStore(){
        boolean runtime = true;
        while (runtime){
            storeMenu();
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter the title of the media: ");
                    String title = sc.nextLine();
                    Media media = store.searchByTitle(title);
                    if (media != null){
                        media.toString();
                        mediaDetailMenu();
                        showMedia(media);
                    } else {
                        System.out.println("Media not found!");
                    }
                    break;
                case 2:
                    System.out.println("Enter the title of the media: ");
                    title = sc.nextLine();
                    media = store.searchByTitle(title);
                    if (media != null){
                        cart.addMedia(media);
                    } else {
                        System.out.println("Media not found!");
                    }
                    break;
                case 3:
                    System.out.println("Enter the title of the media: ");
                    title = sc.nextLine();
                    media = store.searchByTitle(title);
                    if (media != null){
                        if (media instanceof DigitalVideoDisc){
                            ((DigitalVideoDisc) media).play();
                        } else if (media instanceof CompactDisc){
                            ((CompactDisc) media).play();
                        }else {
                            System.out.println("This media is not playable!");
                        }
                    } else {
                        System.out.println("Media not found!");
                    }
                    break;
                case 4:
                    cart.getDetail();
                    cartMenu();
                    break;
                case 0:
                    runtime = false;
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }
    public static void mediaDetailMenu(){
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Play");
        System.out.println("2. Add to cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }
    public void showMedia(Media media){
        while (true){
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    cart.addMedia(media);
                    break;
                case 2:
                    if (media instanceof DigitalVideoDisc){
                        ((DigitalVideoDisc) media).play();
                    } else if (media instanceof CompactDisc){
                        ((CompactDisc) media).play();
                    }else {
                        System.out.println("This media is not playable!");
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }
    public static void cartMenu(){
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove a media");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }
    public void showCart(){
        boolean runtime = true;
        while (runtime){
            cartMenu();
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Options: ");
                    System.out.println("--------------------------------");
                    System.out.println("1. Filter by ID");
                    System.out.println("2. Filter by title");
                    int choice1 = sc.nextInt();
                    switch (choice1){
                        case 1:
                            System.out.println("Enter the ID: ");
                            int id = sc.nextInt();
                            Media med = cart.searchByID(id);
                            if (med != null){
                                med.toString();
                            } else {
                                System.out.println("Media not found!");
                            }
                            break;
                        case 2:
                            System.out.println("Enter the title: ");
                            String title = sc.nextLine();
                            med = cart.searchByTitle(title);
                            if (med != null){
                                med.toString();
                            } else {
                                System.out.println("Media not found!");
                            }
                            break;
                        default:
                            System.out.println("Invalid choice!");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Options: ");
                    System.out.println("--------------------------------");
                    System.out.println("1. Sort by Cost");
                    System.out.println("2. Sort by title");
                    choice1 = sc.nextInt();
                    switch (choice1){
                        case 1:
                            cart.sortByCost();
                            break;
                        case 2:
                            cart.sortByTitle();
                            break;
                        default:
                            System.out.println("Invalid choice!");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Enter the title: ");
                    String title = sc.nextLine();
                    Media med = cart.searchByTitle(title);
                    if (med != null){
                        cart.removeMedia(med);
                    } else {
                        System.out.println("Media not found!");
                    }
                    break;
                case 4:
                    System.out.println("Enter the title: ");
                    title = sc.nextLine();
                    med = cart.searchByTitle(title);
                    if (med != null){
                        if (med instanceof DigitalVideoDisc){
                            ((DigitalVideoDisc) med).play();
                        } else if (med instanceof CompactDisc){
                            ((CompactDisc) med).play();
                        }else {
                            System.out.println("This media is not playable!");
                        }
                    } else {
                        System.out.println("Media not found!");
                    }
                    break;
                case 5:
                    System.out.println("Order is created!");
                    cart = new Cart();
                    break;
                case 0:
                    runtime = false;
                    break;
            }
        }
    }
    public static void main(String[] args) {
        Aims aims = new Aims();
        aims.show();
    }
}

