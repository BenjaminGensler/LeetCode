// Given a singly linked list you will need to reverse the order of the linked list (1,2,3,4,5 -> 5,4,3,2,1)
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
    public ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        ListNode prev = newHead;

        while(head != null){
            ListNode nextVal = head.next;
            head.next = prev;
            prev = head;
            head = nextVal;
        }
        return prev;
    }
}
