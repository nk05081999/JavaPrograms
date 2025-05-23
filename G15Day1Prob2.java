// class TreeNode{
//     int val;
//     TreeNode left,right;
//     public Object data;
//     TreeNode(int x){
//         val=x;
//     }
// }
// public class G15Day1Prob2 {
//     // givn two binary trees,check if they are the same(identical in structure or values)

//     public static boolean isSame(TreeNode p,TreeNode q){
//         if(p==null&&q==null)return true;
//         if(p==null||q==null)return false;
//         return(p.val==q.val)
//         && isSame(p.left, q.left)
//         && isSame(p.right, q.right);
//     }
//     public static void main(String[] args) {
//         TreeNode root1=new TreeNode(1);
//         root1.left=new TreeNode(2);
//         root1.right=new TreeNode(3);
//         TreeNode root2=new TreeNode(1);
//         root2.left=new TreeNode(2);
//         root2.right=new TreeNode(3);
//         // System.out.println("are trees identical "+isSame(   , root2));
//         System.out.println(isSame(root1, root2));
//     }
// }
