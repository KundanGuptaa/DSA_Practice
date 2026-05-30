
// Print out the sum of the numbers inthe second row of the “nums” array.
// Example :Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };Output - 18
import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int j = 0; j < col; j++) {
            sum += matrix[1][j];
        }
        System.out.println(sum);
    }
}
