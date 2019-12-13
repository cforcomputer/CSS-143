/**
 * PizzaException is subclass of RuntimeException
 * @author Patrick O'Brien
 * @version 12/4/2019
 */
public class PizzaException extends RuntimeException {

    /**
     * passes the string to super constructor
     *
     * @param string = String
     */
    public PizzaException(String string) {
        super(string);
    }

    /**
     * no-arg constructor
     */
    public PizzaException() {
        super("There was an ERROR when making your pizza");
        //uses super constructor with this string
    }
}
