import java.util.HashMap;

public class leetcodeProblem560 {
    // Problem Statement: Given an array of integers nums    and an integer k,
    // return the total number of continous sub arrays whose sum is equal to k;

    // nums=[1,2,3],k=3
    // output=2
    public static int subarraysum(int[]nums,int k){
        HashMap<Integer,Integer>pSM=new HashMap<>();
        pSM.put(0, 1);//to count subarrays that sum up to k from the beginnning
        int count=0;
        int sum=0;
        for(int num:nums){
            sum+=num;
            // if(sum-k) exits krta hai map mein,we found subarray that ends at urrent inde
            // and sums to k
            if(pSM.containsKey(sum-k)){
                count+=pSM.get(sum-k);
            }
            pSM.put(sum, pSM.getOrDefault(sum, 0)+1);

        }
        return count;
    }
    public static void main(String[] args) {
        int[]nums={1,2,3};
        int k=3;
        int res=subarraysum(nums, k);
        System.out.println("Total subarrays with sum = "+k+" is "+res);
    }



    
}
