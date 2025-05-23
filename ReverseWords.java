public class ReverseWords{
    public static String revString(String s){
        String[]words=s.split(" ");
        StringBuilder s1=new StringBuilder();
        for(String w:words){
            s1.append(new StringBuilder(w).reverse()).append(" ");
        }
        return s1.toString().trim();

    }
    public static void main(String[] args) {
        System.out.println(revString("Hey My Name is Neeraj"));
    }
}