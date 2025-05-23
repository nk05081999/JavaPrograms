import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class G37Problem2Day2 {
    // Finding all pairs that sum up to a given value.
    public static List<int[]>findPai(int[]nums,int target){
        List<int[]>res=new ArrayList<>();
        Map<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            int comp=target-num;
            if(map.getOrDefault(comp, 0)>0){
                res.add(new int[]{comp,num});
                map.put(comp, map.get(comp)-1);
            }else{
                map.put(num, map.getOrDefault(num, 0)+1);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[]nums={1,5,7,-1,5};
        int target=6;
        List<int[]>pairs=findPai(nums, target);
        for(int[]pai:pairs){
            System.out.println(Arrays.toString(pai));
        }
    }
    
}
