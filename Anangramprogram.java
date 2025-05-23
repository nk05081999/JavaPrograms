import java.util.Arrays;

public class Anangramprogram {
    public static void main(String[] args) {
        // What is Anagram?
        // Concept: two strings rae anagaram if they contain same characters
        // in the same freq but arranged differently.

        // Algo:
        // if the length of both the strings differ,they are not anagarams
        // 
        System.out.println(areAnagrams("listen", "silent"));
        System.out.println(areAnagrams("dfgh", "xcvb"));
    }
    public static boolean areAnagrams(String str1,String str2){
        if(str1.length()!=str2.length())return false;
        char[]arr1=str1.toCharArray();
        char[]arr2=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
    
}
