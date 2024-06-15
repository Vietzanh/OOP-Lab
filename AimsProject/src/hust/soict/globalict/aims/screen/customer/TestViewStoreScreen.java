package hust.soict.globalict.aims.screen.customer;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.media.Book;
import hust.soict.globalict.aims.media.CompactDisc;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Track;
import hust.soict.globalict.aims.screen.customer.controller.ViewStoreController;
import hust.soict.globalict.aims.store.Store;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestViewStoreScreen extends Application{
    private static Store store;
    private static Cart cart;

    @Override
    public void start(Stage primaryStage) throws Exception {
        final String STORE_FXML_FILE_PATH = "/hust/soict/globalict/aims/screen/customer/view/Store.fxml";
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(STORE_FXML_FILE_PATH));
        ViewStoreController viewStoreController = new ViewStoreController(store, cart);
        fxmlLoader.setController(viewStoreController);
        Parent root = fxmlLoader.load();

        primaryStage.setTitle("Store");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        store = new Store();
        cart = new Cart();

        // Add items to store
        DigitalVideoDisc dvd1 = new DigitalVideoDisc(
                1,
                "The Lion King",
                "Animation",
                "Roger Allers",
                87,
                19.95f
        );
        store.addMedia(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc(
                2,
                "Star Wars",
                "Science Fiction",
                "George Lucas",
                50,
                24.95f
        );
        store.addMedia(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc(
                3,
                "Aladin",
                "Animation",
                "Guy Ritchie",
                20,
                18.99f
        );
        store.addMedia(dvd3);

        Book book1 = new Book(
                5,
                "Treasure Islands",
                "Adventure",
                99.9f
        );
        book1.addAuthor("Robert");

        store.addMedia(book1);

        launch(args);
    }
}
