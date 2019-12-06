/**
 * This class adds the additional option of sausage
 * to the pizza.
 *
 * @author Patrick O'Brien
 * @version 12/4/2019
 * */

public class Pepperoni extends Meat {

    /**
     * Super constructor to add the pepperoni
     * sets description, cost, calories
     * */
    public Pepperoni() {
        super("Pepperoni", new Money(3, 0), 80);
    }
}
