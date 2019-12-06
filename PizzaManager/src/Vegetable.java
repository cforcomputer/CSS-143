import java.awt.Color; // import the color java class
/**
 * Vegetable is a subclass of Ingredient.
 * It is a parent to morae subclasses that each specify
 * a type of vegetable. Vegetables can be added to a Pizza object.
 *
 * @author Patrick O'Brien
 * @version 12/3/2019
 */
public class Vegetable extends Ingredient {
    private final Color myColor; //instance var to store color of each vegetable

    /**
     * Vegetable constructor that uses super constructor
     * to set description, cost, calorie count.
     * Color is set in this class, because it's not included
     * in the other ingredients.
     *
     * @param desc = string description
     * @param m = Money class object
     * @param cal = int
     * @param c = Color class object
     *
     * */
    public Vegetable(String desc, Money m, int cal, Color c) {
        super(desc, m, cal); //use super constructor
        myColor = c; //set color instance var
    }

    /**
     * getter method for getting a color of a vegetable.
     *
     * @return Color
     */
    public Color getColor(){
        return  myColor;
    }

    /**
     * toString method to put the Vegetable info in a
     * String and return it. uses the super class's
     * toString() method.
     *
     * @see Ingredient#toString()
     *
     * @return String
     */
    @Override
    public String toString() {
        return (super.toString() + getColor().toString());
    }

    /**
     * equals() compares if two Vegetable objects are equal or not.
     * @param o = Object to compare
     * @see java.lang.Object#equals(java.lang.Object)
     *
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        Vegetable that = (Vegetable) o;
        if (this.myColor.equals(that.getColor())) {
            super.equals(that);
        }
        return false;
    }
}
