public class G13Level {
    static class  TreeNode{
        int data;
        TreeNode left,right;
        TreeNode(int val){
            data=val;
            left=right=null;
            // Problem: Insert a new node in the first available position (level-order insertion).
        }

    } 
    public static void printlevel(TreeNode root,int level){
        if(root==null)return;
        if(level==1){
            System.out.println(root.data+" ");
        }else{
            printlevel(root.left, level-1);
            printlevel(root.right, level-1);
        }
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(100);
        root.left=new TreeNode(50);
        root.right=new TreeNode(150);
        root.left.left=new TreeNode(29);
        root.left.right=new TreeNode(56);
        System.out.println("Nodes at level 2 is ");
        printlevel(root, 2);
    }
    
}
