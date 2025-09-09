// Write a program to find the factorial of any number entered by the user
import java.util.*;
public class Q2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int fact=1;
        for(int i=1;i<=number;i++){
            fact*=i;
        }
        System.out.println("Factorial of"+number+":"+fact);
    }
}
