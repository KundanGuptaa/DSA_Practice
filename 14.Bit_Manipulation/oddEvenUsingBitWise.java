import java.util.*;
public class oddEvenUsingBitWise{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int bitMask=1;
        int n=sc.nextInt();
        if((n & bitMask)==0){
            System.out.print("Even");
        }else{
            System.out.print("Odd");
        }
        sc.close();
    }
}