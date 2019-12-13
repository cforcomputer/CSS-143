/**
 * Cheese inherits from the Ingredient class.
 * It uses the super constructor. There is no description
 * specified because there are specific types of cheeses under Cheese.
 * Cheese can be added to a Pizza object.
 *
 * @author Patrick O'Brien
 * @version 12/3/2019
 */

public class Cheese extends Ingredient {

    /**
     * Constructor for Cheese,
     * uses the super constructor.
     *
     * @param desc = String
     * @param m = Money object
     * @param cal = int
     */
    public Cheese(String desc, Money m, int cal) {
        super(desc, m, cal);
    }
}

