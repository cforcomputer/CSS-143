import java.util.Scanner;
import java.io.*;

/**
 * Fraction class will have overloaded constructors,
 * a toString, and an equals method as well as setters and
 * getters for the class variables numerator and denominator.
 *
 * @author Patrick O'Brien
 * @version 12/3/2019
 */
public class Fraction implements Comparable {

    private static Scanner count; //new scanner object
    private static Scanner arrayStore; //new scanner object
    //initialize numerator and denominator int vars
    final int numerator;
    final int denominator;


    /**
     * CompareTo overrides regular compareTo and always returns 0
     * @param o = Object to compare
     * */
    @Override
    public int compareTo(Object o) {
        return 0;
    }

    /**
     * Default Fraction class constructor
     * */
    public Fraction() {
        numerator = 1;
        denominator = 1;
    }


    /**
     * Constructor that calls
     * setNumerator and setDenominator
     * methods
     *
     * @param n = int
     * @param d = int
     */
    public Fraction(int n, int d) {

        int gcd = gcdReduce(n,d); //call gcdReduce with params n, d
        numerator = (n/gcd); //set numerator to numerator/gcd
        denominator = (d/gcd); //set denominator to denominator/gcd
    }


    /**
     * constructor that takes in another Fraction obj
     *
     * @param other = Fraction
     */
    public Fraction(Fraction other) {
        //set the num and denom accordingly
        numerator = other.numerator;
        denominator = other.denominator;
    }

    /**
     * Helper method for reducing fractions
     *
     * @param n = int
     * @param d = int
     * @return int
     */
    public int gcdReduce(int n, int d) {
        return (d == 0? n : gcdReduce(d, n % d));
    }

    /**
     * This method toDecimal takes the numerator divided
     * by the denominator and casts it to a a double.
     * */
    public double toDecimal(){
        return (double)(getNumerator() / getDenominator());
    }

    /**
     * toString method puts the class vars numerator
     * and denominator into a String var
     * to print out the whole fraction in format
     * "n/d"
     *
     * @return String
     */
    public String toString(){
        return numerator + "/" + denominator;
    }

    /**
     * equals method checks if input param is null
     * and if it isn't, it will check if two fractions are equal
     *
     * @param other = Object taken to compare
     * @return boolean
     */
    @Override
    public boolean equals(Object other){
        if (other == null){ //if input param is null/nonexistent, return false
            return false;
        }
        if (!(other instanceof Fraction)){ //if input param is not a Fraction object then return false
            return false;
        }
        //if input is a Fraction object then compare its numerator and denominator to the numerator and denominator Fraction class vars
        Fraction that = (Fraction) other;
        return this.numerator == that.numerator &&
                this.denominator == that.denominator; //returns true if equal
    }

    /**
     * Getter method to return
     * numerator class var
     *
     * @return int
     */
    public int getNumerator() {
        return numerator; //return numerator var
    }



    /**
     * getter method to return
     * denominator class var
     *
     * @return int
     */
    public int getDenominator() {
        return denominator; //return denominator var
    }

    /**
     * remove function used in the eatsomepizza method
     * to subtract fractions from each other
     * and return the resulting fraction
     *
     * @param amount = Fraction
     */
    public Fraction remove(Fraction amount) {
        int n, d;

        if (getDenominator() == amount.getDenominator()){
            n = (getNumerator()-amount.getNumerator());
            d = getDenominator();
        } else {
            n = (getNumerator() * amount.getDenominator()) - (amount.getNumerator() * getDenominator());
            d = getDenominator() * amount.getDenominator();
        }
        return new Fraction(n,d);
    }


}

