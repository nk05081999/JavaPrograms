public class G14Problem459 {
    public static boolean repaet(String s){
        String doub=s+s;
        return doub.substring(1,doub.length()-1).contains(s);
    }
    public static void main(String[] args) {
        System.out.println(repaet("abab"));
        System.out.println(repaet("abc"));
    }
    
}
