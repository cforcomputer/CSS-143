import java.util.Random;

/**
 * pizza class is where you can create pizza objects and add them to an arraylist
 * and then can also add ingredients and keep track of all the
 * cost of total pizzas as well as what shapes and calories the pizzas are
 *
 * @author Patrick O'Brien
 * @version 12/5/2019
 */
public class Pizza implements PizzaComparable{

    private int calories = 0;
    private Fraction remaining = new Fraction(1, 1);
    private Money price = new Money(5,0);
    private Shape myShape;
    private ArrayList<Ingredient> ingredientList = new ArrayList<>();
    private int numIngredients;

    public Pizza() {

        Random rand = new Random();

        //choose between shape by random
        if (rand.nextInt(2) ==1){
            myShape = new Square();
        } else {
            myShape = new Circle();
        }
        //set shape
        setShape(myShape);

        //choose between sauce by random
        Ingredient sauce;
        if (rand.nextInt(2) ==1){
            sauce = new Marinara();
        } else {
            sauce = new Alfredo();
        }
        addIngredient(sauce);//add the sauce

        //choose between cheese by random
        Ingredient cheese;
        if (rand.nextInt(2)==1){
            cheese = new Goat();
        } else {
            cheese = new Mozzarella();
        }
        addIngredient(cheese); //add the cheese

        //choose between meat by random
        Ingredient meat;
        if (rand.nextInt(2) == 1) {
            meat = new Sausage();
        } else {
            meat = new Pepperoni();
        }
        addIngredient(meat);
        Ingredient veggies;

        //choose between veggies by random
        if (rand.nextInt(2) == 1) {
            veggies = new Pepper();
        } else {
            veggies = new Olive();
        }
        addIngredient(veggies);
    }

    /**
     * this adds the ingredients to the piza object
     * and adds the numIngredients and also changes price
     * and calories of pizza
     *
     *  @param ing = ingredient
     */
    public void addIngredient(Ingredient ing){
        if (ing == null){ //null check, if null throw excp
            throw new PizzaException("Ingredient doesn't exist");
        }

        calories += ing.getCalorie(); //add calls
        price.add(ing.getPrice()); //add cost
        ingredientList.insert(ing, numIngredients); //insert ingredient
        numIngredients++; //increment numIngredients
    }

    /**
     * setshape of the pizza (either circle or square)
     *
     * @param s = Shape Object
     */
    public void setShape(Shape s){
        myShape = (Shape)s.clone();
    }

    /**
     * getShape of the pizza (circle or square)
     *
     * @return the shape object
     * */
    public Shape getShape() {
        return (Shape) myShape.clone();
    }


    /**
     * tostring puts everything into a string and returns it to be printed
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     *
     * @return string
     */
    @Override
    public String toString(){
        return  "Pizza has a price:" + getPrice() + " and calories:" + getCalories() +
                ", Fraction remaining:" + getRemaining() + " and area left:" + getRemainingArea() +
                " and shape:" + myShape.toString();
    }

    /**
     * eatpizza takes a fraction to remove, and returns
     * the remaining pizza fraction
     *
     * @param amount = Fraction
     */
    public void eatSomePizza(Fraction amount){
        remaining = new Fraction(remaining.remove(amount));
    }

    /**
     * getter for numCalories
     *
     * @return int
     */
    public int getCalories(){
        return this.calories;
    }


    /**
     * compareTo compares two objects to check for
     * equivalence
     *
     * @param o = Object to compare
     * @see PizzaComparable#compareTo(java.lang.Object)
     *
     * @return int
     */
    @Override
    public int compareTo(Object o) {
        if (o instanceof Pizza){
            return getPrice().compareTo(((Pizza) o).getPrice());
        } else {
            throw new IllegalArgumentException("Params can not be compared by pizza price");
        }
    }


    /**
     * compareTo compares two objects to check for
     * equivalence
     *
     * @see PizzaComparable#compareToBySize(java.lang.Object)
     * @return int
     */
    @Override
    public int compareToBySize(Object o) {
        if (o instanceof Pizza){
            Pizza that = (Pizza) o;
            return remaining.compareTo(that.remaining);
        } else {
            throw new IllegalArgumentException("Incorrect parameters to compare by size");
        }
    }


    /**
     * compareTo compares two objects to check for
     * equivalence
     *
     * @param o = Object to compare
     * @see PizzaComparable#compareToByCalories(java.lang.Object)
     *
     * @return int
     */
    @Override
    public int compareToByCalories(Object o) {
        if (o == null){
            throw new IllegalArgumentException("Incorrect parameters to compare by calories");
        }
        Pizza that = (Pizza) o;

        return Integer.compare(getCalories(), that.getCalories());
    }

    /**
     * getter for price of pizza
     *
     * @return Money
     */
    public Money getPrice(){
        return new Money(this.price.getMoney() * getRemaining().toDecimal());
    }

    /**
     * getter for remaining Pizza fraction
     *
     * @return Fraction
     */
    public Fraction getRemaining() {
        return new Fraction(remaining);
    }

    /**
     * getter for remaining pizza double
     * used for the cost refactoring
     *
     * @return double
     */
    public double getRemainingArea() {
        return (getRemaining().toDecimal());
    }
}
