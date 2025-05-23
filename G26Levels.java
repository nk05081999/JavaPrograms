public class G26Levels {
    static class TreeNode{
        int data;
        TreeNode left,right;
        TreeNode(int val){
            data=val;
            left=right=null;

        }
    }
    public static void printLevel(TreeNode root,int level){
        if(root==null)return;
        if(level==1){
            System.out.println(root.data+ " ");
        }else{
            printLevel(root.left, level-1);
            printLevel(root.right, level-1);
        }

    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(20);
        root.right=new TreeNode(30);
        root.left.left=new TreeNode(40);
        root.left.right=new TreeNode(50);
        System.out.println( "Nodes at level 3");
        printLevel(root, 3);
    }
    
}
