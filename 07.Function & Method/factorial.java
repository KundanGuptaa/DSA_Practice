import java.util.*;

public class factorial {
    public static int factorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number to find the factorial");
        int num = sc.nextInt();
        System.out.println("Factorial of " + num + "=" + factorial(num));
    }
}
