/**
 * This class adds the additional option of sausage
 * to the pizza.
 *
 * @author Patrick O'Brien
 * @version 12/4/2019
 * */

public class Sausage extends Meat {

    /**
     * Super constructor to add the sausage with
     * all that sausage jazz. Man I love sausage.
     * */
    public Sausage() {
        super("Sausage", new Money(2, 25), 110);
    }
}
