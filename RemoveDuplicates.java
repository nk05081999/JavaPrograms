public class RemoveDuplicates {
    // String str="programming";
    public static String removeDuplicates(String str){
        StringBuilder sb=new StringBuilder();
        boolean[]seen=new boolean[256];
        for(char ch:str.toCharArray()){
            if(!seen[ch]){
                seen[ch]=true;
                sb.append(ch);

            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String input="programming";
        System.out.println("without duplicates "+removeDuplicates(input));
        // Find the First Non-Repeated Character
        // Count Occurrences of Each Character
        // Check if String Contains Only Digits
        // Replace All Spaces with Hyphens
        // Convert a String to Title Case
    }
    
}
