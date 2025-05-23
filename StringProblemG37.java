public class StringProblemG37 {
    // Given a string,determine if it is a palindrome.
    // A palindrome is a word,pharse,number,or sequence of char that reads same
    // forward and backward ignorx
    // case (Upper case and lower)
    // non alphanumeric char

    // Two pointer tech:

    public static boolean isPal(String s){
        int left=0,right=s.length()-1;
        while (left<right) {
            while (left<right&&!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
                
            }
            while (left<right&&!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
                
            }
            if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;

            
        }
        return true;
    }
    public static void main(String[] args) {
        String test1="A man, a plan, a canal: panama";
        String test2="race a car";
        String test3=" ";
        System.out.println("is Palindrome :"+isPal(test1));
        System.out.println("is Palindrome :"+isPal(test2));
        System.out.println("is Palindrome :"+isPal(test3));
    }
    
}
