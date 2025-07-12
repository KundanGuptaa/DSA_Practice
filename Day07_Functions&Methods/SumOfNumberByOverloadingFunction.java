import java.util.*;

public class SumOfNumberByOverloadingFunction {
//Sum of two numbers
    public static int sum(int a,int b){
        return a+b;
}
//Sum of three numbers
public static int sum(int a,int b, int c){
    return a+b+c;
}
public static void main(String args[]){
    int  a = 10;
    int b = 12;
    int c = 13;
    System.out.println(sum(a,b));
    System.out.println(sum(a,b,c));
}
}
