import java.util.Scanner;

public class findLargest_SmallestInMatrix {
    public static void largest(int matrix[][]) {
        int largest = Integer.MIN_VALUE;
        int idx[] = new int[2];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (largest < matrix[i][j]) {
                    largest = matrix[i][j];
                    idx[0] = i;
                    idx[1] = j;
                }
            }
        }
        System.out.println("Largest:" + matrix[idx[0]][idx[1]]);
        System.out.println("Largest Found at index:(" + idx[0] + "," + idx[1] + ")");
    }

    public static void smallest(int matrix[][]) {
        int smallest = Integer.MAX_VALUE;
        int idx[] = new int[2];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (smallest > matrix[i][j]) {
                    smallest = matrix[i][j];
                    idx[0] = i;
                    idx[1] = j;
                }
            }
        }
        System.out.println("Smallest:" + matrix[idx[0]][idx[1]]);
        System.out.println("Smallest Found at index:(" + idx[0] + "," + idx[1] + ")");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        largest(matrix);
        smallest(matrix);
    }
}
