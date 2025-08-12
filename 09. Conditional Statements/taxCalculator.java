import java.util.*;

public class taxCalculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        if (income <= 5) {
            System.out.println("You are eligible fot 0% tax.");
        } else if (income > 5 && income < 10) {
            System.out.println("You are eligible fot 20% tax.");
        } else if (income > 10) {
            System.out.println("You are eligible fot 30% tax.");
        }
    }
}
