public class G14StringProblems {
    // Finding exact matches of short strings within larger texts.
    // KMP:Knuth Morries Pratt algorith:
    private static int[]compute(String pattern){
        int m=pattern.length();
        int[]lps=new int[m];
        int len=0;
        int i=1;
        while (i<m) {
            if(pattern.charAt(i)==pattern.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }else{
                if(len!=0){
                    len=lps[len-1];

                }else{
                    lps[i]=0;
                    i++;
                }
            }
            
        }
        return lps;

    }
    public static void search(String text,String pattern){
        int n=text.length();
        int m=pattern.length();
        int[]lps=compute(pattern);
        int i=0;int j=0;
        while (i<n) {
            if(text.charAt(i)==pattern.charAt(j)){
                i++;
                j++;

            }
            if(j==m){
                System.out.println(" found at :-"+(i-j));
                j=lps[j-1];
            }else if(i<n&&text.charAt(i)!=pattern.charAt(j)){
                if(j!=0){
                    j=lps[j-1];

                }else{
                    i++;
                }
            }
            
        }
    }
    public static void main(String[] args) {
        String text="ababcababcabc";
        String pattern="abc";
        search(text, pattern);
    }
    
}
