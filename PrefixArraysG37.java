public class PrefixArraysG37 {
    // Problem STatement:

    // Given an array  and multiple quieries.
    // /each specifying a range [L,R],find the sum of elements within the range

    public static int[] CPS(int[]arr){
        int n=arr.length;
        int[]pS=new int[n];
        pS[0]=arr[0];
        for(int i=1;i<n;i++){
            pS[i]=pS[i-1]+arr[i];

        }
        return pS;
    }
    public static int getSIR(int[]pS,int L,int R){
        if(L==0)return pS[R];
        return pS[R]-pS[L-1];
    }
    public static void main(String[] args) {
        int[]arr={2,4,6,8,10};
        int[]pS=CPS(arr);
        System.out.println("The sum of elements from 1 to 3 :"+getSIR(pS, 1, 3));
    }
    
}
