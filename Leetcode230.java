// import java.util.Stack;

// public class Leetcode230 {
//     // Fi9nd the kth smallest   in binary search tree(BST)

//     // Approach:use inorder traversal(lefdt-root-right) to get elements in sorted order.
//     // stop when we reach the kth relement


//     public static int kthsamllestt(TreeNode root,int k){
//         Stack<TreeNode>stack=new Stack<>();
//         while (true) {
//             while (root!=null) {
//                 stack.push(root);
//                 root=root.left;
                
//             }
//             root=stack.pop();
//             if(--k==0)return root.val;
//             root=root.right;
            
//         }
//     }
//     public static void main(String[] args) {
//             TreeNode root=new TreeNode(3);
//             root.left=new TreeNode(1);
//             root.left.right=new TreeNode(2);
//             root.right=new TreeNode(4);
//             System.out.println(kthsamllestt(root, 1));
//             System.out.println(kthsamllestt(root, 2));

//     }
    
// }
