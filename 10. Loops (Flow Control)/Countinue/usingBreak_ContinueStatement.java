import java.util.*;

public class usingBreak_ContinueStatement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Your Number:");
            int unum = sc.nextInt();
            if (unum%10==0) {
                System.out.println("You Have Entered " + unum + ".\nThis is Multiple of 10");
                break;
            }
            else{
                continue;
            }
        }
    }
}