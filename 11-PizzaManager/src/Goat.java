/**
 * This class adds the goat cheese to the
 * pizza.
 * @author Patrick O'Brien
 * @version 12/4/2019
 * */
public class Goat extends Cheese {

    /**
     * The constructor goat cheese,
     * uses the constructor from the super class to
     * set description, cost, and calories.
     * */
    public Goat() {
        super("Goat cheese", new Money(1, 75), 100);
    }
}
