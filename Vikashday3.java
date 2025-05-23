public class Vikashday3 {
    public static void main(String[] args) {
        // Data Types in java:
        // Primitive data Type(int,float,long,char,bool etc)
        // Non primitive data Type(String ,Array, linkedlist, object, class etc)
        // int a=10;
        // int b=20;
        // int c=a+b;
        // System.out.println(c);
        // float d=1.5f;
        // float e=1.9f;
        // System.out.println(d+e);
        // String data Type:

        // String name="abc"
        // String name="vikas";
        // System.out.println(name);
        // for(int i=0;i<name.length();i++){
        //     System.out.println(name.charAt(i));
        // }
        // String name="Java";
        // for(int i=name.length()-1;i>=0;i--){
        //     System.out.println(name.charAt(i));
        // abc
        // }

        // Problem: Return true if the string is a palindrome (reads same forward and backward).
String input="madam";
System.out.println("is Palindrome "+isPalindrome(input));

    }
    public static boolean isPalindrome(String str){
        int left=0,right=str.length()-1;
        while (left<right) {
            if(str.charAt(left++)!=str.charAt(right--)){
                return false;
            }
            return true;
            
        }
                return false;
    }
    
}
