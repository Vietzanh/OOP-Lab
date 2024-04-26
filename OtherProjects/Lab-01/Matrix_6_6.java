import java.util.Scanner;
public class Matrix_6_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the number of row: ");
        int row = scanner.nextInt();
        System.out.print("Input the number of column: ");
        int column = scanner.nextInt();

        int[][] matrix1 = new int[row][column];
        int[][] matrix2 = new int[row][column];
        int[][] matrix3 = new int[row][column];

        System.out.println("First matrix:");
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Second matrix:");
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                matrix2[i][j] = scanner.nextInt();
                matrix3[i][j] =  matrix2[i][j] + matrix1[i][j];
            }
        }

        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                matrix3[i][j] =  matrix2[i][j] + matrix1[i][j];
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix3[i][j]+ " ");
            }
            System.out.println();
        }
    }
}