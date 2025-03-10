// Benjamin Gensler
// 3/10/25
// 876. Middle of the Linked List
// Find the middle point of the linked list and right the second half. (If there are 2 middle points then return the second only)
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
    public ListNode middleNode(ListNode head) {
        ListNode helper = head;

        // moves middle by 1 and helper by 2
        while(helper != null && helper.next != null){
            helper = helper.next.next;
            head = head.next;
        }
        
        //returns middle value
        return head;
    }
}
