public class TwoPointerSumG37 {
    // Given Sorted arary and a target sum,find if there exists
    //  two numbers that sum upto the target.


    public static boolean FP(int[]arr,int target){
        int left=0,right=arr.length-1;
        while (left<right) {
            int sum=arr[left]+arr[right];
            if(sum==target)return true;
            if(sum<target)left++;
            else right--;
            
        }
        return false;
    }
public static void main(String[] args) {
    int[]arr={1,2,3,4,5,6,7,8,9,10};
    int target=19;
    System.out.println(FP(arr, target));
}
    
}
