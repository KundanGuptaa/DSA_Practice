import java.util.*;
public class printReverseGivenNumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int givenNumber=sc.nextInt();
        while(givenNumber>0){
            int lastDigit=givenNumber%10;
            System.out.print(lastDigit);
            givenNumber/=10;
        }
        System.out.println();
    }
}