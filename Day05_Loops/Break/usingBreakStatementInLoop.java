import java.util.*;
public class usingBreakStatementInLoop{
    public static void main(String args[]){
        int counter = 1;
        while(counter<=10){
            System.out.print(counter +" ");
            counter++;
            if (counter>=7) {
                break;
            }
        }
    }
}