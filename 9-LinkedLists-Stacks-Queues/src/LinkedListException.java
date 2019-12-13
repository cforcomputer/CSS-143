/**
 * The linked list exception class inherits from Exception
 * parent class and extends on the functionality to create
 * a specialized Exception called LinkedListException that
 * handles errors/exceptions in the List parent class
 * and its child classes.
 *
 * This class should be under 15 lines of executable code and is
 * an exercise in inheriting from classes provided to you by the
 * Java API. Your class should have only two methods (both constructors)
 * and no data items; see the slides on exceptions for an example of
 * such a class. Throw this exception when an error or exceptional
 * situation occurs in your code, such as a pop() on an empty stack.
 *
 * @author Patrick O'Brien
 * @version 11/9/2019
 * */

public class LinkedListException extends Exception {

    /**
     * Default constructor the LinkedListException class
     * takes no arguments and provides the default
     * error message defined for LinkedListException
     * */
    public LinkedListException() {
        super("There is a problem with the linked list!");
    }

    /**
     * Constructor for LinkedListException that takes one
     * argument as a String message and calls super
     * in Exception parent and provides the given argument.
     * @param message = the specifically thrown error message
     *                from a different method throwing
     *                LinkedListException.
     * */
    public LinkedListException(String message) {
        super(message);
    }
}
