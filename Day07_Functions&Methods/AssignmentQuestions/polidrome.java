import java.util.*;
public class polidrome {
    public static boolean isPolidrome(int num){
        int rev = 0;
        int lastDigit = 0;
        int ogNum= num;
        while(num!=0){
            lastDigit=num%10;
            rev = (rev*10)+lastDigit;
            num/=10;
        }
        if(rev==ogNum){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your number:");
        int num=sc.nextInt();
        System.out.println(isPolidrome(num));
    }
    
}
