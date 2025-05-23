public class G27CountLeafNodes {
    static class TreeNode{
        int data;
        TreeNode left,right;
        TreeNode(int val){
            data=val;
            left=right=null;
        }
    }
    public static int countLeaves(TreeNode root){
        if(root==null) return 0;
        if(root.left==null&&root.right==null)return 1;
        return countLeaves(root.left)+countLeaves(root.right);
        // Problem: Find the total sum of all node values in the tree.
        // Problem: Traverse a binary tree in Postorder (Left → Right → Root).
        // Problem: Insert a new node in the first available position (level-order insertion).


    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(12);
        root.left=new TreeNode(24);
        root.right=new TreeNode(36);
        System.out.println("Number of Leaves in Binary Tree is "+countLeaves(root));
    }
    
}
