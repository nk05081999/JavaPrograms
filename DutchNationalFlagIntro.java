import java.util.Arrays;

public class DutchNationalFlagIntro {
    // use Three pointers: low(0s),mid(1s),high(2s)
    // Swap elemets to ensure
    // 0s are at the beginning
    // 1s are sat the mid
    // 2s are at the end
    public static void sortColors(int[]nums){
        int low=0,mid=0,high=nums.length-1;
        while (mid<=high) {
            if(nums[mid]==0){
                swap(nums, low++, mid++);
            }else if(nums[mid]==1){
                mid++;
            }else{
                swap(nums, mid, high--);
            }
            
        }
    }
    private static void swap(int[]nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void main(String[] args) {
        int[]nums={2,0,2,1,1,0};
        sortColors(nums);
        System.out.println("sorted colors"+Arrays.toString(nums));
    }
    
}
