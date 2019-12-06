/**
 * Ingredient class is the parent class for all the categories
 * of ingredients = meat, cheese, veggies.
 *
 * Those subclasses and their subclasses use this class's constructor
 * to build each ingredient that can be used on a pizza.
 *
 * @author Patrick O'Brien
 * @version 12/3/2019
 */
public abstract class Ingredient implements Comparable {
    //instance vars
    private final Money cost; //Money object to keep track of cost of ingredients
    private final int calories; //int var to keep track of calories of ingredients
    private final String description; //String var to retrieve descriptions from each ingredient


    /**
     * Constructor method for Ingredient class.
     * Sets values of all instance vars.
     *
     * @param desc = String
     * @param m = Money class object
     * @param cal = int
     */
    public Ingredient(String desc, Money m, int cal) {

        //sets all the instance vars
        description = desc;
        cost = m;
        calories = cal;
    }

    /**
     * getter method for description of ingredients' subclasses
     *
     * @return String
     */
    public String getDesc(){
        return description;
    }

    /**
     * getter method for the price of the ingredients' subclasses
     *
     * @return Money
     */
    public Money getPrice(){
        return cost;
    }

    /**
     * getter method for returning the number of calories
     * that each ingredient has
     *
     * @return int
     */
    public int getCalorie(){
        return calories;
    }

    /**
     * Overrides the compareTo method
     * compareTo (for the comparable interface)
     * used to compare Ingredient objects.
     *
     * @param o = Object to compare
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     * @return int
     */
    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Ingredient)){ //null check and instanceof check
            throw new RuntimeException("invalid params"); //throw exception
            // and break if invalid parameters are given
        }

        Ingredient that = (Ingredient) o; //cast param object as Ingredient
        if (this.getPrice().equals(that.getPrice())){ //compare the prices; if the same return 0
            return 0;
            //return 1 if param is greater than this.getPrice()
        } else if (this.getPrice().compareTo(that.getPrice()) > 0) {
            return 1;
        } else {
            return -1; //return -1 if this.getPrice() is bigger than price of param obj
        }
    }


    /**
     * Overrides the java toString method
     * toString method which prints the ingredients descriptions,
     * calorie counts, and prices.
     *
     * @see java.lang.Object#toString()
     *
     * @return String
     */
    @Override
    public String toString(){
        String retVal = "";
        retVal += getDesc() + "(" + getCalorie() + " calories; " + getPrice() + ")";
        return retVal;
    }
}
