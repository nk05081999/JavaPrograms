public class SumOfNodes {
    static class TreeNode{
        int data;
        TreeNode left,right;
        TreeNode(int val){
            data=val;
            left=right=null;

        }
    }
    public static int sum(TreeNode root){
        if(root==null)return 0;
        return root.data+sum(root.left)+sum(root.right);

    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(5);
        root.left=new TreeNode(3);
        root.right=new TreeNode(8);
        System.out.println("Sum of nodes "+sum(root));
    }
    
}
