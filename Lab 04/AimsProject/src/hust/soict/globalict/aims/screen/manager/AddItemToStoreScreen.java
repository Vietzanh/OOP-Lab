package hust.soict.globalict.aims.screen.manager;

import hust.soict.globalict.aims.media.*;
import hust.soict.globalict.aims.store.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddItemToStoreScreen extends JFrame {
    private JTextField title;
    private JTextField category;
    private JTextField cost;
    private JButton submitButton;

    public AddItemToStoreScreen() {
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(new StoreManagerScreen().createNorth(), BorderLayout.NORTH);
        cp.add(addItem(), BorderLayout.CENTER);

        submitButton = new JButton("Submit");
        cp.add(submitButton, BorderLayout.SOUTH);
        submitButton.addActionListener(new InputListener());

        setTitle("Add item");
        setSize(1024, 768);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    JPanel addItem() {
        JPanel panel = new JPanel(new GridLayout(5, 2));

        title = new JTextField();
        category = new JTextField();
        cost = new JTextField();

        panel.add(new JLabel("Enter title: "));
        panel.add(title);
        panel.add(new JLabel("Enter category: "));
        panel.add(category);
        panel.add(new JLabel("Enter cost: "));
        panel.add(cost);

        return panel;
    }


    public class InputListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            if (title.getText().isEmpty() || category.getText().isEmpty() || cost.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null,
                        "All fields must be filled", null,
                        JOptionPane.ERROR_MESSAGE);

                title.setText("");
                category.setText("");
                cost.setText("");
            }
            else {
                JOptionPane.showMessageDialog(null,
                        "Item is added successfully", null,
                        JOptionPane.INFORMATION_MESSAGE);

                Media media = new Media(title.getText(),
                        category.getText(), Float.parseFloat(cost.getText()));
                StoreManagerScreen.store.addMedia(media);

                title.setText("");
                category.setText("");
                cost.setText("");
            }
        }
    }

//    public static void main(String[] args) {
//        new AddItemToStoreScreen();
//    }
}
