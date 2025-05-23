public class G14MissingNumber {
    public static int findMN(int[]arr,int n){
        int expSum=n*(n+1)/2;
        int actSum=0;
        for(int num:arr){
            actSum+=num;
        }
        return expSum-actSum;
    }
    
}
