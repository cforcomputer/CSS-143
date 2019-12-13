/**
 * The StructureDriver class is used to run and test the
 * Stack and Queue classes.
 *
 * @author Patrick O'Brien
 * @version 11/9/2019
 * */

public class StructureDriver {
    /**
     *  The main driver to test the different
     *  data structures along with the List class.
     * */
    public static void main(String[] args) throws LinkedListException {

        // Demo (Incomplete Driver for testing the List class
        //////////////////////////////////////////////////////////

        // Declare new lists
        List empty = new List();
        List one = new List();
        List multiple = new List();

        one.append(5);
        multiple.append(10);
        multiple.append(20);
        multiple.append(30);

        System.out.println("Empty:"+empty);
        System.out.println("One:"+one);
        System.out.println("Multiple:"+ multiple);

        one.delete(0);
        multiple.delete(1);
        System.out.println("One (upon delete):"+one);
        System.out.println("Multiple (upon delete):"+ multiple);

        //one.insert(600, 1);
        multiple.insert(400, 2);
        System.out.println("One (on insert):"+one);
        System.out.println("Multiple(on insert):"+ multiple);

        // Testing the List class
        //////////////////////////////////////////////////////////
        List list = new List();

        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);
        System.out.println("List: " + list);

        list.insert(60, 0);
        System.out.println("List after inserting at index 0: " + list);

        list.insert(70, 3);
        System.out.println("List after inserting at index 3: " + list);

        list.remove(0);
        System.out.println("List after removing at index 0: " + list);

        list.delete(3);
        System.out.println("List after deleting at index 3: " + list);

        System.out.println("Index of object 40: " + list.indexOf(40));
        System.out.println("Size of the list: " + list.size());

        // Testing the Queue class
        //////////////////////////////////////////////////////////
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println("Queue: " + queue);

        while (!queue.isEmpty()) {
            System.out.println("Dequeued item: " + queue.dequeue());
        }

        System.out.println("Queue: " + queue);

        // Testing the Stack class
        //////////////////////////////////////////////////////////
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Stack: " + stack);

        // Run through the stack while it is not empty and print
        // what it is popping.
        while (!stack.isEmpty()) {
            System.out.println("Popped item: " + stack.pop());
        }
    }
}
