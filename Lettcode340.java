import java.util.HashMap;
import java.util.Map;

public class Lettcode340 {
    // Longest substring with atmost k distinct characters:
    // Given a string s and an integer k,
    // find the the legth of the longest substring
    // that contains at most k distinct characaters:

    // input:s="eceba",k=2;
    // output:3
    //  ece is the longest substring with 2 distinct chars.
    public static int lengthOfLongestSub(String s,int k){
        if(s==null||s.length()==0||k==0)return 0;
        Map<Character,Integer>map=new HashMap<>();
        int left=0,maxLen=0;
        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
            map.put(c, map.getOrDefault(c, 0)+1);
            while (map.size()>k) {
                char leftChar=s.charAt(left);
                map.put(leftChar, map.get(leftChar)-1);
                if(map.get(leftChar)==0){
                    map.remove(leftChar);
                }
                left++;
                
            }
            maxLen=Math.max(maxLen, right-left+1);

        }
        return maxLen;
    }
    public static void main(String[] args) {
        String s="eceba";
        int k=2;
        System.out.println("Longest substring lenegth is "+lengthOfLongestSub(s, k));
    }

    
}
