// Benjamin Gensler
// 3/10/25
// 3062. Winner of the Linked List Game
// Given a singly linked list of an even length, even numbers at even indices, and odd numbers at odd indices, determine between the odd/even numbers which between each pair has an average of more numbers. Return "Even", "Odd", or "Tie"

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
    public String gameResult(ListNode head) {

        int scale = 0;

        ListNode current = head;

        while(current != null){
            // compares vals and adds to appropriate integer (odd/even)
            if(current.val < current.next.val){
                scale--;
            }
            else{
                scale++;
            }

            //Move forward to next 2 pair 
            current = current.next.next;
        }

        // check if even is greater than odd
        if(scale > 0){
            return "Even";
        }
        // Returns "Odd" if odd is larger
        else if(scale < 0){
            return "Odd";
        }

        return "Tie";
    }
}
