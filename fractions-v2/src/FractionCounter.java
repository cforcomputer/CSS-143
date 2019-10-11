/**
 * @author Patrick O'Brien
 * @version 1.0
 * This class should also be small and contain only a few state variables.
 * The purpose of this class is to store a reference to a Fraction object
 * and a count of how many times this fraction object has been seen in the input file.
 * */
public class FractionCounter {
    private int counter = 1;
    private Fraction fraction; // declare this class variable to be of type Fraction from above
    // constructor
    FractionCounter(Fraction fraction)
    {
        this.fraction = fraction;
    }
    /**
     * @return return true and increment by 1 if newFraction passed into this function
     * is the same as the fraction we're storing. Otherwise return false.
     * @param newFraction = Thew new fraction input from the Fraction object
     * */
    boolean compareAndIncrement(Fraction newFraction)
    {
        if (fraction.equals(newFraction))
        {
            counter++;
            return true;
        }
        return false;
    }
    /**
     * Replace this inherited method with one that prints out both the Fraction and its
     * count.
     * */
    @Override
    public String toString()
    {
        return fraction.toString() + " has a count of " + counter;
    }
}
