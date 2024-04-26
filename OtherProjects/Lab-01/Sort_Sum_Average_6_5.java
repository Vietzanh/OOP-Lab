import java.util.Scanner;
import java.util.Arrays;
public class Sort_Sum_Average_6_5 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input number of element: ");
        int n = keyboard.nextInt();
        System.out.println("Input the value of each element: ");
        int[] a = new int[n];

        double sum = 0;
        for (int i=0;i<=n-1;i++)
        {
            int element = keyboard.nextInt();
            a[i] = element;
            sum += element;
        }
        for (int i=0;i<=n-1;i++)
        {
            int min = i;
            for (int j=i;j<=n-1;j++)
            {
                if (a[j] < a[min]) min =j;
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        System.out.println("The array is: " + Arrays.toString(a) +
                "\nThe sum is: " + sum +
                "\nThe average of the array is " + sum / n);
    }
}