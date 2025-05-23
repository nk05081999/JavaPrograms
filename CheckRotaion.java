public class CheckRotaion {
    public static void main(String[] args) {
        System.out.println("is Rotation "+isRotation("abcd", "dcab"));
        
    }
    public static boolean isRotation(String s1,String s2){
        if(s1.length()!=s2.length())return false;
        return (s1+s2).contains(s2);
    }
    
}
