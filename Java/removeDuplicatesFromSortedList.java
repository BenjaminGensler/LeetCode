// Benjamin Gensler
// 2/18/25
// 83. Remove Duplicates from Sorted List
// remove all duplicate value from an ordered singly-linked list

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;

        while(current != null && current.next != null){
            // grab the current nodes value
            int target = current.val;
            ListNode newNode = current.next;

            // checks if the next node is a duplicate valued node
            while(newNode != null && newNode.val == target){
                newNode = newNode.next; // grabs the next node if duplicate found
            }
            
            // assign next node (skipping all previous duplicate nodes)
            current.next = newNode;
            current = newNode; 
            
        }

        return head;
    }
}
