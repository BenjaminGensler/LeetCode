/**
* Benjamin Gensler
* 11/04/2025
* 707. Design Linked List
*/
// Singly linked list version
class MyLinkedList {
    int size;
    ListNode head;

    public MyLinkedList() {
        size = 0;
        head = new ListNode(0);
    }
    
    public int get(int index) {
        if (index >= size){
            return -1;
        }

        ListNode current = head.next;
        while(index > 0){
            current = current.next;
            index--;
        }

        return current.val;
    }
    
    public void addAtHead(int val) {
        ListNode current = new ListNode(val);
        current.next = head.next;
        head.next = current;
        size++;
    }
    
    public void addAtTail(int val) {
        ListNode newNode = new ListNode(val);
        ListNode current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if (index > size) return;

        ListNode newNode = new ListNode(val);
        ListNode current = head;
        while(index > 0){
            current = current.next;
            index--;
        }
        ListNode handler = current.next;
        current.next = newNode;
        newNode.next = handler;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if (index >= size) return;

        ListNode current = head;
        while(index > 0){
            current = current.next;
            index--;
        }
        current.next = current.next.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
