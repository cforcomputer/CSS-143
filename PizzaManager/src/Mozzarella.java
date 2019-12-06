/**
 * This class adds Mozzarella cheese to the pizza.
 *
 * @author Patrick O'Brien
 * @version 12/5/2019
 */

public class Mozzarella extends Cheese {

    /**
     * This constructor uses super constructor
     * to set description, cost, and calories.
     * */
    public Mozzarella() {
        super("Mozzarella cheese", new Money(1, 50), 350);
    }
}
