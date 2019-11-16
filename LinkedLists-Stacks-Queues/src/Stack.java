/**
 * The Stack class implements a stack data structure using the
 * inherited linked list List class.
 *
 * In this section, we’ll build a structure that functions like
 * a Stack externally, but is built on top of nodes and pointers
 * internally. Since we’ll be extending the List superclass, we
 * only have to provide a few functions (push, pop) that redirect
 * to superclass functions(add, remove) and so this class will
 * be quite short. When you’ve finished this class,
 * test it using driver software.
 *
 * Note: Data: None, inheriting all from List class
 *
 * @author Patrick O'Brien
 * @version 11/9/2019
 * */

public class Stack extends List {

    /**
     * Main for testing the Stack class
     * */
    public static void main(String[] args) throws LinkedListException {
        // Testing the Stack class
        //////////////////////////////////////////////////////////
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Stack: " + stack);

        // Run through the stack while it is not empty and print
        // what it is popping.
        while (!stack.isEmpty()) {
            System.out.println("Popped item: " + stack.pop());
        }
    }
    // Methods:
    // 1. public boolean isEmpty(): Returns true if empty, false if otherwise
    //      - Inherited from List
    // 4. Driver
    //      - See StructureDriver class
    /**
     * Method to add at start of list
     * Inserts to the top of the stack
     * Consider using your superclass methods here rather than implementing push
     * /shrug
     * @throws LinkedListException = when error with input
     * @param next = object val to be added to stack
     * */
    public void push(Object next) throws LinkedListException {
        // check to see if null
        if (next == null) {
            throw new LinkedListException("Value should not be null");
        }
        // if the value is not null, create new node
        head = new Node(next, head);
    }

    /**
     * Removes at start of list
     * Removes from the top of the stack
     * Consider using superclass instead of popping by hand
     * @return the current item being popped
     * @throws LinkedListException = when error with input
     * */
    public Object pop() throws LinkedListException {
        // Check to see if the stack is empty
        if (isEmpty()) {
            throw new LinkedListException("Cannot delete from an empty stack.");
        }

        Object itemToPop = head.getM_data(); // set itemToPop as current node data
        head = head.getM_next(); // set current head as next head (removing node)
        return itemToPop; // return the removed item
    }
}
