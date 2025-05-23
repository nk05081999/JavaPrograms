import java.util.*;

public class TwoSumSorted {
    public static int[] twoSum(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1}; // No valid pair found
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 6, 8, 9};
        int target = 10;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result)); // Output: [1, 5]
    }
}
