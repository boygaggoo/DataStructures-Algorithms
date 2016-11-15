import java.util.*;

public class TreeCount {
        public int count(TreeNode tree) {
        	if (tree == null){
                return 0;
                }
        int c = 1;
        if ( tree.left != null ) c += count(tree.left);
        if ( tree.right != null ) c += count(tree.right); 
        return c;
        }
        public class TreeNode {
      	  
            int info;
            TreeNode left;
            TreeNode right;
            TreeNode(int x){
                info = x;
            }
            TreeNode(int x, TreeNode lNode, TreeNode rNode){
                info = x;
         	  left = lNode;
            }
    }