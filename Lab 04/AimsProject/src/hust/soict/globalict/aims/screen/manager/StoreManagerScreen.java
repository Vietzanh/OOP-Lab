package hust.soict.globalict.aims.screen.manager;
import hust.soict.globalict.aims.store.*;
import hust.soict.globalict.aims.media.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class StoreManagerScreen extends JFrame {
    public static Store store;

    public StoreManagerScreen() {
//        for (Media item : store.itemsInStore) {
//            store.addMedia(item);
//        }
//        StoreManagerScreen.store = store;

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(createNorth(), BorderLayout.NORTH);
        cp.add(createCenter(), BorderLayout.CENTER);

        setTitle("Store");
        setSize(1024, 768);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public JPanel createNorth() {
        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
        north.add(createMenuBar());
        north.add(createHeader());
        return north;
    }

    public JMenuBar createMenuBar() {
        JMenu menu = new JMenu("Options");

        JMenuItem viewStore = new JMenuItem("View store");
        menu.add(viewStore);

        JMenu smUpdateStore = new JMenu("Update Store");
        JMenuItem addBook = new JMenuItem("Add book");
        smUpdateStore.add(addBook);
        JMenuItem addCD = new JMenuItem("Add CD");
        smUpdateStore.add(addCD);
        JMenuItem addDVD = new JMenuItem("Add DVD");
        smUpdateStore.add(addDVD);
        menu.add(smUpdateStore);

        viewStore.addActionListener(new ViewStoreListener());
        addBook.addActionListener(new AddBookListener());
        addCD.addActionListener(new AddCDListener());
        addDVD.addActionListener(new AddDVDListener());

        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        menuBar.add(menu);

        return menuBar;
    }

    public class ViewStoreListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt){
            dispose();
            new StoreManagerScreen();
        }
    }

    public class AddBookListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt){
            new AddBookToStoreScreen();

        }
    }

    public class AddCDListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt){
            new AddCompactDiscToStoreScreen();

        }
    }

    public static class AddDVDListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt){
            new AddDigitalVideoDiscToStoreScreen();

        }
    }

    public static JPanel createHeader() {
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));

        JLabel title = new JLabel("AIMS");
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
        title.setForeground(Color.CYAN);

        header.add(Box.createRigidArea(new Dimension(10, 10)));
        header.add(title);
        header.add(Box.createHorizontalGlue());
        header.add(Box.createRigidArea(new Dimension(10, 10)));

        return header;
    }

    public static JPanel createCenter() {
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(3,3,2,2));

        if (StoreManagerScreen.store == null) {
            Media cell = new Media("","",23);
        }
        else {
            ArrayList<Media> mediaInStore = StoreManagerScreen.store.itemsInStore;
            int itemCount = Math.min(mediaInStore.size(), 9); //ensure not iterate beyond 9
            for (int i=0;i<itemCount;i++) {
                MediaStore cell = new MediaStore(mediaInStore.get(i));
                center.add(cell);
            }
        }
        return center;
    }

    public static void main(String[] args) {
        store = new Store();
        new StoreManagerScreen();
    }
}
