public class G26SumOfNodes {
    static class TreeNode{
        int data;
        TreeNode left,right;
        TreeNode(int val){
            data=val;
            left=right=null;
            // Problem: Insert a new node in the first available position (level-order insertion).



        }
    }
    public static int sum(TreeNode root){
        if(root==null)return 0;
        return root.data+sum(root.left)+sum(root.right);
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(20);
        root.right=new TreeNode(30);
        System.out.println("Sum of nodes "+sum(root));
    }
    
}
