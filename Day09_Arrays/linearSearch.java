public class linearSearch {
    public static int LinearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int key = 10;

        int index = LinearSearch(numbers, key);
        if (index == -1) {
            System.out.println("Number Not Found");
        } else {
            System.out.println("Number found at index=" + index);
        }
    }
}
