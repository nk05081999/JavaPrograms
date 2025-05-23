public class RepeatedProgram {
    public static boolean repaet(String s){
        String doubled=s+s;
        return doubled.substring(1,doubled.length()-1).contains(s);
    }
    public static void main(String[] args) {
        System.out.println(repaet("abab"));
        System.out.println(repaet("aba"));
    }
    
}
