import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LeetcodeProblem3 {
    // problem statement: Given a string, find the length of longest substring without
    // repeating characters using the sliding window

    // 
    public static int lengOfLongest(String s){
        Set<Character>set=new HashSet<>();
        int left=0,maxLen=0;
        for(int right=0;right<s.length();right++){
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
                
            }
            set.add(s.charAt(right));
            maxLen=Math.max(maxLen, right-left+1);

        }
        return maxLen;
    }
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String s=sc.next();
            System.out.println("Longest substring length "+lengOfLongest(s));
            sc.close();;

    }
    
}
