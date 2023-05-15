import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows = keyboard.nextInt();
        System.out.println("Enter number of columns");
        int col = keyboard.nextInt();
        int[][] max1 = new int[rows][col];
        int[][] max2 = new int[rows][col];
        System.out.println("Enter matrix 1: ");
        for(int i =0 ;i<rows; i++){
            for(int j = 0; j< col;j++ ){
                max1[i][j] = keyboard.nextInt();
            }
        }
        System.out.println("Enter matrix 2: ");
        for(int i =0 ;i<rows; i++){
            for(int j = 0; j< col;j++ ){
                max2[i][j] = keyboard.nextInt();
            }
        }
        int[][] summax = new int[rows][col];
        System.out.println("Sum of matrices is: ");
        for(int i =0 ;i<rows; i++){
            for(int j = 0; j< col;j++ ){
                summax[i][j] = max1[i][j]+ max2[i][j];
                System.out.print(summax[i][j] + " ");
            }
            System.out.println();
        }
    }
}
