//import javax.swing.JOptionPane;
//public class ChoosingOption_6_1 {
//    public static void main(String[] args){
//        int option = JOptionPane.showConfirmDialog(null,
//                "Do you want to change to the first class ticket?");
//
//        JOptionPane.showMessageDialog(null,
//                "You have chosen: " + (option == JOptionPane.YES_OPTION? "Yes":"No"));
//
//        System.exit(0);
//    }
//}



import javax.swing.JOptionPane;
public class ChoosingOption_6_1 {
    public static void main(String[] args){
        String[] option = {"I do","I don't"};
        int choice = JOptionPane.showOptionDialog(null,
                "Do you want to change to the first class ticket?",
                "Select your option",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,option, option[0] );
        if (choice == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null,
                    "You have chosen: Yes");
        } else if (choice == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null,
                    "You have chosen: No");
        }

        System.exit(0);
    }
}
