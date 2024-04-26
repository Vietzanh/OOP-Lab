package hust.soict.globalict.aims.cart;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Media;
import java.util.ArrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Cart {
    public static final int MAX_NUMBER_ORDERD = 20;
    public ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    public void addMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            System.out.println("The " + media.getTitle() + " is already in the cart.");
        } else if (itemsOrdered.size() == 20) {
            System.out.println("The cart is full. Cannot add more.");
        } else {
            itemsOrdered.add(media);
            System.out.println(media.getTitle() + " has been added to the cart.");
        }
    }
    public void removeMedia(Media media) {
        if (itemsOrdered.isEmpty()) {
            System.out.println("The cart is emty.");
        } else if (!itemsOrdered.contains(media)) {
            System.out.println(media.getTitle() + " is not in the cart to be removed from the cart.");
        } else {
            itemsOrdered.remove(media);
            System.out.println(media.getTitle() + " has been removed.");
        }
    }
    //    calculate total cost
    public float totalCost(){
        float sum = 0;
        if (itemsOrdered.isEmpty()){
            return 0;
        }
        for(Media media : itemsOrdered){
            sum+=media.getCost();
        }
        return sum;
    }
    //print cart
    public void print(){
        System.out.println("***********************CART***********************");
        System.out.println("Ordered items:");
        for (int i=0;i<itemsOrdered.size();i++) {
            System.out.println((i+1) + ". DVD - " + itemsOrdered.get(i).toString());
        }

        System.out.println("Total cost: " + totalCost() + "$");
    }
    //search by ID
    public void searchByID() {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter DVDs' ID: ");
        int id = myObj.nextInt();  // Read user input

        int check = 0;
        for (Media media : itemsOrdered) {
            if (media.getId() == id) {
                System.out.println("DVD - " + media.toString());
                check+=1;
                break;
            }
        }
        if (check == 0) {
            System.out.println("No match is found.");
        }
    }
    //search by title
    public void searchByTitle() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter DVDs' name: ");
        String title = myObj.nextLine();

        int check = 0;
        for (Media media : itemsOrdered) {
            if (media.getTitle().equals(title)) {
                System.out.println("DVD - " + media.toString());
                check+=1;
                break;
            }
        }
        if (check == 0) {
            System.out.println("No match is found.");
        }
    }


}
