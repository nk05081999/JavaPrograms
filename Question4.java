import java.util.HashMap;

public class Question4 {
    public static void main(String[] args) {
        int []nums={1,-1,5,-2,3};
        int target=3;
        System.out.println(maxSubArrayLength(nums, target));
        
    }
    public static int maxSubArrayLength(int[]nums,int target){
        HashMap<Integer,Integer>sumMap=new HashMap<>();
        int cureentSum=0;
        int maxLength=0;
        for(int i=0;i<nums.length;i++){
            cureentSum+=nums[i];
            if(cureentSum==target){
                maxLength=i+1;
            }
            if(sumMap.containsKey(cureentSum-target)){
                maxLength=Math.max(maxLength, i-sumMap.get(cureentSum-target));

            }
            sumMap.putIfAbsent(cureentSum, i);
        }
        return maxLength;
    }
    
}
