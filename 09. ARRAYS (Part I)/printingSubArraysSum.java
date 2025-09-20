public class printingSubArraysSum {
    public static void subArray(int numbers[]) {
        int ts = 0;
        int sum = 0;
        int SumArr[] = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " ");
                    ts++;
                    sum += numbers[k];
                }
                System.out.println();
            }
            //Find Sum of Sub Arrays
            SumArr[i] = sum;
            System.out.println("Sum of SubArrays =" + SumArr[i]);
            System.out.println();
            sum = 0;
        }
        //Finding Largest and Smallest SUb Arrays
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < SumArr.length; i++) {
            if (largest < SumArr[i]) {
                largest = SumArr[i];
            }
            if (smallest > SumArr[i]) {
                smallest = SumArr[i];
            }

        }
        System.out.println("Largest=" + largest);
        System.out.println("Smallest=" + smallest);
        System.out.println("Total SubArrays=" + ts);
    }

    public static void main(String args[]) {
        int arrays[] = { 3, 4, 5, 6, 7, 8, 9 };
        subArray(arrays);
    }

}
