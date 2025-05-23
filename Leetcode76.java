import java.util.HashMap;
import java.util.Map;

public class Leetcode76 {
    public static String minwin(String s,String t){
        if(s.length()==0||t.length()==0)return "";
        Map<Character,Integer>map=new HashMap<>();
        for(char c:t.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        int le=0,ri=0,minStar=0,minLe=Integer.MAX_VALUE,req=map.size();
        while (ri<s.length()) {
            char c=s.charAt(ri);
            if(map.containsKey(c)){
                map.put(c, map.get(c)-1);
                if(map.get(c)==0)req--;

            }
            ri++;
            while (req==0) {
                if(ri-le<minLe){
                    minLe=ri-le;
                    minStar=le;

                }
                char leftChar=s.charAt(le);
                if(map.containsKey(leftChar)){
                    map.put(leftChar, map.get(leftChar)+1);
                    if(map.get(leftChar)>0) req++;

                }
                le++;
                
            }
            
        }
        return minLe==Integer.MAX_VALUE?"":s.substring(minStar, minStar+minLe);


    }
    public static void main(String[] args) {
        String s="ADOBECODEBANC",t="ABC";
        System.out.println("Smallest Substring :"+minwin(s, t));
    }
    
}
