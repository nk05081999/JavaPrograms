// public class ValidateBST {
//     public static boolean isValidB(TreeNode root){
//         return isVa(root, Long.MIN_VALUE, Long.MAX_VALUE);
//     }
//     private static boolean isVa(TreeNode node,long min,long max){
//         if(node==null)return true;
//         if(node.val<=min||node.val>=max)return false;
//         return isVa(node.left, min, node.val)&&isVa(node.right, node.val, max);
//     }
//     public static void main(String[] args) {
//         TreeNode root=new TreeNode(2);
//         root.left=new TreeNode(1);
//         root.right=new TreeNode(3);
//         System.out.println(isValidB(root));
//     }
    
// }
