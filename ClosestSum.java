import java.util.Arrays;

public class ClosestSum {
    public static void main(String[] args) {
        int[]nums={-1,2,1,-4};
        int target=1;
        int []nums2={0,0,0};
        System.out.println(threeSumClose(nums2, target));
        System.out.println("Closest sum is "+target+": "+threeSumClose(nums,target));

    }
    public static int threeSumClose(int[]nums,int target){
        Arrays.sort(nums);
        int closestSumFound=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int currentSum=nums[i]+nums[left]+nums[right];
                if(Math.abs(target-currentSum)<Math.abs(target-closestSumFound)){
                    closestSumFound=currentSum;

                }
                if(currentSum<target){
                    left++;
                }else if(currentSum>target){
                    right--;
                }else{
                    return currentSum;
                }
            }
        }
        return closestSumFound;
    }
    
}
