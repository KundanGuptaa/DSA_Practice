import java.util.*;
public class reversingArrayData {
    public static void reverseArray(int numbers[]){
        int first=0,last=numbers.length-1;
        while(first<last){
            int temp=numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;
            first++;
            last--;
        }
    }
    public static void main(String args[]){
        int numbers[]={9,8,7,6,5,4,3,2,1};
        reverseArray(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+"  ");
        }
    }
}
