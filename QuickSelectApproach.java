import java.util.ArrayList;

public class QuickSelectApproach {
    public static int findSmallEle(int[]arr,int k){
        return quickSle(arr, 0, arr.length-1, k-1);

    }
    private static int quickSle(int[]arr,int left,int right,int k){
        int pivotIndex=partition(arr, left, right);
        if(pivotIndex==k){
            return arr[k];
        }else if(pivotIndex>k){
            return quickSle(arr, left, pivotIndex-1, k);
        }else{
            return quickSle(arr, pivotIndex+1, right, k);
        }
    }
    private static int partition(int[]arr,int left,int right){
        int pivot=arr[right];
        int i=left;
        for(int j=left;j<right;j++){
            if(arr[j]<=pivot){
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, right);
        return i;
    }
    private static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
            int[]arr={10,9,4,6,11,13,2,7};
            int k=3;
            System.out.println("#rd Smalle is "+findSmallEle(arr, k));
            ArrayList<Object>abc=new ArrayList<>();
            abc.add("abc");
            abc.add(1);
            System.out.println(abc);
        
    }
    
}
