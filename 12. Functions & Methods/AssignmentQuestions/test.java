import java.util.*;

public class test {
    public static void main(String args[]) {
        int num = 12321;
        int rev=0;
        int lastDigit;
        for (int i = 1; i <= num; i++) 
        {
            lastDigit = num % 10;
            rev = (rev*10)+lastDigit;
            num /= 10;
        }
        System.out.println(rev);
        System.out.println(num);
    }
}
