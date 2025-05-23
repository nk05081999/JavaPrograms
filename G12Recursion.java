public class G12Recursion {
    public static int binarySearch(int[]arr,int target,int left,int right){
        if(left>right){
            return -1;
        }
        int mid=left+(right-left)/2;
        if(arr[mid]==target){
            return mid;
        }else if(arr[mid]>target){
            return binarySearch(arr, target, left, mid-1);
        }else{
            return binarySearch(arr, target, mid+1, right);
        }


    }
    public static void main(String[] args) {
        int[]arr={7,8,9,10,11,12};
        int target=10;
        int index=binarySearch(arr, target, 0, arr.length-1);
        System.out.println(index);
    }
    
}
