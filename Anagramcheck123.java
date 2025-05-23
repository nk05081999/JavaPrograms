import java.util.HashMap;

public class Anagramcheck123 {
    public static void main(String[] args) {
        System.out.println(ancheck("silent", "listen"));
        System.out.println(ancheck("dfghj", "xcvbn"));
        
    }
    public static boolean ancheck(String str1,String str2){
        if(str1.length()!=str2.length()) return false;
        HashMap<Character,Integer>count=new HashMap<>();
        for(char c:str1.toCharArray()){
            count.put(c, count.getOrDefault(c,0)+1);

        }
        for(char c:str2.toCharArray()){
            if(!count.containsKey(c)||count.get(c)==0) return false;
            count.put(c, count.get(c)-1);
        }
        return true;
    }
    
}
