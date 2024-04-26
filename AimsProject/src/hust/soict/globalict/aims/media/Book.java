package hust.soict.globalict.aims.media;
import java.util.ArrayList;
public class Book extends Media {
    private ArrayList<String> authors;
    public ArrayList<String> getAuthors() {
        return authors;
    }

    public Book(int id, String title, String category, float cost) {
        super(id,title,category,cost);
    }
    public void addAuthor(String authorName) {
        if (authors.contains(authorName)) {
            System.out.println("Author " + authorName + " has already been included.");
        } else {
            authors.add(authorName);
        }
    }
    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
        }
    }

    public String toString() {
        return getTitle() + " - " + getCategory() + ": " + getCost() + "$";
    }
}
