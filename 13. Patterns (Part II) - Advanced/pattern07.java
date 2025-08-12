public class pattern07 {
    public static void hollow_rectangle(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop for space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // inner loop for hollow rectangle
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String args[]) {
        hollow_rectangle(10);
    }

}
