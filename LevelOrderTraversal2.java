public class LevelOrderTraversal2 {
    // Find the maximuym depth(height) of a binary tree

    // Approach:
    // Use recusion(DFS) to compute depth as 1+max(leftDepth,rightDepth)
    public static int maxDepth(TreeNode root){
        if(root==null)return 0;
        // return 1+Math.max(maxDepth(.le), 0)
        return 1+Math.max(maxDepth(root.left), maxDepth(root.right));
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);
        System.out.println(maxDepth(root));
    }
    
}
