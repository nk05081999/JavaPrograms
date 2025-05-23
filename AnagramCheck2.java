import java.util.Arrays;

public class AnagramCheck2 {
    public static void main(String[] args) {
        System.out.println("is Anagram "+anagramCheck("silent", "listen"));
        
    }
    public static boolean anagramCheck(String s1,String s2){
        if(s1.length()!=s2.length())return false;
        char[]a1=s1.toCharArray();
        char[]a2=s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1, a2);

    }
    
}
