public class SortedListMergeG12 {
    public static LN mergeTL(LN l1,LN l2){
        LN du=new LN(-1);
        LN curr=du;
        while (l1!=null&&l2!=null) {
            if(l1.val<=l2.val){
                curr.next=l1;
                l1=l1.next;

            }else{
                curr.next=l2;
                l2=l2.next;

            }
            curr=curr.next;
            
        }
        curr.next=(l1!=null)?l1:l2;
        return du.next;
    }
    public static void main(String[] args) {
        LN l1=new LN(1);
        l1.next=new LN(3);
        l1.next.next=new LN(5);
        LN l2=new LN(2);
        l2.next=new LN(4);
        l2.next.next=new LN(6);
        LN mergeH=mergeTL(l1, l2);
        while (mergeH!=null) {
            System.out.println(mergeH.val+" ");
            mergeH=mergeH.next;
            
        }
    }
    
}
