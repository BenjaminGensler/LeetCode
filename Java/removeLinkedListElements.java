// Benjamin Gensler
// 3/10/25
// 203. Remove Linked List Elements
// Remove all ListNodes in the LinkedList that have the value of val from the list (Ex/ val = 7 [ 1,2,3,7] -> [1,2,3]  & [7,7,7,7] -> []
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
    public ListNode removeElements(ListNode head, int val) {
        // base case [] (empty list)
        if(head == null){
            return null;
        }

        // helper to handle starting removal elements (incase head needs to be removed)
        ListNode helper = new ListNode();
        helper.next = head;

        ListNode current = head;
        ListNode prev = helper;

        while(current != null){
            if(current.val == val){
                // skips repeated error vals
                while(current != null && current.val == val){
                    current = current.next;
                }

                //skips over error val(s)
                prev.next = current;
            } 
            // Move forward 1 node
            else {
                prev = current;
                current = current.next;
            }
        }

        return helper.next;
    }
}
