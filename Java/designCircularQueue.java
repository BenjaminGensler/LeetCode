/**
* Benjamin Gensler
* 11/5/2025
* 622. Design Circular Queue
*/
class MyCircularQueue {
    int size;
    int currentSize = 0;
    ListNode head;
    ListNode tail;
    
    public MyCircularQueue(int k) {
        head = new ListNode();
        ListNode handler = head;
        size = k;
        for(int i = 1; i <=k; i++){
            ListNode current = new ListNode();
            handler.next = current;
            handler = current;
        }
        tail = head; // set tail;
    }
    
    // Add new item to circular Queue
    public boolean enQueue(int value) {
        if(currentSize < size){
            ListNode handler = new ListNode(value);
            
            if(currentSize == 0){
                head = handler;
                tail = handler;
            }
            else{
                tail.next = handler;
                tail = handler;
            }

            currentSize++;
            return true;
        }
        
        // current size is less than 
        return false;
    }
    
    // Remove new item from queue
    public boolean deQueue() {
        if(currentSize > 0){
            head = head.next;
            currentSize--;
            return true;
        }
        
        // current node is empty
        return false;
    }
    
    public int Front() {
        if(head != null && currentSize > 0){
            return head.val;  // Just return the value, don't modify anything
        }
        return -1;
    }
    
    public int Rear() {
        if(tail != null && currentSize > 0){
            return tail.val;  // Just return the tail value
        }
        return -1;
    }
    
    public boolean isEmpty() {
        if(currentSize == 0){
            return true;
        }

        return false;
    }
    
    public boolean isFull() {
        if(size == currentSize){
            return true;
        }

        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
