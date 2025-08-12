import java.util.*;
public class printOneTOn {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Range:");
        int range = sc.nextInt();
        int count = 1;
        while (count <= range) {
            System.out.print(count + " ");
            count++;
        }
    }
}
