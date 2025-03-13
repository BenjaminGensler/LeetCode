// Benjamin Gensler
// 3/13/25
// 369. Plus One Linked List
// Add one to the number represented in the linked list (Ex/ [1,0] -> [1,1]  or [9,9,9] -> [1,0,0,0] )
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
    public ListNode plusOne(ListNode head) {
        // base case [0]
        if(head.val == 0){
            head.val = 1;
            return head;
        }
        
        ListNode helper = new ListNode(0);
        helper.next = head;
        ListNode current = head;
        ListNode anchor = helper;

        while(current != null){
            // if the value for the number is not a 9 then we can move the anchor to the current node
            if(current.val != 9){
                anchor = current;
            }
            // go to next node;
            current = current.next;
        }

        // from where the anchor is to the end of the line add 1
        while(anchor != null){
            anchor.val = (anchor.val + 1) % 10;
            anchor = anchor.next;
        }

        // Checks to see if helper was changed or not
        if(helper.val == 0){
            return head;
        }

        // helper's value was changed and therefore must be returned (in the case of 0999)
        return helper;
    }
}
