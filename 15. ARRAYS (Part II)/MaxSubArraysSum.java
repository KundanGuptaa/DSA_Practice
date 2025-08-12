public class MaxSubArraysSum {
    public static void MaxSubArraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum =" + maxSum);
    }

    public static void main(String args[]) {
        int arrays[] = { 1, -2, 6, -1, 3 };
        MaxSubArraySum(arrays);
    }

}
