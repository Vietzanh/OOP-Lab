package hust.soict.globalict.aims;
import hust.soict.globalict.aims.cart.Cart;
import java.util.Comparator;
import java.util.Scanner;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.store.Store;
import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.media.MediaComparatorByTitleCost;
import hust.soict.globalict.aims.media.MediaComparatorByCostTitle;


public class Aims{
    //show Menu
    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }
    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }
    public static void mediaDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }
    public static void cartMenu() {
        System.out.println("Options:");
        System.out.println("--------------------------------");
        System.out.println("1. Filter media in cart");
        System.out.println("2. Sort media in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place an order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }

    public static void main(String[] args) {
        Store store = new Store();
        Cart cart = new Cart();
        cart.addMedia(new DigitalVideoDisc("The Lion King",
                "Animation", "John", 87, 16.5f));
        cart.addMedia(new DigitalVideoDisc("The Lion King",
                "Animation", "John", 87, 20.5f));
//        cart.addMedia(new DigitalVideoDisc("Aladin",
//                "Animation", "John", 87, 16.5f));

        store.addMedia(new DigitalVideoDisc("The Lion King",
                "Animation", "John", 87, 16.5f));
        store.addMedia(new DigitalVideoDisc("The Lion King",
                "Animation", "John", 87, 20.5f));
        store.addMedia(new DigitalVideoDisc("Aladin",
                "Animation", "John", 87, 16.5f));

        while (true) {
            showMenu();
            System.out.println("What is your option?");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            // choose option "1. View store"
            if (choice == 1) {
                store.print();

                while (true) {
                    storeMenu();
                    System.out.println("What is your option?");
                    int choice1 = scanner.nextInt();
                    // choose option "1.1. See a media's details"
                    if (choice1 == 1) {
                        System.out.println("What item do you wan to see?");
                        Scanner scanner1 = new Scanner(System.in);
                        String title = scanner1.nextLine();

                        int check = 0;
                        for (Media media : store.itemsInStore) {
                            if (media.getTitle().equals(title)) {
                                System.out.println(media.toString());
                                mediaDetailsMenu();
                                check = 1;
                                break;
                            }
                        }
                        if (check == 0) {
                            System.out.println("Not available.");
                        }
                    }

                    // choose option "1.2. Add a media to cart"
                    else if (choice1 == 2) {
                        System.out.println("Items in Store: ");
                        for (Media media : store.itemsInStore) {
                            System.out.println(media.toString());
                        }

                        System.out.println("What item do you want to add to cart?");
                        Scanner scanner2 = new Scanner(System.in);
                        String title = scanner2.nextLine();

                        int check = 0;
                        for (Media media : cart.itemsOrdered) {
                            if (media.getTitle().equals(title)) {
                                System.out.println(media.getTitle() + " is already in cart.");
                                check = 1;
                                break;
                            }
                        }

                        if (check == 0) {
                            for (Media media : store.itemsInStore) {
                                if (media.getTitle().equals(title)){
                                    cart.addMedia(media);
                                    check = 1;
                                    break;
                                }
                            }
                            if (check == 0) {
                                System.out.println("This item is not available.");
                            }
                        }
                        System.out.println("Number of items in cart: " + cart.itemsOrdered.size());
                    }

                    // choose option "1.3. Play a media"
                    else if (choice1 == 3) {
                        System.out.println("Items in Store: ");
                        for (Media media : store.itemsInStore) {
                            System.out.println(media.toString());
                        }

                        System.out.println("What item do you want to play?");
                        Scanner scanner2 = new Scanner(System.in);
                        String title = scanner2.nextLine();

//                        for (Media media : cart.itemsOrdered) {
//                            if (media.getTitle().equals(title)) {
//                                System.out.println(media.getTitle() + " is already in cart.");
//                                check = 1;
//                                return;
//                            }
//                        }

                        int check = 0;
                        if (check == 0) {
                            for (Media media : store.itemsInStore) {
                                if (media.getTitle().equals(title)){
                                    media.play();
                                    check = 1;
                                    break;
                                }
                            }
                            if (check == 0) {
                                System.out.println("This item is not available.");
                            }
                        }
                    }

                    // choose option "Back"
                    else if (choice1 == 0) {
                        break;
                    }

                    // invalid option
                    else {
                        System.out.println("Option is invalid. Choose again.");
                    }
                }
            }

            // choose option "2. Update store"
            else if (choice == 2) {
                System.out.println("Add or Remove item?");
            }

            // choose option "3. See current cart"
            else if (choice == 3) {
                cart.print();

                while (true) {
                    cartMenu();

                    System.out.println("What is your option?");
                    int choice3 = scanner.nextInt();

                    // choose option "3.1. Filter media in cart"
                    if (choice3 == 1) {
                        System.out.println("Filtering by ID or title?");
                        String filter = scanner.nextLine();
                    }

                    // choose option "3.2. Sort media in cart"
                    else if (choice3 == 2) {
                        System.out.println("Sorting by title or cost?");
                        Scanner scanner3 = new Scanner(System.in);
                        String sort = scanner3.nextLine();

                        if (sort.equals("title")) {
                            cart.itemsOrdered.sort(new MediaComparatorByTitleCost());
                            cart.print();
                        }

                        if (sort.equals("cost")) {
                            cart.itemsOrdered.sort(new MediaComparatorByCostTitle());
                            cart.print();
                        }
                    }

                    // choose option "3.3. Remove media from cart"
                    else if (choice3 == 3) {
                        System.out.println("REMOVE MEDIA FROM CART.");
                    }

                    // choose option "3.4. Play a media"
                    else if (choice3 == 4) {
                        System.out.println("PLAY A MEDIA.");
                    }

                    // choose option "3.5. Place order"
                    else if (choice3 == 5) {
                        System.out.println("PLACE OREDER.");
                    }

                    // choose option "3.0. Back"
                    else if (choice3 == 0) {
                        break;
                    }

                    // invalid option
                    else {
                        System.out.println("Invalid option. Choose again.");
                    }
                }
            }

            // choose option "4. Back"
            else if (choice == 0) {
                break;
            }

            // invalid option
            else {
                System.out.println("Option is invalid. Choose again.");
            }
        }
    }
}


