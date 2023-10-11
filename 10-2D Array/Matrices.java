//Creation Of 2D Arrays---------------------

import java.util.Scanner;

public class Matrices {

    public static void largeSmall(int matrix[][]){
        int largest = 0;
        int smallest = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == 0 && j == 0) {
                    largest = matrix[i][j];
                    smallest = matrix[i][j];
                }
                else if(matrix[i][j]>largest){
                    largest=matrix[i][j];
                }
                else if(matrix[i][j]<smallest){
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.println("Largest number = "+largest);
        System.out.println("Smallest number = "+smallest);
    }

    public static boolean search(int matrix[][], int key){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.print("Element FOund at Cell ("+i +","+j +")");
                    return true;
                }
            }
        }
        System.out.println("Key Not Found");
        return false;
    }
    public static void main(String args[]) {
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        //output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
    }
    //  search(matrix, 9);
    largeSmall(matrix);

    
}
    
}