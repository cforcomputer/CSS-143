/**
 * The list class is the parent class for Stack and Queue classes
 * (The list superclass)
 *
 * Use no other instance variables here in the List class
 * (the phrase "use no other instance variables" does not refer
 * to the inner class Node, which is structured as we saw in Savitch):
 * No int size or Node tail, etc.
 * You probably will implement Node as an inner class (it's a really good idea to).
 *
 * @author Patrick O'Brien
 * @version 11/9/2019
 * */

public class List {

    // Note: Use no other instance variables in the
    // list class. Does not refer to the inner class
    // Node.

    // The start of the linked list
    // Creates a new Node class object as null
    Node head = null;

    /**
     * Nested/inner class Node
     * (Implemented as an inner class (Savitch))
     * */
    protected class Node {
        private Object m_data; // The item object container for data
        private Node m_next; // The node class acting as link

        /**
         * Node constructor method, takes one param
         * Assigns link equal to null by default.
         * @param newItem = new item object to be added to item instance var
         * */
        public Node(Object newItem) {
            m_data = newItem;
            m_next = null;
        }

        /**
         * Node constructor, takes two params, a generic Object and a Node
         * assigns new Item to item, link value to link.
         * @param newItem = the new item to be assigned to instance var item
         * @param linkValue = the link value to be assigned to node instance var
         * */
        public Node(Object newItem, Node linkValue) {
            m_data = newItem;
            m_next = linkValue;
        }

        /**
         * Setter method for the Object instance var
         * @param newItem = the new item object to be assigned
         * */
        public void setM_data(Object newItem) {
            m_data = newItem;
        }

        /**
         * Setter method for the Node instance var
         * @param linkValue = the new Node to be assigned to link
         * */
        public void setM_next(Node linkValue) {
            m_next = linkValue;
        }

        /**
         * Getter method for item Object instance var
         * @return item Object instance var
         * */
        public Object getM_data() {
            return m_data;
        }

        /**
         * Getter method for the Node instance var link
         * @return link object instance var
         * */
        public Node getM_next() {
            return m_next;
        }
    }

    /**
     * Main driver for testing List class
     * @throws LinkedListException = when error with input
     * */
    public static void main(String[] args) throws LinkedListException {
        // Testing the List class
        //////////////////////////////////////////////////////////
        List list = new List();

        list.append(100);
        list.append(200);
        list.append(300);
        list.append(400);
        System.out.println("List: " + list);

        list.insert(20, 0);
        System.out.println("List after inserting at index 0: " + list);

        list.insert(90, 3);
        System.out.println("List after inserting at index 3: " + list);

        list.remove(0);
        System.out.println("List after removing at index 0: " + list);

        list.delete(3);
        System.out.println("List after deleting at index 3: " + list);

        System.out.println("Index of object 40: " + list.indexOf(40));
        System.out.println("Size of the list: " + list.size());
    }

    /**
     * insert class Makes a new node that holds the Object "next",
     * and inserts this at the position specified by index
     *
     * Divide this method into sections/cases using an if:
     * - if adding to an empty list (changes head) {}
     * - else if adding to a single element list (changes head) {}
     * - else if adding to a populated list (n >= 2)
     * ---- The following subcases exist
     * - adding to the head of the list (changes head)
     * - adding to the body or tail of the list (not head)
     *
     * The cases above exist because of the increased complexity involved
     * when implementing a linked list, but essentially reduce to
     * determining "do I change head? Or a node indirectly attached t o head?"
     *
     * Note: not all subcases apply to each outer case; for example, you don't
     * worry about adding to the body or tail of a list if you're adding
     * to an empty list (the first outer case) Read chapter 15 for details on
     * this.
     *
     * @throws LinkedListException = when error with input
     * @param next = take the next object in the list
     * @param index = the specified position in the list
     * */
    public void insert(Object next, int index) throws LinkedListException {
        // if adding to an uninitialized list
        if (next == null) {
            throw new LinkedListException("Data should not be null");
        }

        // if adding to an empty list
        else if (isEmpty()) {
            head = new Node(next);
        }

        // else if adding to a list with a single element (changes head)
        else if (size() == 1 || index == 0) {
            head = new Node(next, head); // if adding to a single element list

        } else { // else adding to a populated list (>= 2)

            if (index > size() || index < 0) { // if index out of bounds
                throw new LinkedListException("Invalid index!");
            }

            // if adding to the populated list
            Node cNode = head;
            for (int i = 0; i < index - 1; i++) {
                cNode = cNode.m_next;
            }

            cNode.m_next = new Node(next, cNode.m_next);
        }
    }

