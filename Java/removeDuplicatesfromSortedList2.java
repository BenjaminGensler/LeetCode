// Benjamin Gensler
// 3/11/25
// 82. Remove Duplicates from Sorted List II
// Remove all numbers that contain duplicates including the original number (Ex/ [1,1,1,2,3] -> [2,3] (all 1's removed) )
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
    public ListNode deleteDuplicates(ListNode head) {
        // base case (empty linked list, single element linked list)
        if(head == null || head.next == null){
            return head;
        }
        ListNode helper = new ListNode();
        helper.next = head;

        ListNode current = head;
        ListNode prev = helper;
        int duplicateVal;

        // visit each node in list
        while(current != null){
            //if a duplicate is found
            if(current.next != null && current.val == current.next.val){
                duplicateVal = current.val;

                // continue to run through linked list until value isn't same or null
                while(current != null && current.val == duplicateVal){
                    current = current.next;
                }
                // reassign pointers, removing all duplicate nodes
                prev.next = current;
                continue;
            }
            prev = current;
            current = current.next;
        }

        // return updated linked list
        return helper.next;
    }
}
