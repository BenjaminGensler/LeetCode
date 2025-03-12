// Benjamin Gensler
// 3/12/25
// 142. Linked List Cycle II
// Determine if the linked list has a cycle or ends and returns the node it returns to for each cycle or the end of the list
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
    ArrayList<ListNode> nodes = new ArrayList<>();
         ListNode current = head;
         boolean isCycle = false;
         
         // while loop to find either that a loop exists or there is an ending
         while(isCycle == false && current != null){
             // add to ArrayList to be checked
             nodes.add(current);
 
             // checks if ArrayList contains the next node in the list
             if(nodes.contains(current.next)){
                 isCycle = true; // cycle is found
             }
             // go to next value
             current = current.next;
             
         }
 
         // return results of cycle check
         return current;
     }
 }
