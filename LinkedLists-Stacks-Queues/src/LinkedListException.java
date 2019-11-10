/**
 * @author Patrick O'Brien
 * @version 11/9/2019
 * */

public class LinkedListException extends Exception {
    public LinkedListException() {
        super("There is a problem with the linked list!");
    }

    public LinkedListException(String message) {
        super(message);
    }
}
