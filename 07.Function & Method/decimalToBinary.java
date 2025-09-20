import java.util.*;

public class decimalToBinary {
    public static void decimalToBinaryMethod(int decimal) {
        int number=decimal;
        int binary = 0;
        int pow = 0;
        while (decimal > 0) {
            int rem = decimal % 2;
            binary = binary + (rem * (int) Math.pow(10, pow));
            pow++;
            decimal/=2;
        }
        System.out.println("Binary of decimal " + number + " = " + binary);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your binary number:");
        int decimal = sc.nextInt();
        decimalToBinaryMethod(decimal);
    }
}
