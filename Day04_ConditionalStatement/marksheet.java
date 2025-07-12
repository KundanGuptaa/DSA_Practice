import java.util.*;

public class marksheet {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        String check = marks>=33 ? "PASS" : "FAIL";
        System.out.println(check);
    }
}
