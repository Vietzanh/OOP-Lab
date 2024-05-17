package hust.soict.globalict.aims.media;

public class DigitalVideoDisc extends Disc {
    public DigitalVideoDisc(String title) {
        super(title);
    }
    public DigitalVideoDisc(String title, String category, float cost) {
        super(title,category,cost);
    }
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super(title, category, director, cost);
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, director, length, cost);
    }

    public String toString() {
        return getTitle() + " - " + getCategory() + " - " + getDirector()
                + " - " + getLength() + ": " + getCost() + "$";
    }
    public boolean isMatchId(DigitalVideoDisc disc[], int id, int qtyOrdered) {
        for (int i=0;i<qtyOrdered;i++) {
            if (disc[i].getId() == id) {
                return true;
            }
        }
        return false;
    }
    public boolean isMatchTitle(DigitalVideoDisc disc[], String title, int qtyOrdered) {
        for (int i=0;i<qtyOrdered;i++) {
            if (disc[i].getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }

    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}