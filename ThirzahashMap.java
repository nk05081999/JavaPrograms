import java.util.HashMap;

public class ThirzahashMap {
    public static int maximumLength(int[]arr){
        int maximumLen=0;
        int sum=0;
        HashMap<Integer,Integer>SIM=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==0){
                maximumLen=i+1;
            }
            if(SIM.containsKey(sum)){
                maximumLen=Math.max(maximumLen, i-SIM.get(sum));
            }else{
                SIM.put(sum, i);
            }
        }
        return maximumLen;
    }
    public static void main(String[] args) {
        int[]arr={2,10,4};
        System.out.println(maximumLength(arr));
    }
    
}
