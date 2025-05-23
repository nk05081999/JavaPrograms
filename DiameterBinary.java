public class DiameterBinary {
    // The diameter of a binary tree is the length of the longest path between
    //  two nodes.
    // Solution approach:
    // use Recursion to find the height of the lecft and the right
    // subtrees;l

    // Update the maximum diameter encountered.


    static int diameter=0;
    public static int DOBT(TreeNode root){
        height(root);
        return diameter;

    }
    private static int height(TreeNode  node){
        if(node==null)return 0;
        int leftHeight=height(node.left);
        int rightHeight=height(node.right);
        diameter=Math.max(diameter, leftHeight+rightHeight);
        return 1+Math.max(leftHeight, rightHeight);
    }
    public static void main(String[] args) {
        TreeNode root =new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        System.out.println(DOBT(root));
    }

    
}
