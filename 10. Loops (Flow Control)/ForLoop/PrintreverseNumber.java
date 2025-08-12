import java.util.*;
public class PrintreverseNumber {
    public static void main(String args[]){
        int n = 12345;
        System.out.println("Given number is:" + n);
        while(n>0)
        {
            int lastDigit = n % 10;
            System.out.print(lastDigit + " ");
            n/=10;
        }
    }
}
