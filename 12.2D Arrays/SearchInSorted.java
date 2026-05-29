import java.util.*;
public class SearchInSorted{
    public static boolean staircaseSearch(int matrix[][] ,int key){
        int row=0,col=matrix.length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key)
            {
                System.out.println("Elemet found at (" + row + "," + col );
                return true;
            }
            else if(key<matrix[row][col])
            {
                col--;
            }
            else
            {
                row++;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] matrix=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[n][m]=sc.nextInt();
            }
        }
        int key=sc.nextInt();
        staircaseSearch(matrix, key);
    }
}