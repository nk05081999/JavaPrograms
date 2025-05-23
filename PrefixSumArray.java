import java.util.Scanner;

public class PrefixSumArray {
    public static int[] computePrefixSum(int[] arr) {
        int n = arr.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        return prefixSum;
    }

    public static int getSumInRange(int[] prefixSum, int L, int R) {
        if (L == 0) return prefixSum[R];
        return prefixSum[R] - prefixSum[L - 1];
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10}; // Example array
        int[] prefixSum = computePrefixSum(arr);

        System.out.println("Sum of elements from index 1 to 3: " + getSumInRange(prefixSum, 1, 3));
        System.out.println("Sum of elements from index 2 to 4: " + getSumInRange(prefixSum, 2, 4));
    }
}
