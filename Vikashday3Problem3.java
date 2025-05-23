public class Vikashday3Problem3 {
    // Count the vowels in a string:

    // String input="Hello world";
    
    public static int countVowels(String str){
        int count=0;
        for(char ch:str.toLowerCase().toCharArray()){
            if("aeiou".indexOf(ch)!=-1)
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String name="Hello world";
        System.out.println("Vowels Count "+countVowels(name));
    }
    
}
