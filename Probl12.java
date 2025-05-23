import java.util.HashSet;
import java.util.Set;

public class Probl12 {
    // Given a string s, find the length of the longest substring without repaeting chars.

    // Approach:Sliding window,hashset
    public static int LenLongSub(String s){
        Set<Character>set=new HashSet<>();
        int le=0,maxen=0;
        for(int ri=0;ri<s.length();ri++){
            while (set.contains(s.charAt(ri))) {
                set.remove(s.charAt(le));
                le++;
                
            }
            set.add(s.charAt(ri));
            maxen=Math.max(maxen, ri-le+1);

        }
        return maxen;
    }
    public static void main(String[] args) {
        System.out.println(LenLongSub("abcabcbb"));
        System.out.println(LenLongSub("bbbbb"));
        
    }

    
}
