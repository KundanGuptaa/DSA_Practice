public class pattern06 {
    public static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void main(String args[]) {
        pattern(10);
    }
}
