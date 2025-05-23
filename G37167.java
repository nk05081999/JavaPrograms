import java.util.Arrays;

public class G37167{
    // Finding two numbers that add up to a specific target(Sorted array)

    // Approach:
    // Two pointer tech.
    // Use two pointers one on the start(left) and one at the end(right)
    // if nums[left]+nums[right]==target return the indicess
    // if the sum is less then the target, move left forward
    //  if the small is greater then the target,move right backward

    public static int[]twoSum(int[]numbers,int target){
        int left=0,right=numbers.length-1;
        while (left<right) {
            int sum=numbers[left]+numbers[right];
            if(sum==target){
                return new int[]{left+1,right+1};
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
            
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[]numbers={2,7,11,15};
        int target=9;
        System.out.println("indices "+Arrays.toString(twoSum(numbers, target)));
    }
}