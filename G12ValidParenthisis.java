import java.util.Stack;

public class G12ValidParenthisis {
    // Problem Statement:
    // Given a string containing just characters '(',')','{','}','[',']'
    // determine the input string is valid:
    public static boolean isVal(String s){
        Stack<Character>stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='('||ch=='{'||ch=='['){
                stack.push(ch);
            }else{
                if(stack.isEmpty())return false;
                char top=stack.pop();
                if((ch==')'&&top!='(')||
                (ch=='}'&&top!='{')||
                (ch==']'&&top!='[')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
            String str="{[()]}";
            System.out.println("is valid"+isVal(str));
            str="{[(])]}";
            System.out.println("is valid "+isVal(str));
    }
    
}
