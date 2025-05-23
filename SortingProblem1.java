import java.util.Arrays;

public class SortingProblem1 {
    public static void main(String[] args) {
        // Sorting an array to find kth smallest or largest element

        // to find the kth elemenrt:
        int[]arr={3,2,1,5,8};
        int k=2;
        System.out.println("#rd Smallest :"+findSmallEle(arr, k));
        System.out.println("3rd Largest Element :"+findlargele(arr, k));

    }
    public static int findSmallEle(int[]arr,int k){
        Arrays.sort(arr);
        return arr[k-1];
    }
    public static int findlargele(int[]arr,int k){
        Arrays.sort(arr);
        return arr[arr.length-k];
    }
    
}
