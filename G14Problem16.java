import java.util.Arrays;

public class G14Problem16 {
    public static int threeSumClosest(int[]nums,int target){
        Arrays.sort(nums);
        int closestSum=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;
            while (left<right) {
                int currentSum=nums[i]+nums[left]+nums[right];
                if(Math.abs(target-currentSum)<Math.abs(target-closestSum)){
                    closestSum=currentSum;
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
        return closestSum;
    }
   public static void main(String[] args) {
    
    int[]nums={-1,2,1,4};
    int target=1;
    System.out.println(threeSumClosest(nums, target));
   }
    
    
}
