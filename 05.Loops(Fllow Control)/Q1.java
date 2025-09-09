// Writeaprogramthatreadsasetofintegers,andthenprintsthesumoftheeven and odd integers

import java.util.*;

public class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number;
        int evenSum = 0;
        int oddSum = 0;
        int choice;

        do {
            System.out.print("Enter your Number:");
            number = sc.nextInt();

            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
            System.out.println("Enter 1 if you want to enter more number else 0 if want to stop");
            choice = sc.nextInt();
        } while (choice == 1);
        System.out.println("Sum of all Even numbers:" + evenSum);
        System.out.println("Sum of all Odd numbers:" + oddSum);

    }
}
