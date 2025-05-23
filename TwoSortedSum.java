import java.util.Arrays;

public class TwoSortedSum {
    public static void main(String[] args) {
        int[]nums={2,7,11,15};
    int target=9;
    int[]result=two(nums, target);
    if(result.length==2){
        System.out.println("Indices: "+Arrays.toString(result));
        System.out.println("Numbers: "+nums[result[0]]+" "+nums[result[1]]+"="+target);

    }else{
        System.out.println("No SOlution found");
    }
        
    }
    public static int[] two(int[]nums,int target){
        int l=0;
        int r=nums.length-1;
        while(l<r){
            int sum=nums[l]+nums[r];
            if(sum==target){
                return new int[]{l,r};
            }else if(sum<target){
                l++;
            }else{
                r--;
            }


        }
        return new int[]{};
       

    }
   
    
}
