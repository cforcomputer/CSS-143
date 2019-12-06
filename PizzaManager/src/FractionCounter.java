/**
 * FractionCounter class will have a toString method and compareAndIncrement
 * which will take in a Fraction object and compare it to another Fraction
 * object that is already stored in my class variables
 *
 * @author Patrick O'Brien
 * @version 12/3/2019
 * */

public class FractionCounter {

    private Fraction theFraction; // new Fraction object
    private int counter = 1; // new int counter variable

    /**
     * Constructor that takes in a Fraction object
     * and sets class variable equal to this object
     *
     * @param fraction = the Fraction class object
     */
    FractionCounter(Fraction fraction){
        this.theFraction = fraction;
    }


    /**
     * This method overrides the toString method
     * @return a string that has the total count
     * Fraction has a count of x
     */
    @Override
    public String toString(){
        // initializes String var retVal and calls toString method from
        // Fraction class then prints out how many instances of the fraction
        return theFraction.toString() + " has a count of " + counter; //return the String retVal
    }

    /**
     * compareAndIncrement compares a Fraction object
     * to the class Fraction object and checks if the
     * two are equal to each other
     *
     * @param newFraction = Fraction class object
     * @return boolean
     */
    public boolean compareAndIncrement(Fraction newFraction){
        if (theFraction.equals(newFraction)){ //if the two fractions are equal
            counter++; //increment the counter variable
            return true; //return boolean true
        } else {
            return false; //if not equal, return false
        }
    }

}
