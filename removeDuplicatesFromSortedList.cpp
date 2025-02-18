// Benjamin Gensler
// 2/18/25
//83. Remove Duplicates from Sorted List
// Remove all duplicates from an ordered singly-linked list
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* deleteDuplicates(ListNode* head) {
        ListNode* current = head;

        while(current != nullptr && current->next != nullptr){
            // grab the current nodes value
            int target = current->val;
            ListNode* newNode = current->next;

            // checks if the next node is a duplicate valued node
            while(newNode != nullptr && newNode->val == target){
                newNode = newNode->next; // grabs the next node if duplicate found
            }
            
            // assign next node (skipping all previous duplicate nodes)
            current->next = newNode;
            current = newNode; 
            
        }

        return head;
    }
};
