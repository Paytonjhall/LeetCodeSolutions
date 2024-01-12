package PathSum;


 // Definition for a binary tree node.
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }



class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return runPath(root, targetSum, 0);
    }

    public boolean runPath (TreeNode root, int targetSum, int curTotal) {
        if (root == null) {
            return false;
        }
        curTotal = curTotal + root.val;
        if((targetSum > 0 && curTotal > targetSum) || targetSum < 0 && curTotal < targetSum)
        System.out.println("curTotal: " + curTotal);
        if (curTotal == targetSum && root.left == null && root.right == null) {
            return true;
        } else {
            if (root.left != null) {
                boolean val = runPath(root.left, targetSum, curTotal);
                if (val) return true;
                else {
                    return runPath(root.right, targetSum, curTotal);
                }
            } else if (root.right != null) {
                return runPath(root.right, targetSum, curTotal);
            }
            else return false;
        }
    }
}