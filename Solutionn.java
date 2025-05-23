import java.util.Arrays;

class Solutionn {
    public int compress(char[] chars) {
        int index = 0; // Position to write in the array
        int i = 0; // Iterator for reading through chars
        
        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;
            
            // Count occurrences of the current character
            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }
            
            // Write the character
            chars[index++] = currentChar;
            
            // If count > 1, write the count as characters
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[index++] = c;
                }
            }
        }
        
        return index; // The new length of the compressed array
    }

    public static void main(String[] args) {
        Solutionn solution = new Solutionn();
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int newLength = solution.compress(chars);
        System.out.println("Compressed Length: " + newLength);
        System.out.println("Compressed Array: " + Arrays.toString(Arrays.copyOf(chars, newLength)));
    }
}
