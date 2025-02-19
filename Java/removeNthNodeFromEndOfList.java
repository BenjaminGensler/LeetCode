// Benjamin Gensler
// 2/19/25
// 19. Remove Nth Node From End of List
// Remove the Node that is at the nth position from the end of the linked list 
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // add additional empty Linked List to handle list with only 1 node (Ex: [1])
        ListNode dummy = new ListNode(0);
        // attach empty list to head
        dummy.next = head;
        // create current and tail ListNodes at dummy node start
        ListNode current = dummy;
        ListNode tail = dummy;

        // Move current n nodes
        for (int i = 0; i <= n; i++) {
            current = current.next;
        }

        // Move both current and tail until reaching end of list
        while (current != null) {
            current = current.next;
            tail = tail.next;
        }

        // Remove the nth node from the end
        tail.next = tail.next.next;

        return dummy.next;
    }
}
