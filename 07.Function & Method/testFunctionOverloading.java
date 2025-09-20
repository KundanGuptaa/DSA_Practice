public class testFunctionOverloading {
    // sum of two numbers
    public static int sum(int a, int b) {
        return a + b;
    }

    // sum of three numbers
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // sum of two number using diffrent data type
    public static float sum(float a, float b) {
        return a + b;
    }

    // sum of threer number using diffrent data type
    public static float sum(float a, float b, float c) {
        return a + b + c;
    }

    public static void main(String args[]){
        System.out.println("Sum of two int num:"+sum(5, 7));
        System.out.println("Sum of two int num:"+sum(12,15,16));
        System.out.println("Sum two float num:"+sum(1.2f,5.4f));
        System.out.println("Sum three float num:"+sum(1.2f, 4.8f, 5.6f));
    }
}