    /**
     * Finds and deletes the node at the position specified by index
     * Note: This method, like add() above, has the following cases:
     *  - Deleting on an empty list
     *  - Deleting on a single element list (head only)
     *  - Deleting on a populated list (n >= 2)
     *  --- Following subcases
     *  - Deleting the head of the list ( changes head )
     *
     *  The cases above exist due to the complexity of correctly managing
     *  a list of nodes and a head pointer. Note your software will not
     *  provide for all (3*2==6) cases, since some subcases don’t apply
     *  to their enclosing (outer) case. For example, if you’re deleting
     *  from a single element list (head only), then you don’t have to
     *  worry about deleting from the body or tail (as this subcase
     *  doesn’t exist).
     *
     * @throws LinkedListException = throws when there is an input error
     * @param index = the specified position in the list
     * */
    public Object remove(int index) throws LinkedListException {
        Object cData;

        if (isEmpty()) {
            // Deletes on an empty list
            throw new LinkedListException("Cannot delete in an empty list");
        }
        else if (size() == 1 || index == 0) {
            // Deleting on single element
            cData = head.m_data;
            head = head.m_next;
        } else {
            if (index < 0 || index >= size()) {
                throw new LinkedListException("Invalid index");
            }
            // Deleting on populated list
            Node cNode = head;
            for (int i = 0; i < index - 1; i++) {
                cNode = cNode.m_next;
            }

            cData = cNode.m_next.m_data;
        }
        return cData;
    }

    /**
     * Adds to the end of the list
     * Appends a new node object (Object next)
     * @param next = the next object
     * @throws LinkedListException = throws when there is an input error
     * */
    public void append(Object next) throws LinkedListException {
        // if the next node is null
        if (next == null) {
            throw new LinkedListException("Should not be null");
        }
        // if the next node is empty, set the head to be that node
        else if (isEmpty()) {
            head = new Node(next);

        } else { // if node is not empty, move to end of list, create new
            Node cNode = head; // create a new node set as head
            while (cNode.m_next != null) { // while the next node is not null
                cNode = cNode.m_next; // move to the next node
            }
            cNode.m_next = new Node(next);
        }
    }

    /**
     * Same as remove but has no return value
     * @param index = designated position in the list
     * @throws LinkedListException = throws when there is an input error
     * */
    public void delete(int index) throws LinkedListException {
        // check to see if index is out of bounds
        if (index < 0 || index >= size()) {
            throw new LinkedListException("Invalid index");
        }
        // check to see if the list is empty
        else if (isEmpty()) {
            head = null;
        }
        // check to see if there is a single element
        else if (size() == 1 || index == 0) {
            head = head.m_next;

        } else { //
            Node cNode = head;
            int i = 0;
            while (i < index - 1) {
                cNode = cNode.m_next;
                i++;
            }
            cNode.m_next = cNode.m_next.m_next;
        }
    }

    /**
     * The list accessor, increments through the list and
     * counts the total number of nodes (a standard accessor)
     * @return the total number of nodes (the size of the list)
     * */
    public int size() {
        int count = 0; // keeps track of # of nodes

        // increment through list
        Node currNode = head;
        while (currNode != null) {
            count++;
            currNode = currNode.m_next;
        }
        return count; // return the # of nodes --> size()
    }

    /**
     * Enumerates list, returns enumeration as a string,
     * this method overrides the toString method to return
     * the enumerated string.
     * @return a string that lists the contents of the list
     * */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("{{"); // start of the string

        Node cNode = head;
        // collect data values from list and append to string
        while (cNode != null) { // if current node not null
            result.append(cNode.m_data); // append that node data to string

            if (cNode.m_next != null) { // if next not empty
                result.append(","); // separate values with ,
            }
            cNode = cNode.m_next; // set current node to next node
        }

        result.append("}}"); // end of the string
        return result.toString(); // return the completed string
    }

    /**
     * Checks to see if the head of the list is equal to null
     * @return returns true if empty, false if otherwise
     */
    public boolean isEmpty() {
        return (head == null); // conditional check
    }

    /**
     * A search function that finds the index
     * A sequential search that returns the index if found or -1 if not found.
     * @throws LinkedListException = throws when there is an input error
     * @param target = the target to be searched (num ex: 40)
     * */
    public int indexOf(Object target) throws LinkedListException {
        // if the target is null, throw input exception
        if (target == null) {
            throw new LinkedListException("Target should not be null");
        }

        int index = 0; // starting index
        Node currNode = head; // set temp node to head

        // While the current node is not empty, increment through list
        while  (currNode != null) {

            // if the current node data is equal to target
            if (currNode.m_data.equals(target)) {
                return index; // return the index of that node

            } else { // otherwise, increment the index
                ++index;
            }
            // set the current node to the next node
            currNode = currNode.m_next;
        }
        return -1; // return -1 if not found
    }
}
