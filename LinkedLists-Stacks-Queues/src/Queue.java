/**
 * The Queue class implements a queue data structure using the
 * inherited linked list List class.
 *
 * Now, we’ll turn our attention to building a Queue. Remember when
 * we used to cut and paste code and logic, then make subtle changes
 * to it to build our new class? Instead, we’ll use inheritance here,
 * automate the copy-and-paste, and just focus on implementing the
 * few methods that differ in our subclass (enqueue(), dequeue()).
 * When you’re done with this class, test it using driver software.
 *
 * @author Patrick O'Brien
 * @version 11/9/2019
 * */

public class Queue extends List {

    /**
     * Driver method for testing Queue class
     * @throws LinkedListException = when error with input
     * */
    public static void main(String[] args) throws LinkedListException {
        // Testing the Queue class
        //////////////////////////////////////////////////////////
        Queue queue = new Queue();
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(20);

        System.out.println("Queue: " + queue);

        while (!queue.isEmpty()) {
            System.out.println("Dequeued item: " + queue.dequeue());
        }

        System.out.println("Queue: " + queue);
    }
    // Methods:
    // 1. public boolean isEmpty(): Returns true if empty, false if otherwise
    //      - Inherited from List
    // 4. Driver
    //      - See StructureDriver class

    /**
     * Inserts at start of list
     * Inserts to the back of the queue
     * @throws LinkedListException = when error with input
     * */
    public void enqueue(Object next) throws LinkedListException {
        // if the val of next is null
        if (next == null) {
            throw new LinkedListException("Should not be null");
        }
        // create the new node if not null
        head = new Node(next, head);
    }

    /**
     * Removes at the end of the list
     * Removes from the front of the queue
     * @throws LinkedListException = when error with input
     * @return currItem --> the item that was dequeued
     * */
    public Object dequeue() throws LinkedListException {
        // check to see if the queue is empty or not
        if (isEmpty()) {
            throw new LinkedListException("Cannot delete from an empty queue.");
        }

        // Temp
        Node cNode = head; // current node
        Node pNode = null; // previous node

        // While the next node is not equal to null
        while (cNode.getM_next() != null) {
            pNode = cNode; // set previous node to current node
            cNode = cNode.getM_next(); // then set current node to to node.next
        }

        Object item; // default set to null

        // if the previous node is equal to null
        if (pNode == null) {
            item = head.getM_data(); // current item is equal to head.data
            head = head.getM_next(); // head is equal to head.next

        } else {
            item = cNode.getM_data(); // item is equal to current node data
            // the previous node is set as current node.next
            pNode.setM_next(cNode.getM_next());
        }
        return item; // return the item that was dequeued
    }
}
