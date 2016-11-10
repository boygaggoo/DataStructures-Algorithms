public class PathSum {
	public int hasPath(int target, TreeNode tree){
		//base case 1: empty tree
		if (tree == null || target < 0) {
    		return 0;
    		}
		//base case 2: leaf node
        return 0;
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
                right = rNode;
            }
        }
    }