public class G13RecursionIntro {
    // Recusion is a method in which a function callls itself

    // types of Recusrion:
    // Direct Recursion: A function calls itself.
    // Indirect Recursion: A function calls another function which in turn calls the first function.
    // 
    public static int binarySear(int[]arr,int target,int left,int right){
        if(left>right){
            return -1;
            
        }
        int mid=left+(right-left)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                return binarySear(arr, target, left, mid-1);
            }else{
                return binarySear(arr, target, mid+1, right);
            }

    }
    public static void main(String[] args) {
        int[]arr={11,15,18,20,21,22};
        int target=1;
        int index=binarySear(arr, target, 0, arr.length-1);
        System.out.println(index);
    }
    
}
