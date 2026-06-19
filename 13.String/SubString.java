import java.util.*;
public class SubString{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String subStr="";
        int si=sc.nextInt();
        int ei=sc.nextInt();
        for(int i=si;i<ei;i++){
            subStr+=str.charAt(i);
        }
        System.out.println(subStr);
        sc.close(); 
    }
}