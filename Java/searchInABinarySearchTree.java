// Benjamin Gensler
// 3/21/25
// 700. Search in a Binary Search Tree
// Find the node in the given BST containing the val integer and return that given node. If the node doesn't exist then return an empty tree
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
    public TreeNode searchBST(TreeNode root, int val) {
        // continues until the root is found
        while(true){
            // check if val is found or not
            if(root == null || root.val == val){
                //return the current node (Effectively returning itself as the tree)
                return root;
            }
            // continues to move through tree
            else{
                // move to left node
                if(val < root.val){
                    root = root.left;
                }
                // move to right node
                else{
                    root = root.right;
                }
            }
        }
    }
}
