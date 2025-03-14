// Benjamin Gensler
// 3/14/25
// 1019. Next Greater Node In Linked List
// create an array of int's that relate to the provided linked list and determine where the next largest number is in relation to the current node
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
    public int[] nextLargerNodes(ListNode head) {
        int length = 0;
        ListNode current = head;

        // Get length of the array to create the array
        while (current != null) {
            length++;
            current = current.next;
        }
        current = head; // Reset current to start of list

        int[] answers = new int[length]; // Array to return
        int counter = 0;

        // Run through the array, filling in answers
        while (current != null) {
            ListNode anchor = current.next;
            while (anchor != null && anchor.val <= current.val) {
                anchor = anchor.next;
            }
            if (anchor != null) {
                answers[counter] = anchor.val;
            } else {
                answers[counter] = 0;
            }
            current = current.next;
            counter++;
        }

        return answers;
    }
}
