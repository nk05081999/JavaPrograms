public class ThreePointer {
    public static void sortCol(int[]arr){
        int low=0;int mid=0;int high=arr.length-1;
        while (mid<=high) {
            if(arr[mid]==0){
                swap(arr, low++, mid++);
            }else if(arr[mid]==1){
                mid++;
            }else{
                swap(arr, mid, high--);
            }
             
        }

    }
    private static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int arr[]={2,0,2,1,1,0};
        sortCol(arr);
        System.out.println("Sorted array is "+java.util.Arrays.toString(arr));
        
    }

    
}
