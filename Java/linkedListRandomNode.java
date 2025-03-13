// Benjamin Gensler
// 3/13/25
// 382. Linked List Random Node
// Return the val of a random Node in the linked list
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
    private int length = 0; //length of linked list
    private ListNode head;  //ListNode that points to head of linked list in Solution()

    public Solution(ListNode head) {
        this.head = head;
        ListNode current = head;
        while (current != null) {
            this.length++;
            current = current.next;
        }
    }

    public int getRandom() {
        // Generate a random number between 0 and length - 1
        int counter = (int)(Math.random() * length);

        // make current start at head of linked list
        ListNode current = this.head;

        // Go to node # (index)
        while(counter > 0) {
            current = current.next;
            counter--;
        }

        // return the randomly chosen Node's .val
        return current.val;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */
