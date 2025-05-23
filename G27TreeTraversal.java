
public class G27TreeTraversal {
    public static void inorder(TreeNode root){
        if(root==null)return;
        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);

    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        System.out.println("Inorder Traversal");
        inorder(root);
    }

    
}
class TreeNode{
    int data;
    TreeNode left,right;
    TreeNode(int value){
        data=value;
        left=right=null;
    }
}
