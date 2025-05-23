import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode{
    int val;
    TreeNode left,right;
    TreeNode(int x){val=x;}
}
public class BinaryTreeTraversal {
    // Lecture : Binary Tree Traversal and Depth calculation:
    // Given the root of an binary tree, return its inorder traversal(left,root,right)

    // Use Recursion(DFS) to traverse the left subtree,then visit the root,
    // and finally traverse the right subtree.

public static List<Integer>inorderTrav(TreeNode root){
    List<Integer>res=new ArrayList<>();
    Stack<TreeNode>stack=new Stack<>();
    TreeNode curr=root;
    while (curr!=null||!stack.isEmpty()) {
        while (curr!=null) {
            stack.push(curr);
            curr=curr.left;
            
        }
        curr=stack.pop();
        res.add(curr.val);
        curr=curr.right;
        
    }
    return res;
}
public static void main(String[] args) {
    TreeNode root =new TreeNode(1);
    root.right=new TreeNode(2);
    root.right.left=new TreeNode(3);
    System.out.println(inorderTrav(root));
}

    
}
