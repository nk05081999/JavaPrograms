import java.util.Arrays;

public class G371To10 {
// Approach:
// Sorting method(O(nlogn))

// Sort the array in asceding order.
// The kth smallest element is at index k-1
// The kth largest element is at index n-k;


// Min-Heap for kth largest


// use min heap(priority queue) of size k
// Push elements into the heap and pop the smallest element when heap size exceeds k
// The top element isx the kth largest


public static int fKthSmallest(int[]arr,int k){
    Arrays.sort(arr);
    return arr[k-1];
}
public static int fKthLargest(int[]arr,int k){
    Arrays.sort(arr);
    return arr[arr.length-k];
}
public static void main(String[] args) {
    int[]arr={3,2,1,5,6,9,8};
    int k=2;
    System.out.println("Kth smallest "+fKthSmallest(arr, k));//2
    System.out.println("Kth largest "+fKthLargest(arr, k));//8
}

    
}
