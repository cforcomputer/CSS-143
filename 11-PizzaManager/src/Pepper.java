import java.awt.*;

/**
 * This class adds peppers to the pizza
 *
 * @author Patrick O'Brien
 * @version 12/3/2019
 * */

public class Pepper extends Vegetable {

    /**
     * Pepper default constructor calls super in hierarchy to create
     * a new pepper.
     * */
    public Pepper() {
        super("Pepper", new Money(1, 0 ), 20, Color.BLACK);
    }
}
