 public class DepthSum {
        public int value(TreeNode tree){
        	return depthSum(tree, 1);
        }
        //helper function
        public int depthSum (TreeNode tree, int level) {
        	if(tree == null) return 0;
            return level * tree.info +
                depthSum(tree.left, level+1) + depthSum(tree.right, level+1);
        }
        public class TreeNode {
	      int info;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x){
	    	  info = x; }
	      TreeNode(int x, TreeNode lNode, TreeNode rNode){
	          info = x;
	          left = lNode;
	          right = rNode;
	      }
	  }
 }