/**
* Benjamin Gensler
* 11/10/2025
* 445. Add Two Numbers II
*/

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
    public ListNode reverseSinglyLinkedList(ListNode l1){
        ListNode prev = null;
        ListNode curr = l1;
        
        while(curr != null){
            //Debugging checks
            // System.out.println(curr.val);
            ListNode after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        
        return prev;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverseSinglyLinkedList(l1);
        l2 = reverseSinglyLinkedList(l2);

        ListNode l3 = new ListNode(0);
        ListNode prev = l3;

        int carryOver = 0;

        while(l1 != null || l2 != null || carryOver == 1){
            int sum = 0;

            if(l1 != null){
                sum += l1.val;
            }
            if(l2 != null){
                sum += l2.val;
            }
            sum += carryOver;

            //Determines if a carryOver should be applied for the next rotation
            if(sum >= 10){
                carryOver = 1;
            }
            else{
                carryOver = 0;
            }

            prev.next = new ListNode(sum % 10);
            prev = prev.next;

            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }



        }

        l3 = reverseSinglyLinkedList(l3.next);

        return l3;
    }
}
