import java.util.*;

public class factorial {

    public static int multiply(int a, int b) {
        int product;
        product = a * b;
        return product;

    }

    public static int factorial(int a) {
        int fac = 1;
        for (int i = 1; i <= a; i++) {
            fac *= i;
        }
        return fac;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number to find the Factorial:");
        int number = sc.nextInt();
        int fac = factorial(number);
        System.out.println("Factorial of " + number + "=" + fac);
    }
}
