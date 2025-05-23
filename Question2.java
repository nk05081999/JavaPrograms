import java.util.HashMap;

public class Question2 {
    public static void main(String[] args) {
        int []nums={1,-1,5,-2,3};
        int target=3;
        // sun.invoke.empty
        System.out.println("Maximum Length: "+maxSubarrayLength(nums, target));
        
    }
    public static int maxSubarrayLength(int []nums,int target){
        HashMap<Integer,Integer> sumMap=new HashMap<>();
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
            // sumMap.put(null, null)
            sumMap.putIfAbsent(cureentSum, i);
        }
        return maxLength;
    }
    
}
