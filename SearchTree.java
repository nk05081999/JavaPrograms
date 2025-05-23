public class SearchTree {
    static class TreeNode{
        int data;
        TreeNode left,right;
        TreeNode(int value){
            data=value;
            left=right=null;
        }
    }
    public static boolean search(TreeNode root,int k){
        if(root==null) return false;
        if(root.data==k)return true;
        return search(root.left, k)||search(root.right, k);

    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(7);
        root.left=new TreeNode(5);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(112);
        System.out.println("Is 3 in tree "+search(root, 3));
        System.out.println("is 19 in tree "+search(root, 19));
    }
    
}
