// Benjamin Gensler
// 3/11/25
// 141. Linked List Cycle
// Figure out if there is a cycle in the linked list (never reaches null)
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
    public boolean hasCycle(ListNode head) {
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
            // go to next node in linked list
            else{
                current = current.next;
            }
            
        }

        // return results of cycle check
        return isCycle;
    }
}
