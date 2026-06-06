import java.util.*;

public class SortestPath {
    public static float getShortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            // South
            if (dir == 'S') {
                y--;
            }
            // North
            else if (dir == 'N') {
                y++;
            }
            // West
            else if (dir == 'W') {
                x--;
            }
            // East
            else {
                x++;
            }
        }
        int y2 = y * y;
        int x2 = x * x;
        return (float) Math.sqrt(x2 + y2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));

    }
}
