// Benjamin Gensler
// 3/25/25
// 230. Kth Smallest Element in a BST
// find kth largest in BST. (Ideally you can use an inorder traversal and go till you reach kth number)
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
    private int counter; // counter used across function to find kth smallest node

    public int kthSmallest(TreeNode root, int k) {
        counter = k;
        return printInorder(root);
    }

    public int printInorder(TreeNode node)
        {
            if (node == null) {
                return -1; // Base case: return an invalid value if the node is null
            }
            // goes to smallest node
            int left = printInorder(node.left);
            // checks if current node is kth smallest
            if(counter == 0){
                return left;
            }
            counter--;

            // check if current node is kth smallest
            if(counter == 0){
                return node.val;
            }

            // return right node
            return printInorder(node.right);

        }
}
