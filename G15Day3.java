import java.util.LinkedList;
import java.util.Queue;

public class G15Day3 {
    // Insert a new node    in the first available postion(level order insertion)
static class  TreeNode {
    int data;
    TreeNode left,right;
    TreeNode(int val){
        data=val;
        left=right=null;
    }

    
}   
public static void insert(TreeNode root,int key){
    Queue<TreeNode>queue=new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
        TreeNode temp=queue.poll();
        if(temp.left==null){
            temp.left=new TreeNode(key);
            break;
        }else queue.add(temp.left);
        if(temp.right==null){
            temp.right=new TreeNode(key);
            break;
        }else queue.add(temp.right);
        
    }
} 
public static void inorder(TreeNode root){
    if(root==null)return;
    inorder(root.left);
    System.out.println(root.data+" ");
    inorder(root.right);

}
public static void main(String[] args) {
    TreeNode root=new TreeNode(10);
    root.left=new TreeNode(11);
    root.right=new TreeNode(9);
    root.left.left=new TreeNode(7);
    System.out.println("Before Insertion ");
    inorder(root);
    insert(root, 15);
    System.out.println("After inserion ");
    inorder(root);
}
}
