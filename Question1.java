public class Question1 {
    public static void main(String[] args) {
        // Given an array of integers,find the sum of the largest contiggous 
        // Subarray,but you must exclude subarrays where is the sum is negative:

        // input:{1,-1,5,-2,3} target sum 3
    }
    public static int mAXSUMSUBARRAY(int[]nums){
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int num:nums){
            currentSum=Math.max(num, currentSum+num);
            if(currentSum<0){
                currentSum=0;
            }
            maxSum=Math.max(maxSum, currentSum);
        }
        return maxSum;

    }
    
}
