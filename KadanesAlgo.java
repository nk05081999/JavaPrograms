public class KadanesAlgo {
    public static void main(String[] args) {
        // {1,-2,3,4,-1,2,1-5,4}
        // Initilization
        // currentSum=0
        // maxSum=INTEGER>MIN_VALUE;
        // elementFirst(1):currentSum=max(1,0+1),maxSum=max(-infi,1
        // currentSum=max() maxSum(1,-1)
        int[]nums={1,-2,3,4,-1,2,1,-5,4};
        System.out.println("maximum sum of subarray is "+maxSubArraySum(nums));

        
    }
    public static int maxSubArraySum(int[]nums){
        int maxSum=nums[0];
        int cureentSum=0;
        for(int num:nums){
            cureentSum=Math.max(num, cureentSum+num);
            maxSum=Math.max(maxSum, cureentSum);
        }
        return maxSum;
    }
    
}
