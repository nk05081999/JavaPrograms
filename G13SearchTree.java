public class G13SearchTree {
    static class  TreeNode{
        int data;
        TreeNode left,right;

        TreeNode(int value){
            data=value;
            left=right=null;

        }

    } 
    public static boolean search(TreeNode root,int key){
        if(root==null)return false;
        if(root.data==key)return true;
        return search(root.left, key)||search(root.right, key);

    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(7);
        root.left=new TreeNode(3);
        root.right=new TreeNode(5);
        root.left.left=new TreeNode(9);
        System.out.println("Is 7 in tree "+search(root, 7));
    }
    
}
