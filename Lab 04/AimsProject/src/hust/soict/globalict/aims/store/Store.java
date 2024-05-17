package hust.soict.globalict.aims.store;
import hust.soict.globalict.aims.media.Media;
import java.util.ArrayList;

public class Store {
    public ArrayList<Media> itemsInStore = new ArrayList<Media>();
    public void addMedia(Media media) {
        itemsInStore.add(media);
        System.out.println("The DVD \"" + media.getTitle() + "\" has been added to store.");
    }
    public void removeMedia(Media media) {
        if (itemsInStore.isEmpty()) {
            System.out.println("The store is empty. Cannot remove any item.");
        } else if (itemsInStore.contains(media)) {
            itemsInStore.remove(media);
            System.out.println("The DVD \"" + media.getTitle() + "\" has been removed from the store.");
        } else {
            System.out.println("No item found.");
        }
    }
    public void print(){
        System.out.println("***********************STORE***********************");
        System.out.println("Ordered items:");
        for (int i=0;i<itemsInStore.size();i++) {
            System.out.println((i+1) + ". DVD - " + itemsInStore.get(i).toString());
        }
    }
    //public ArrayList<Media> getItemsInStore()
}
