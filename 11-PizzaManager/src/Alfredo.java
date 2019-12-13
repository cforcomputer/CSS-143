/**
 * Alfredo inherits from the Base class, which
 * inherits from the Ingredient class.
 *
 * @author Patrick O'Brien
 * @version 12/4/2019
 */
public class Alfredo extends Base {

    /**
     * Constructor for Alfredo,
     * uses the super constructor to set its
     * description, cost, and calorie count.
     */
    public Alfredo(){
        super("Alfredo sauce", new Money(2,0), 400);
    }
}
