public class Question5 {
    public static void main(String[] args) {
        // Givan an integer array nums,find the contigous subarray which has the largest
        // sum and return its sum
        // Problem: you are given an circullar array nums[].
        // The task is to find the maximum sum of a subarray.
        int[]nums={1,2,3,4,5,6};
        int k=3;
        System.out.println(maxSumSubArray(nums, k));
    }
    public static int maxSumSubArray(int[]nums,int k){
        int maxSum=0,windowSum=0;
        for(int i=0;i<k;i++){
            windowSum+=nums[i];
        }
        maxSum=windowSum;
        for(int i=k;i<nums.length;i++){
            windowSum+=nums[i]-nums[i-k];
            maxSum=Math.max(maxSum, windowSum);
        }
        return maxSum;
    }
    
}
