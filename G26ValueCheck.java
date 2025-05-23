public class G26ValueCheck {
    // Check is value exits in binary tree or not?


    static class TreeNode{
        int data;
        TreeNode left,right;
        TreeNode(int value){
            data=value;
            left=right=null;

        }
    }
    public static boolean searchValue(TreeNode root,int key){
        if(root==null)return false;
        if(root.data==key)return true;
        return searchValue(root.left, key)||searchValue(root.right, key);

    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(7);
        root.left=new TreeNode(4);
        root.right=new TreeNode(9);
        root.left.right=new TreeNode(2);
        System.out.println("Is 4 in Tree "+searchValue(root, 4));
        System.out.println("is 10 in tree "+searchValue(root, 10));
    }
    
}
