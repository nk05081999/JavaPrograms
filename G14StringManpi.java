import java.util.HashMap;

public class G14StringManpi {
    public static String minWindow(String s1,String s2){
        if(s1==null||s2==null||s1.length()<s2.length()){
            return "";
        }
        HashMap<Character,Integer>charFreq=new HashMap<>();
        for(char c:s2.toCharArray()){
            charFreq.put(c, charFreq.getOrDefault(c, 0)+1);
        }
        HashMap<Character,Integer>windowCount=new HashMap<>();
        int start=0,matched=0,minLength=Integer.MAX_VALUE;
        int minStart=0;
        for(int end=0;end<s1.length();end++){
            char endChar=s1.charAt(end);
            windowCount.put(endChar, windowCount.getOrDefault(endChar, 0)+1);
            if(charFreq.containsKey(endChar)&&
            windowCount.get(endChar).equals(charFreq.get(endChar))){
                matched++;
            }
            while(matched==charFreq.size()){
                if(end-start+1<minLength){
                    minLength=end-start+1;
                    minStart=start;
                }
                char startChar=s1.charAt(start);
                windowCount.put(startChar, windowCount.get(startChar)-1);
                if(charFreq.containsKey(startChar)&&
                windowCount.get(startChar)<charFreq.get(startChar)){
                    matched--;
                }
                start++;
            }
        }
        return minLength==Integer.MAX_VALUE?"":s1.substring(minStart, minStart+minLength);
    }
    public static void main(String[] args) {
        // Question: Find the smallest substring in the fisrt string that 
        // contains     all the charcaters of the second string.
        // Algo:

        // Here we are using two hashmaps:

        // charFreq:to store the frequiency of each character of s2.
        // windowCount:to store the frequency of characaters in the current window
        // of s1.
        // Use two pointers start and end,which denotes the current window.
        // Expand the window by moving the end pointer until all the characters of s2
        // covered

        // once valid window is found,shrink it from the left by moving 
        // the start pointer to minimize the window size.

        // keep track of the smallest window that satisfies the condi.
        String s1="ADOBECODEBANC";
        String s2="ABC";
        System.out.println("Smallest Substring :"+minWindow(s1, s2));
    }

    
}
