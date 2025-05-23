public class KadanessAlgo {
    public static void main(String[] args) {
        // What is Kadanes Algorith:
        // Kadanes algo is an efficient way
        // Algorithm steps:
        // /Initilization:
        // Start the sum currentSum=0.
        // CurrentSum+currentElement
        // Example:
        // {1,-2,3,4,-1,2,1,-5,4}
        // Start: currentSum=0,maxSum=INTEGER.min_value
        // cureentSum=max(1,0+1) maxSum=max(-infi,1)
        // ?Secomd element:currentSum=max(-2,1-2x`x` maxSum=max(1,-1))
        // thirdf element currentSum=max(3,-1+3),maxSum=max(1,3)
        // fourth element(4):currentSum=max(4,3+4)=7maxSum=max(3,7)
        // fifth element:-1=currentSum=max(-1,7-1) maxSum=max(7,6)
        int[]nums={1,-2,3,4,-1,2,1,-5,4};
        System.out.println("Maximum Sum Subarray is: "+amxSubArraySum(nums));

        
    }
    public static int amxSubArraySum(int[]nums){
        if(nums==null||nums.length==0){
            return 0;
        }
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int num:nums){
            currentSum=Math.max(num, currentSum+num);
            maxSum=Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
    
}
