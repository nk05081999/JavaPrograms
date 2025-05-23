class TreeNode{
    int val;
    TreeNode left,right;
    TreeNode(int x){
        val=x;
    }
}
public class G15Day1 {
    // problem:Given a binary tree,find its height
    // ( maximum depth)
    public static int height(TreeNode root){
        if(root==null)return 0;
        return 1+Math.max(height(root.left), height(root.right));
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        System.out.println("height of a tree is "+height(root));
    }


    
}
