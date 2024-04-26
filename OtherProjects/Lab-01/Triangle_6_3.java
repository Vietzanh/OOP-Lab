import java.util.Scanner;
public class Triangle_6_3 {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please input n: ");
        int n = keyboard.nextInt();
        String space;
        String character = "*";
        for (int i=n-1;i>=0;i--)
        {
            space="";
            for (int j=1;j<=i;j++){
                space = space + " ";
            }
            System.out.println(space + character + space);
            character = character + "*" + "*";
        }
    }
}
