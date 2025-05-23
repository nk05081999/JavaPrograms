import java.util.HashMap;

public class AnagramProg2 {
    public static void main(String[] args) {
        System.out.println(areAnagaram("triangle", "integral"));
        System.out.println(areAnagaram("dfghj", "integrxcvbnal"));
        
    }
    public static boolean areAnagaram(String str,String str2){
        if(str.length()!=str2.length()) return false;
        HashMap<Character,Integer>countMap=new HashMap<>();
        for(char c:str.toCharArray()){
            countMap.put(c, countMap.getOrDefault(c, 0)+1);
        }
        for(char c:str2.toCharArray()){
            if(!countMap.containsKey(c)||countMap.get(c)==0)return false;
            countMap.put(c, countMap.get(c)-1); 
        }
        return true;
    }
    
}
