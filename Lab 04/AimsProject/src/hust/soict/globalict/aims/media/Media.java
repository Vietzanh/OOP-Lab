package hust.soict.globalict.aims.media;
import java.util.Comparator;

public class Media implements Playable {
        private int id;
        private String title;
        private String category;
        private float cost;

        public Media(String title) {
                this.title = title;
        }
        public Media(String title, String category, float cost) {
                this.title = title;
                this.category = category;
                this.cost = cost;
        }
        public Media(int id, String title, String category, float cost) {
                this.id = id;
                this.title = title;
                this.category = category;
                this.cost = cost;
        }

        public int getId() {
                return id;
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

//        public static final Comparator<Media> COMPARE_BY_TITLE_COST =
//                new MediaComparatorByTitleCost();
//        public static final Comparator<Media> COMPARE_BY_COST_TITLE =
//                new MediaComparatorByCostTitle();

        public void play() {}
}
