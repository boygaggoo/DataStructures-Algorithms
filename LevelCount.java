public class LevelCount {
        public int count(TreeNode t, int level) {
        	if (t == null || level < 0) {
        		return 0;
        		}
        	if (level == 0) {
        		return 1;
        		}
        	else {
        	    return count(t.right, level-1) + count(t.left, level-1);
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