/**
* Benjamin Gensler
* 2/4/2026
* 160. Intersection of Two Linked Lists
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> visited = new HashSet<>();

        while(headB != null){
            visited.add(headB);
            headB = headB.next;
        }

        while(headA != null){
            if(visited.contains(headA)){
                return headA;
            }
            headA = headA.next;
        }

        return null;
    }
}
