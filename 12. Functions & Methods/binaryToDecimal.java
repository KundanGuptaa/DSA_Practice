import java.util.*;
public class binaryToDecimal {
    public static void binToDec(int n) {
        int pow = 0;
        int dec = 0;
        int num = n;
        while (n > 0) {
            int lastDigit = n % 10;
            dec = dec + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            n = n / 10;
        }
        System.out.println("Decimal of" + num + "=" + dec);
    }
    public static void main(String args[]){
        binToDec(111);
    }
}
