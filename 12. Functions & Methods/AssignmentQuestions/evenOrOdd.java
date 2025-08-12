import java.util.*;
public class evenOrOdd {
    public static boolean isEven(int a){
        if(a%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number to check it's Even or Odd.");
        int num=sc.nextInt();
        System.out.println(isEven(num));
    }
}
