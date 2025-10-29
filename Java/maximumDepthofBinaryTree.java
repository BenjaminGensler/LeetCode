/**
* Benjamin Gensler
* 10/29/2025
* 104. Maximum Depth of Binary Tree
*/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        // Handle empty tree case
        if (root == null) {
            return 0;
        }
        
        // Get depth of both branches
        int leftBranchDepth = maxDepth(root.left);
        int rightBranchDepth = maxDepth(root.right);
        
        // Return larger number
        if(leftBranchDepth > rightBranchDepth){
            return 1+leftBranchDepth;
        }
        return 1+rightBranchDepth;
        
    }
}
