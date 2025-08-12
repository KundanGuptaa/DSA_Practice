import java.util.*;
public class printTableOfNumber {
    public static void main(String args[]){
        int number;
        int table=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter yout number to print table:");
        number = sc.nextInt();
        for(int i=1;i<=10;i++){
            table+=number;
            System.out.println(table);
        }
        
    }
}
