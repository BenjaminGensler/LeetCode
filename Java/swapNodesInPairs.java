// Benjamin Gensler
// 2/19/25
// 24. Swap Nodes in Pairs
// switch each pair of nodes in the linked list (Ex/ 1,2,3,4,5 -> 2,1,4,3,5)
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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode (0);  // dummy node for empty list
        dummy.next = head;  // dummy points to head
        ListNode prev = dummy;
        ListNode current = head;

        while(current != null && current.next != null){
            // values to swap places
            ListNode first = current;
            ListNode second = current.next;

            // Assign new pointer positions
            prev.next = second;         // point prev to second node in pair
            first.next = second.next;        // point second.next node to first node
            second.next = first;   // point first Node to second.next node

            // move forward in list by 2
            prev = first;
            current = first.next;
        }

        //return dummy.next as head has changed position
        return dummy.next;

    }
}
