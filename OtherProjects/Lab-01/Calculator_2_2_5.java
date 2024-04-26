import javax.swing.JOptionPane;
public class Calculator_2_2_5 {
    public static void main(String[] args){
        String strNum1, strNum2, strOperation;
        double result = 0;

        strNum1 = JOptionPane.showInputDialog(null,
                "Please input the first number: ",
                "Input the first number",JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null,
                "Please input the second number: ",
                "Input the second number",JOptionPane.INFORMATION_MESSAGE);
        strOperation = JOptionPane.showInputDialog(null,
                "Please input the operation (+ for addition, - for subtraction, * for multiplication, / for division): ",
                "Input the operation",JOptionPane.INFORMATION_MESSAGE);

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        if (strOperation.equals("+")){
            result = num1 + num2;
        } else if (strOperation.equals("-")){
            result = num1 - num2;
        } else if (strOperation.equals("*")){
            result = num1 * num2;
        } else if (strOperation.equals("/")){
            result = num1 / num2;
        }

        JOptionPane.showMessageDialog(null, "The result is: " + result);

    }
}
