import java.util.LinkedList;
import java.util.Queue;

public class G26Queue {
    // What is Queue: Queue is a linear data structure  that follows 
    // FIFO(First In First Out)

    //  insertion happent at the end
    // deletion happens at the front

    // Key operations:

    // enqueue: adding elements from the end
    // dequeue: removing elements from the front
    // peek: get the front elemnt but without removing
    // isempty: 

    // Array,linkedlist,ArrayDequeue
        public static void main(String[] args) {
                Queue<Integer>queue=new LinkedList<>();
                queue.add(15);
                System.out.println(queue.peek());
                queue.remove();
                System.out.println(queue.peek());
        }
    
}
