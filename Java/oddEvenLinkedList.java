// Benjamin Gensler
// 3/12/25
// 328. Odd Even Linked List
// Reorganize the list so that the nodes at odd indices in the list are all put at the start of the linked list and evens at the end of the list all in the order they appear in the list ( Ex/ [1,2,3,4,5,6,7,8] -> [1,3,5,7,2,4,6,8] )
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
    public ListNode oddEvenList(ListNode head) {
        //base case (Already ordered)
        if(head == null || head.next == null){
            return head;
        }

        // Creating nodes to read through linked list
        ListNode odd = head;
        ListNode even = head.next;
        ListNode anchor = head.next;    // used as the starting point for the even nodes

        //loop to connect nodes by every other nodes
        while(even != null && even.next != null){
            ListNode temp = even.next;
            odd.next = even.next;
            even.next = temp.next;
            odd = temp;
            even = even.next;

        }

        //puts evens after odds in linked list
        odd.next = anchor;
        
        return head;
    }
}
