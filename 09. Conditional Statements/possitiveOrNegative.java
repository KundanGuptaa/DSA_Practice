import java.util.*;
public class possitiveOrNegative {
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number<0)
        {
            System.out.println("Given number is negative.");
        }
        else
        {
            System.out.println("Given number is positive.");
        }
    }
}
