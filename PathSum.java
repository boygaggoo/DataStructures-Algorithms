public class PathSum {
    public int hasPath(int target, TreeNode tree){

	if (tree == null)
		return 0;
	if (tree.info == target && (tree.left == null && tree.right == null))
		return 1;
	else if (hasPath(target - tree.info, tree.left) == 1
			|| hasPath(target - tree.info, tree.right) == 1) {
		return 1;
	} else {
		return 0;
	}
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