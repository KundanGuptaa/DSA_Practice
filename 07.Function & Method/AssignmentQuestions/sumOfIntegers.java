import java.util.*;

public class sumOfIntegers {
    public static int sum(int num) {
        int sum = 0;
        int lastDigit;
        while (num != 0) {
            lastDigit = num % 10;
            sum = sum + lastDigit;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your integer to find the sum:");
        int num = sc.nextInt();
        System.out.println("Sum of "+num+"="+sum(num));
    }
}
