class LN{
    int val;
    LN next;
    LN(int x){
        val=x;
        next=null;
    }
}

public class LinkedListProblem1 {
    // Detect if a cycle is present in the linkedlist,if present remove it

    // Approach:Floyds Cycle Algorith:

    // Use two pointers,slow moves one step,fast moves two steps.

    // if tehy meet,a cycle exits.
    // to remove the cycle:
    // start the pointer from the head
    // move the pointers at the same speed until they meet at the start of the cycle.

    // find the last node and remove the cycle.
    public static boolean hascycle(LN head){
        LN slow=head,fast=head;
        while (fast!=null&&fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) return true;
            
        }
        return false;
    }
    private static void remCycle(LN head){
        LN slow=head,fast=head;
        boolean cycleExi=false;
        while (fast!=null&&fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycleExi=true;
                break;
            }
            
        }
        if(!cycleExi)return;
        slow=head;
        while (slow.next!=fast.next) {
            slow=slow.next;
            fast=fast.next;

            
        }
        fast.next=null;

    }
    public static void main(String[] args) {
        LN head=new LN(1);
        head.next=new LN(2);
        head.next.next=new LN(3);
        head.next.next.next=new LN(4);
        head.next.next.next.next=head.next;
        System.out.println("C D"+hascycle(head));
        remCycle(head);
        System.out.println("C R"+hascycle(head));
    }

    
}
