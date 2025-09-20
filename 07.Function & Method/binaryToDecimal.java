import java.util.*;

public class binaryToDecimal {
    public static void binaryToDecimalMethod(int binary) {
        int decimal = 0;
        int pow = 0;
        while (binary > 0) {
            int lastDigit = binary % 10;
            decimal = decimal + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            binary /= 10;
        }
        System.out.println("Decimal of binary " + binary + " = " + decimal);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your binary number:");
        int binary = sc.nextInt();
        binaryToDecimalMethod(binary);
    }

}
