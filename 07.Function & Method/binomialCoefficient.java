import java.util.*;

public class binomialCoefficient {
    public static int factorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static float coefficient(int n, int r) {
        int factN = factorial(n);
        int factR = factorial(r);
        int factNminusR = factorial(n - r);
        float coefficient = factN / (factR * factNminusR);
        return coefficient;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        System.out.println();
        System.out.print("Enter r:");
        int r = sc.nextInt();
        System.out.println("Binomial Coefficient:" + coefficient(n, r));
    }

}
