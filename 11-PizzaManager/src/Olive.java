import java.awt.*;

/**
 * This class adds Olives to the pizza
 *
 * @author Patrick O'Brien
 * @version 12/3/2019
 * */

public class Olive extends Vegetable{

    /**
     * Call super constructor and
     * create the new Olive class.
     * */
    public Olive() {
        super("Olive", new Money(3, 50), 20, Color.GREEN);
    }
}
