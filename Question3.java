public class Question3 {
    public static void main(String[] args) {
        // find the length of the largest subarray with the sum equal to 
        // the given target
        // 
        
    }
    public static int maxSubArraySum(int []nums){
        int cureentSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int num:nums){
            cureentSum=Math.max(num, cureentSum+num);
            if(cureentSum<0){
                cureentSum=0;
            }
            maxSum=Math.max(maxSum, cureentSum);
        }
        return maxSum;
    }
    
}
