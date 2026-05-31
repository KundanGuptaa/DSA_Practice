
// Write a program to FindTransposeofa Matrix.
// What is Transpose?Transpose of a matrix is the process ofswapping therows to columns. 
// For a 2x3 matrix,Matrix
// a11    a12    a13
// a21    a22    a23
// Transposed Matrix
// a11    a21
// a12    a22
// a13    a23
import java.util.*;

public class Q3 {
    // Expected input: first enter number of rows, then columns, followed by matrix elements row-wise.
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] matrix=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int[][] transpose = new int[col][row];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        for(int i=0;i<transpose.length;i++){
            for(int j=0;j<transpose[0].length;j++){
               System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
