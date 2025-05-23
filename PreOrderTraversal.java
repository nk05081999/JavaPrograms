public class PreOrderTraversal {
    static class TreeNode{
        int data;
        TreeNode left,right;
        TreeNode(int value){
            data=value;
            left=right=null;
        }
    }
    public static void preorder(TreeNode root){
        if(root==null)return;
        System.out.println(root.data+" ");
        preorder(root.left);
        preorder(root.right);

    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(20);
        root.right=new TreeNode(30);
        root.left.left=new TreeNode(40);
        System.out.println("Preorder traversal");
        preorder(root);
    }
    
}
