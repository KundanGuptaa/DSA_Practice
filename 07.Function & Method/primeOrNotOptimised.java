import java.util.*;
public class primeOrNotOptimised {
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your number :");
        int number=sc.nextInt();
        if(isPrime(number)){
            System.out.println("Number is prime");
        }else{
            System.out.println("Number is not prime.");
        }
    }
}
