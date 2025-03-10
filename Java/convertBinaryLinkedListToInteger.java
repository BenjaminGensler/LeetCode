// Benjamin Gensler
// 3/10/25
// 1290. Convert Binary Number in a Linked List to Integer
// Return the base 10 value of the binary value represented in the singly linked list
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
    public int getDecimalValue(ListNode head) {
        int val = 0;
        ListNode current = head;

        while(current != null){

            //always double for each interation
            val *= 2;
            
            // add 1 to the value if val is 1
            if(current.val == 1){
                val += 1;
            }

            // go to next ListNode
            current = current.next;
        }

        return val;
    }
}
