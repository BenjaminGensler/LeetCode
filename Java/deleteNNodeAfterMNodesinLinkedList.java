// Benjamin Gensler
// 3/10/25
// 1474. Delete N Nodes After M Nodes of a Linked List
// Alter the Singly Linked List to delete N Nodes after each set of M Nodes (Ex/ m = 3, n = 2  [1,2,3,4,5,6,7,8,9,10,11] -> [1,2,3,6,7,8,11]  )
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
    public ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode current = head;

        while(current != null){
            for (int i = 1; i < m && current != null; i++) {
                current = current.next;
            }


            ListNode skipper = current.next;

            for(int i = 0; i < n && skipper != null; i++){
                skipper = skipper.next;
            }
            current.next = skipper;
            current = skipper;
        }
        
        //
        return head;
    }
}
