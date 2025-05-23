import java.util.Scanner;

public class LeetcodeProblem209 {
    // Given an array of integers and an integer k,find the maximum sum of an contigous subarray
    // of size k;
    public static int maxsum(int[]arr,int k){
        int maxsum=0,windowSu=0;
        // int[]arr={1,2,3,4,5} k=2
        for(int i=0;i<k;i++){
            windowSu+=arr[i];
        }
        maxsum=windowSu;
        for(int i=k;i<arr.length;i++){
            windowSu+=arr[i]-arr[i-k];
            maxsum=Math.max(maxsum, windowSu);
        }

        return maxsum;


    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();

        }
        System.out.println("Maximum sum is "+maxsum(arr, k));
        s.close();;
    }
    
}
