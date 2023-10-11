public class Questions {
    public static void main(String[] args) {
    
    //Print No. of 7's in 2d Array Given?----------------------------------
        // int array[][] = {{4, 7, 8}, {8, 8, 7}};
        // int count =0;

        // for (int i = 0; i < array.length; i++) {
        //     for (int j = 0; j < array[0].length; j++) {
        //         if (array[i][j] == 7) {
        //             count++;
        //         }
        //     }
        // }
        // System.out.println("COunt of 7 is: "+count);

     //Print out the sum of the no. in second row of array?-----------------------------------
        // int nums[][] ={{1, 4, 9},{11,4,3},{2,2,3}};
        // int sum = 0;

        // for (int j = 0; j < nums[0].length; j++) {
        //     sum += nums[2][j];
        // }
        // System.out.println("sum of second row is "+sum);

    //Print out the Transpose Of MATRIX-----------------------------------
        int row = 2, column = 3;
        int matrix[][] ={{2,3,7},{5,6,7}};

        //display original matrix
        printMatrix(matrix);

        //Transpose the matrix
        int transpose[][] = new int[column][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        //print transpose matrix
        printMatrix(transpose);
    }

    public static void printMatrix(int matrix[][]){
        System.out.println("The Matrix is: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
