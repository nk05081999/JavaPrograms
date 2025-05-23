public class Sarab {
    public static String shortestPalind(String s){
        if(s==null||s.length()==0){
            return s;
        }
        String sarb12=s+"#"+ new StringBuilder(s).reverse().toString();
        int[]lps=computeLPS(sarb12);
        int palLen=lps[sarb12.length()-1];
        String rem=s.substring(palLen);
        String prefix=new StringBuilder(rem).reverse().toString();
        return prefix+s;

    }
    private static int[] computeLPS(String s){
        int n=s.length();
        int[]lps=new int[n];
        int j=0;
        for(int i=1;i<n;i++){
            while (j>0&&s.charAt(i)!=s.charAt(j)) {
                j=lps[j-1];
                
            }
            if(s.charAt(i)==s.charAt(j)){
                j++;
                lps[i]=j;
            }
        }
        return lps;
    }
    public static void main(String[] args) {
        String s1="aacecaaa";
        System.out.println("Shortest Palindrome of "+s1+" is "+shortestPalind(s1));
        String s2="abcd";
        System.out.println(shortestPalind(s2));
    }

    
}
