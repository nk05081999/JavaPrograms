public class G37AnagramChecker{
    public static boolean AreAna(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        int[]freq=new int[26];
        for(int i=0;i<str1.length();i++){
            freq[str1.charAt(i)-'a']++;
            freq[str2.charAt(i)-'a']--;
        }
        for(int cou:freq){
            if(cou!=0)return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s1="sdfgh";
        String s2="lismnbvten";
        System.out.println("Are ana"+AreAna(s1, s2));

        // O(n)
        // O(1)
    }

}