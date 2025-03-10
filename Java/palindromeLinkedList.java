// Benjamin Gensler
// 3/10/25
// 234. Palindrome Linked List
// Check if the give singly-linked-list is a palindrome or not

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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> nums = new ArrayList<>();

        // loop to add values in singly linked-list to ArrayList
        while(head != null){
            nums.add(head.val);
            head = head.next;
        }

        // counters to check numbers in arrayList
        int leftCounter = 0;
        int rightCounter = nums.size() - 1;

        //check if numbers make a palindrome or not
        while(leftCounter <= rightCounter){
            // check if values are not equal
            if(!(nums.get(leftCounter) == nums.get(rightCounter))){
                return false;
            }
            // alter counter values by 1
            leftCounter++;
            rightCounter--;
        }
        return true;
    }
}
