import java.util.Arrays;

public class VikasAnagram {
    // String s1="silent", String s2="Listen";
    public static boolean areAnagram(String str1,String str2){
        if(str1.length()!=str2.length())
            return false;
        char[]a=str1.toCharArray();
        char[]b=str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);


    }
    public static void main(String[] args) {
        System.out.println(areAnagram("silent", "listen"));
    }
    
}
