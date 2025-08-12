import java.util.*;

public class AreaOfCircle {
    public static void main(String agrs[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius:");
        float radius = sc.nextInt();
        float pi = 3.14f;
        float rsq=radius*radius;
        System.out.print("Area of Circle is:");
        System.out.println(pi*rsq);

    }
}
