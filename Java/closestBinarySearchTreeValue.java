// Benjamin Gensler
// 3/17/25
// 270. Closest Binary Search Tree Value
// Find the value closest to the target number in the binary search tree. 
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
    public int closestValue(TreeNode root, double target) {
        int curNum = root.val;  // value to be returned
        double difference = Math.abs(root.val - target); //difference between root.val and target

        //runs through tree, finding closest node
        while(root != null){

            // checks if the difference of the current node is closer to 0 than the previous best distance
            if(difference >= Math.abs(root.val - target)){
                if(!(curNum < root.val && difference == Math.abs(root.val - target))){
                    //new closest number found
                    curNum = root.val;
                    difference = Math.abs(root.val - target);
                }
            }
            
            //go to left is current val is bigger than target (Otherwise you would be going away)
            if(root.val > target){
                root = root.left;
            }
            // go to the right next node
            else{
                root = root.right;
            }
        }
        
        // return the closest number in tree
        return curNum;
    }
}
