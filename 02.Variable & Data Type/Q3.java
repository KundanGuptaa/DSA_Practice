// Question 3: Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
// an eraser. You have to output the total cost of the items back to the user as their bill.
// (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
import java.util.*;
public class Q3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float pencil=sc.nextFloat();
        float pen=sc.nextFloat();
        float eraser=sc.nextFloat();
        float total=pencil+pen+eraser;
        System.out.println("Total bill="+total);

        //Total Bill with 18% gst included
        float gstVal=(total/100)*18;
        float incGst=total+gstVal;
        System.out.println("Total Bill including 18% gst:"+incGst);

    }
}
