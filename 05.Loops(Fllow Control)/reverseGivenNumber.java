import java.util.*;
public class reverseGivenNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int givenNumber=sc.nextInt();
        int reversedNumber=0;
        while(givenNumber>0){
            int lastDigit=givenNumber%10;
            reversedNumber=(reversedNumber*10)+lastDigit;
            givenNumber/=10;
        }
        System.out.println(reversedNumber);
    }
}
