import java.util.Stack;

public class StackIntro {
    // A stack is a Last in first out.
    // it means the last element added is the first to be removed.
    // it supports two operations.
    // push
    // pop
    // private int arr[];
    // private int top;
    // private int cap;
    public static void main(String[] args) {
        Stack<Integer>n=new Stack<>();
        n.push(1);
        n.push(2);
        n.push(3);
        System.out.println(n.peek());
        System.out.println(n);
        n.pop();
        System.out.println(n);
        System.out.println(n.pop());
        System.out.println(n);
        System.out.println(n.peek());
    }

    
}
