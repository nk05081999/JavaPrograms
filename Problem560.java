import java.util.HashMap;

public class Problem560 {
    public static void main(String[] args) {
        int[]nums={1,1,1};
        int k=2;
        System.out.println(subArraySum(nums, k));
        
    }
    public static int  subArraySum(int[]nums,int k){
        HashMap<Integer,Integer>sumFreq=new HashMap<>();
        sumFreq.put(0, 1);
        int cureentSum=0;
        int count=0;
        for(int num:nums){
            cureentSum+=num;
            if(sumFreq.containsKey(cureentSum-k)){
                count+=sumFreq.get(cureentSum-k);
            }
            sumFreq.put(cureentSum, sumFreq.getOrDefault(cureentSum, 0)+1);
        }
        return count;
    }
    
}
