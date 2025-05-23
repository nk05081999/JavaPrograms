public class Thirza {
    public static int maximumLength(int[]arr){
        int len=arr.length;
        int maximumLen=0;
        for(int st=0;st<len;st++){
            int sum=0;
            for(int end=st;end<len;end++){
                sum+=arr[end];
                if(sum==0){
                    maximumLen=Math.max(maximumLen, end-st+1);
                }
            }
        }
        return maximumLen;
    }
    public static void main(String[] args) {
        int[]arr={1,0,-4,3,1,0};
        System.out.println(maximumLength(arr));
    }
    
}
