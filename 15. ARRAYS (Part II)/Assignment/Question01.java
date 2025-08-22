// Question 1: Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
// Example 1:
// Input: nums = [1, 2, 3, 1] Output: true
// Example 2:
// Input: nums = [1, 2, 3, 4] Output: false
// Example 3:
// Input: nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
// Output: true
public class Question01 {
    public static boolean twiceOrNot(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        int numbers[]={1,2,3,4,5,6};
        boolean ans=twiceOrNot(numbers);
        System.out.println(ans);
    }
}