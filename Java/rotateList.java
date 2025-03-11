// Benjamin Gensler
// 3/11/25
// 61. Rotate List
// Rotate the linked list by k values (Ex/ k = 2, [1,2,3,4,5] -> [4,5,1,2,3])
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
    public ListNode rotateRight(ListNode head, int k) {
        // base case (no rotation, empty linked list, or linked list with only one element)
        if(k == 0 || head == null || head.next == null){
            return head;
        }

        ListNode current = head; // List Node to run through linked list

        int length = 1; // length of linked list

        // determines length of linked list and puts currents at end point
        while(current.next != null){
            current = current.next;
            length++;
        }

        // loop the linked list
        current.next = head; 

        // determine the point to stop if k is larger than length (Ex/ length = 2, and k = 25)
        
        k %= length;

        // locate tail (end of linked list)
        for(int i = 0; i < length - k; i++){
            current = current.next;
        }

        //updated linked list at current position
        ListNode helper = current.next;
        current.next = null;

        return helper;
    }
}
