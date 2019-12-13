/**
 * This class adds the marinara base to the
 * pizza
 *
 * @author Patrick O'Brien
 * @version 12/4/2019
 */
public class Marinara extends Base{

    /**
     * Constructor method for Base.
     * Uses super constructor from Base to set
     * its description, cost, and calories.
     *
     */
    public Marinara(){
        super("Marinara Base", new Money(0,50), 80);
    }
}
