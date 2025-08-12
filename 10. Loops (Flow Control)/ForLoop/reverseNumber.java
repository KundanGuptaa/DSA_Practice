import java.util.*;
public class reverseNumber {
    public static void main(String args[]){
        int number = 987654321;
        int rev = 0;
        int lastDigit;
        for(int i=1;i<=number;i++)
        {
            lastDigit=number%10;
            rev = (rev*10)+ lastDigit;
            number/=10;
        }
        System.out.println(rev);
    }
}
