import java.util.*;
public class SumOfzfirst_N_NaturalNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter You Number Range:");
        int range = sc.nextInt();
        int count = 1;
        int sum = 0;
        while(count <= range){
            sum+=count;
            count++;
        }
        System.out.print("Sum:" + sum);

    }
}
