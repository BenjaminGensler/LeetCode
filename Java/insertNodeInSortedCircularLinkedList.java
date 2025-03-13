// Benjamin Gensler
// 3/13/25
// 708. Insert into a Sorted Circular Linked List
// With a circular Linked List insert a Node with the value insertVal at the point where it would still be sorted
/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _next) {
        val = _val;
        next = _next;
    }
};
*/

class Solution {
    public Node insert(Node head, int insertVal) {
        // base case (empty Linked List)
        if(head == null){
            Node newNode = new Node(insertVal);
            newNode.next = newNode;
            return newNode;
        }

        Node current = head.next;
        Node prev = head;

        // run through the Linked List until values are found that the value can be placed between
        while(true){
            // handles between 2 nodes
            if(prev.val <= insertVal && insertVal <= current.val){
                break;
            }
            // handles between end and start of list
            if((insertVal >= prev.val || insertVal <= current.val) && (prev.val > current.val)){
                break;
            }
            current = current.next;
            prev = prev.next;

            // if statements that breaks the loop in case full lap has been made
            if(prev == head){
                break;
            }
        }

        // Create the new Node and connect it between the correct Nodes
        Node newNode = new Node(insertVal);
        prev.next = newNode;
        newNode.next = current;

        // return the head node
        return head;
    }
}
