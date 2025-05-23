public class G37Problem1day2 {
    public static int maxSubArr(int[]nums){
        int maxSum=nums[0],currentSum=nums[0];
        for(int i=1;i<nums.length;i++){
            currentSum=Math.max(nums[i], currentSum+nums[i]);
            maxSum=Math.max(maxSum, currentSum);

        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[]nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArr(nums));
    }
    
}
