public class StringPerm {
    public static void genPer(String str,String perm){
        if(str.isEmpty()){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String rem=str.substring(0, i)+str.substring(i+1);
            genPer(rem, perm+ch);

        }
    }
    public static void main(String[] args) {
        String str="abc";
    System.out.println("Permutations of "+str+" are: ");
    // System.out.println(str);
    genPer(str, "");

    }
    
}
