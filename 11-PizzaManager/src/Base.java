/**
 * Sauce is a subclass of Ingredient.
 * It is a parent class to more subclasses that will
 * be specified sauces. Sauce can be added to a Pizza object.
 *
 * @author Patrick O'Brien
 * @version 12/3/2019
 */
public class Base extends Ingredient {

    /**
     * Constructor for Sauce uses the super constructor
     * from Ingredient. Nothing is specified, as it will be
     * specified in the subclasses of sauce types.
     *
     * @param desc = string
     * @param m = money
     * @param cal = int
     */
    public Base(String desc, Money m, int cal) {
        super(desc, m, cal);    }

}
