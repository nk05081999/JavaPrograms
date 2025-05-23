public class KadanesAlgo2 {
    public static void main(String[] args) {
        // Steps of kadanes algo:
        // initilization:
        //  [1,-2,3,4,-1,2,1,-5,4]
        // start:currentSum=0,maxSum=Integer.min_value
        // First Ele(1):cureentSum=max(1,0+1)1,maxSum=max(_In,1)1
        // Second element(-2): currentSum: max(-2,1-2)=-1,maxSum=max(1,-1)=1
        // Third Element(3):currentSum=max(3,-1+3)=3maxSum=3
        // fourth Element(4):currentSum=max(4,3+4)=7,maxSum=max(3,7)=7
        // fifth element(-1) currentSum=max(-1,7-1)=6,maxSum=max(7,6)=7
        // Sixth Element ( 2) currentSum=max(2,6+2) 8 maxSum=max(7,8)=8
        // Seventh element(1):currentSum=max(1,8+1)=9 maxSum=9
        int[]nums={1,-2,3,4,-1,2,1,-5,4};
        System.out.println("Maximum SubArray Sum "+maxSubArray(nums));

        
        
    }
    public static int maxSubArray(int[]nums){
        if(nums==null||nums.length==0){
            return 0;
        }
        int cureentSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int num:nums){
            cureentSum=Math.max(num, cureentSum+num);
            maxSum=Math.max(maxSum, cureentSum);
        }
        return maxSum;
    }
    
}
