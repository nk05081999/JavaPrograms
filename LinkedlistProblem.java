// class LN{
//     int val;
//     LN next;
//     LN(int x){
//         val =x;
//         next=null;
//     }
// }



// public class LinkedlistProblem {
//     // we have to detect if a cycle exists in a linkedlist and
//     // if present,remove it.

//     // Approach: Floyds Cycle ALgo

//     // use two pointers,slow moves one step, fast move two steps.

//     // if they meet,cycle is present
//     // to remove the cycle:

//     // we have to start the pointer from the head.
//     // move both the pointers at the sma espeed until they meet at the start of the
//     // cycle.
//     // we have to find the last node and remove the cycle.
//     public static boolean hascycle(LN head){
//         LN slow=head,fast=head;
//         while (fast!=null&&fast.next!=null) {
//             slow=slow.next;
//             fast=fast.next.next;
//             if(slow==fast)return true;
            
//         }
//         return false;
//     }
//     public static void reCycle(LN head){
//         LN slow=head,fast=head;
//         boolean cycleExi=false;
//         while (fast!=null&&fast.next!=null) {
//             slow=slow.next;
//             fast=fast.next.next;
//             if(slow==fast){
//                 cycleExi=true;
//                 break;
//             }
            
//         }
//         if(!cycleExi)return;
//         slow=head;
//         while (slow.next!=fast.next) {
//             slow=slow.next;
//             fast=fast.next;

            
//         }
//         fast.next=null;
//     }
//     public static void main(String[] args) {
//         LN head=new LN(1);
//         head.next=new LN(2);
//         head.next.next=new LN(3);
//         head.next.next.next=new LN(4);
//         head.next.next.next.next=head.next;
//         System.out.println("Cycle detected is "+hascycle(head));
//         reCycle(head);
//         System.out.println("Cycle removed ,The detected is "+hascycle(head));
//     }



    
// }


