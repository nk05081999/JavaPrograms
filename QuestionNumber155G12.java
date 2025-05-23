// import java.util.LinkedList;
import java.util.Stack;

public class QuestionNumber155G12 {
    // Min stack:
    // we have to design a stack that supports the following operations:


    // push(x):
    // pop()
    // top()
    // getMin()

    // Approach: we have to maintain two stacks:
    // main stack
    // min stack:

    // every time we pop the element:
    // from the main stack
    // if it matches the main   stacks"s top,also pop the ,ion stack.

    private Stack<Integer>stack;
    private Stack<Integer>minimumStack;
    public QuestionNumber155G12(){
        stack=new Stack<>();
        minimumStack=new Stack<>();
    }
    public void push(int val){
        stack.push(val);
        if(minimumStack.isEmpty()||val<=minimumStack.peek()){
            minimumStack.push(val);
        }
    }
    public void pop(){
        if(stack.isEmpty())return;
        int remov=stack.pop();
        if(remov==minimumStack.peek()){
            minimumStack.pop();
        }
    }
    public int top(){
        if(stack.isEmpty())return -1;
        return stack.peek();
    }
    public int getMin(){
        if(minimumStack.isEmpty())return -1;
        return minimumStack.peek();
    }
    public static void main(String[] args) {
        QuestionNumber155G12 q=new QuestionNumber155G12();
        q.push(-2);
        q.push(0);
        q.push(-3);
        System.out.println("minumim "+q.getMin());
        q.pop();
        System.out.println("top element is "+q.top());
        System.out.println("Minimum "+q.getMin());
        // LinkedList<String> name=new LinkedList<>();
        // name.ad
    }



    
}
