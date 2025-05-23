public class StringPermutation {
    public static void generatePer(String str,String perm){
        if(str.isEmpty()){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String rem=str.substring(0, i)+str.substring(i+1);
            generatePer(rem, perm+ch);

        }
    }
    public static void main(String[] args) {
        String str="abc";
        System.out.println("Permutation of "+str+" is: ");
        generatePer(str, "");
    }
    
}
