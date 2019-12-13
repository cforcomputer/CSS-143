/**
 * The Meat class is a subclass of Ingredient.
 * It uses the super constructor and is a parent class to
 * more specified types of meats for ingredient classes.
 * Meat can be added to a Pizza object.
 *
 * @author Patrick O'Brien
 * @version 12/3/2019
 */
public class Meat extends Ingredient {

    /**
     * Meat constructor using the super constructor
     * from Ingredient. Nothing specified,
     * this class has more subclasses that will be specified meats.
     */
    public Meat(String desc, Money m, int cal) {
        super(desc, m, cal);
    }
}
