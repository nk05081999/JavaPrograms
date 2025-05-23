import java.util.Stack;

public class G13Stack {
    // What is Stack 
    // A stack is lastin First out data structure,
    // meaning the last elemnt added is the one which removed first.
    // push
    // pop:
    public static void main(String[] args) {
        Stack<Object>n=new Stack<>();
        n.push(1);
        n.push("Neeraj");
        n.push(23456789);
        System.out.println(n);
        System.out.println(n.peek());
        n.pop();
        System.out.println(n);
        System.out.println(n.isEmpty());
        // n.pop();
        // n.pop();
        // System.out.println(n.isEmpty());
        System.out.println(n.size());

    }
    
}
