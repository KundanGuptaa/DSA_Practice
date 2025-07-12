import java.util.*;

public class factorialOfNumber {
    public static void main(String args[]) {
        int inputNumber;
        int factorial = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number to find the factorial:");
        inputNumber = sc.nextInt();
        for (int i = 1; i <= inputNumber; i++) {
            factorial*=i;
        }
        System.out.print("Factorial of " + inputNumber + "=" + factorial);
    }
}
