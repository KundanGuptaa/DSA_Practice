import java.util.*;
public class maxminsumOfSubArray {
    public static void MinMAxSum(int numbers[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        int totalSubArray=0;
        int Currentsum=0;
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                Currentsum=0;
                for(int k=i;k<=j;k++){
                    Currentsum+=numbers[k];
                }
                System.out.print(Currentsum);
                if(largest<Currentsum){
                    largest=Currentsum;
                }
                if (smallest>Currentsum) {
                    smallest=Currentsum;
                }
                totalSubArray++;
                System.out.println();
            }
        }
        System.out.println("Total Sub Array="+totalSubArray);
        System.out.println("Largest sum of Sub arrays="+largest);
        System.out.println("Smallest sum of Sub arrays="+smallest);
    }
    public static void main(String args[]){
        int arrays[]={3,-4,-5,6,7,-8,-9};
        MinMAxSum(arrays);
    }
    
}
