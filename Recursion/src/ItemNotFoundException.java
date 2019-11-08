/**
 * @author Patrick O'Brien
 * @version 11/7/2019
 * Defines the ItemNotFoundException used in Linear
 * and BinarySearch classes
 * */

public class ItemNotFoundException extends Exception {

    /**
     * Default constructor
     * */
    public ItemNotFoundException() {
    }

    /**
     * Constructor calls the default message from
     * inherited exception when thrown
     * */
    public ItemNotFoundException(String message) {
        super(message);
    }
}
