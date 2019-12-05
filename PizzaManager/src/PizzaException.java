/**
 * PizzaException is subclass of RuntimeException
 * @author Patrick O'Brien
 * @version 12/4/2019
 */
public class PizzaException extends RuntimeException {

    /**
     * passes the string to super constructor
     *
     * @param String
     */
    public PizzaException(String string) {
        // TODO Auto-generated constructor stub
        super(string);
    }


    /**
     * no-arg constructor
     */
    public PizzaException(){
        super("Error in making your pizza.");
        //uses super constructor with this string
    }
}