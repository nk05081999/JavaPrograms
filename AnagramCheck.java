import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        System.out.println(areAna("silent", "listen"));
        System.out.println(areAna("sdfghj", "zxcvbn"));
        
    }
    public static boolean areAna(String str1,String str2){
        char[]arr1=str1.toCharArray();
        char[]arr2=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);   
    }
    
}
