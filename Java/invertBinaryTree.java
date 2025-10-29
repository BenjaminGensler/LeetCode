/**
* Benjamin Gensler
* 10/29/2025
* 226. Invert Binary Tree
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
    public TreeNode invertTree(TreeNode root) {
        // handles null nodes
        if (root == null) {
            return null;
        }

        TreeNode handler = root.left;

        root.left = root.right;
        root.right = handler;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
