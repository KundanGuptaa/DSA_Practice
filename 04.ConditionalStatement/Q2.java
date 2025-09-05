
// FinishthefollowingcodesothatitprintsYouhaveafeverifyourtemperatureis above 100 and otherwise prints You don't have a fever.
import java.util.*;

public class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float temp = sc.nextFloat();
        if(temp>100){
            System.out.println("You have fever");
        }else{
            System.out.println("You don't have fever");            
        }

    }
}
