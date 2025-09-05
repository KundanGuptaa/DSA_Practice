
// WriteaJavaprogramthattakesayearfromtheuserandprintwhetherthatyear is a leap year or not.
import java.util.*;

public class Q4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                System.out.println("Leap year");
            } else if (year % 400 == 0) {
                System.out.println("Leap yaer");

            } else {
                System.out.println("Not leap year");
            }
        } else {
            System.out.println("Not leap year");
        }
    }
}
