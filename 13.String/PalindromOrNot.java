import java.util.*;
public class PalindromOrNot{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        boolean palindrome=false;
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)==str.charAt(str.length()-i-1)){
                palindrome=true;
            }
            else
            {
                palindrome=false;
            }
        }
        if(palindrome)
        {
            System.out.println(str + " is Palindrome");
        }
        else
        {
            System.out.println(str + " is not Palindrome");
        }
    }
}