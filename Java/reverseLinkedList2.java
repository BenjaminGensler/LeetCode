// Benjamin Gensler
// 3/11/25
// 92. Reverse Linked List II
// Based on the given points left and right, reverse the portion of the linked list from indices left to indices right  (Ex/ left = 2, right = 5  [1,2,3,4,5] -> [1,5,4,3,2])
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        // base case
        if(head == null || head.next == null || (left == right)){
            return head;
        }
        
        ListNode helper = new ListNode();
        helper.next = head;
        ListNode current = helper;
        ListNode leftNode = helper;
        ListNode rightNode = head;

        int counter = 0;

        //grab left and right node hooks
        while(counter < right){
            if(counter == left - 1){
                leftNode = current;
            }
            current = current.next;
            counter++;
        }
        rightNode = current.next;
        

        ListNode anchor = leftNode;
        current = leftNode.next;
        ListNode temp = current.next;

        //points tail of reverse list to rightNode
        current.next = rightNode;

        //loop to reverse select list
        while(temp != rightNode){
            anchor = current;
            current = temp;
            temp = temp.next;

            // point to next item in reverse list
            current.next = anchor;

        }

        // connect last node in reverse list
        current.next = anchor;

        //points leftNode to head of reverse list
        leftNode.next = current;

        return helper.next;
    }
}
