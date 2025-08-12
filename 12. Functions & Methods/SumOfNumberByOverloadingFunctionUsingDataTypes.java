import java.util.*;

public class SumOfNumberByOverloadingFunctionUsingDataTypes {
    // Sum of two numbers using integer
    public static int sum(int a, int b) {
        return a + b;
    }

    // Sum of three numbers using float
    public static float sum(float a, float b) {
        return a + b;
    }

    public static void main(String args[]) {
        System.out.println(sum(3,4));
    }
}
