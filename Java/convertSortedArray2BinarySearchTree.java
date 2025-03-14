// Benjamin Gensler
// 3/14/25
// 108. Convert Sorted Array to Binary Search Tree
// With the given array turn it into a binary search tree that is height-balanced
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
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = new TreeNode(); //treeNode for nums center

        // if there are numbers in the array
        if(nums.length > 0){
            // find the center of the array
            int center = nums.length / 2;
        root.val = nums[center];

            // if the root isn't the only value request the left TreeNodes
            if(nums.length != 1){
                //get the tree root for the left
                root.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, center));
            }
            //if there's more than just the 2 nodes get the right TreeNodes
            if(!(center > nums.length)){
                root.right = sortedArrayToBST(Arrays.copyOfRange(nums, center + 1, nums.length));
            }
        }
        //num is empty so set as null
        else{
            root = null;
        }
        
        //return the root
        return root;
    }
}
