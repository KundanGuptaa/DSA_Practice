import java.util.*;

public class binomialCoefficient {
    public static int factorial(int a) {
        int fac = 1;
        for (int i = 1; i <= a; i++) {
            fac *= i;
        }
        return fac;
    }
    public static int bioCoeff(int n, int r){
        int n_fac = factorial(n);
        int r_fac = factorial(r);
        int n_r_fac = factorial(n-r);
        int bioCoeff = n_fac/(r_fac*(n_r_fac));
        return bioCoeff;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n:"); 
        int n = sc.nextInt();
        System.out.print("\nEnter value of r:");
        int r = sc.nextInt();
        System.out.println(bioCoeff(n, r));
    }
}
