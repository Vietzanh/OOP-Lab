package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.Comparator;

public class test {
    public static void main(String[] args) {
        ArrayList<Media> medias = new ArrayList<Media>();
        medias.add(new DigitalVideoDisc("The Lion King",
                "Animation", "John", 87, 16.5f));
        medias.add(new DigitalVideoDisc("The Lion King",
                "Animation", "John", 87, 20.5f));
        medias.add(new DigitalVideoDisc("Aladin",
                "Animation", "John", 87, 16.5f));

        for (Media media : medias) {
            System.out.println(media.toString());
        }
        medias.sort(new MediaComparatorByCostTitle());
//        Comparator<Media> COMPARE_BY_TITLE_COST =
//                new MediaComparatorByTitleCost();

        for (Media media : medias) {
            System.out.println(media.toString());
        }
//        System.out.println(Media.COMPARE_BY_TITLE_COST);
    }
}
