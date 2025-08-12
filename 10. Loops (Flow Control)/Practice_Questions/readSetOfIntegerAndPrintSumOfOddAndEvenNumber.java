import java.util.*;

public class readSetOfIntegerAndPrintSumOfOddAndEvenNumber {
    public static void main(String args[]) {
        int number;
        int evenSum = 0;
        int oddSum = 0;
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter Your number:");
            number = sc.nextInt();
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
            System.out.println("If you want to continue input 1(one) and if not input 0(Zero)");
            choice = sc.nextInt();
        } while (choice == 1);
        System.out.println("Sum of Even Numbers=" + evenSum + "\nSum of Odd numbers=" + oddSum);
    }
}