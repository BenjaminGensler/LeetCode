// Benjamin Gensler
// 3/12/25
// 237. Delete Node in a Linked List
// Remove the current node in the linked list. You will not be able to see the head of the linked list. The node given will never be the tail node.
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        //Too Easy?
        // Assign the val of node to next nodes val
        node.val = node.next.val;
        // skip next node(duplicate of node now) and assign to node after (if null then perfect)
        node.next = node.next.next;
    }
}
