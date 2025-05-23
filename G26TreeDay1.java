

public class G26TreeDay1 {
    // Write a function  5to calculate the height oif the binary tree/

    static class TreeNode{
        int data;
        TreeNode left,right;
        TreeNode(int value){
            data=value;
            left=right=null;

        }
    }
    public static int height(TreeNode root){
        if(root==null) return 0;
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        return Math.max(leftHeight, rightHeight)+1;

    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(20);
        root.right=new TreeNode(30);
        root.left.left=new TreeNode(40);
        root.left.right=new TreeNode(50);
        System.out.println("height of a tree is "+height(root));
    }
}
