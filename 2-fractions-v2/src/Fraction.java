/**
 * @author Patrick O'Brien
 * @version 1.0
 * This class should be a simple abstraction (i.e., a small class) that represents the ratio of two numbers.
 * There will be only two data elements, and only a few methods.  Note that it is required for your Fraction
 * class to store your ratio in reduced form, with the numerator and denominator as whole numbers, so this is
 * a feature to implement in your software.
 * */

public class Fraction {

    // numerator and denominator as whole numbers
    private int numerator = 1;
    private int denominator = 1;
    private double d_numerator = 1.0;
    private double d_denominator = 1.0;

    /**
     * Default Constructor
     * */
    Fraction(){}
    /**
     * Overloading constructor
     * @param num = numerator
     * @param denom = denominator
     * */
    Fraction(int num, int denom)
    {
        setNumerator(num);
        setDenominator(denom);
        reduce(num, denom);
    }
    Fraction(double dnum, double ddenom)
    {
        setD_numerator(dnum);
        setD_denominator(ddenom);
        d_Reduce(dnum, ddenom);
    }
    Fraction(int num, double ddenom)
    {
        setNumerator(num);
        setD_denominator(ddenom);
    }
    Fraction(double num, int denom)
    {
        setD_numerator(num);
        setD_denominator(denom);
    }

    /**
     * @return returns comparison between "this" and "other" - true or false.
     * Overloading the .equals() method
     * @param other = takes the "other" ObjectList (containing numerator & denominator)
     * */
    @Override
    public boolean equals(Object other)
    {
        if (other == null) // if other does not exist, return false
        {
            return false;
        }
        // instanceof is a keyword that is used for checking if a reference variable is containing a given
        // type of object reference or not.
        if (!(other instanceof Fraction)) // if not fraction, return false
        {
            return false;
        }
        // compare numerator and denominator from each object to see if they match
        Fraction that = (Fraction) other;
        return  this.numerator == that.numerator && this.denominator == that.denominator;
    }

    /**
     * @return replace the inherited method with on appropriate to the class
     * Overloading the .toString() method
     * */
    @Override
    public String toString()
    {
        return numerator + "/" + denominator;
    }

    // Getters and setters
    /**
     * @return the numerator instance variable as public
     * */
    public int getNumerator()
    {
        return numerator;
    }
    /**
     * @return the denominator instance variable as public
     * */
    public int getDenominator()
    {
        return denominator;
    }
    /**
     * The method that sets the instance variable to the constructor param input value for the numerator.
     * @param num = the numerator set from the constructor
     * */
    private void setNumerator(int num)
    {
        this.numerator = num;
    }
    /**
     * setter, checks to see if the denominator is equal to zero before running.
     * This avoids fractions that can't be reduced, avoiding wasted processing power.
     * @param denom = denominator input from constructor
     * */
    private void setDenominator(int denom)
    {
        if (denom == 0) // can't divide by zero
        {
            System.out.println("Can't divide by zero");
            return;
        }
        this.denominator = denom;
    }
    /**
     * Setter for the double denominator
     * @param ddenom = denominator as a double
     * */
    private void setD_denominator(double ddenom)
    {
        if (ddenom == 0)
        {
            System.out.println("Can't divide by zero");
            return;
        }
        this.d_denominator = ddenom;
    }
    /**
     * Setter for the double numerator
     * @param dnum = numerator as a double
     * */
    private void setD_numerator(double dnum)
    {
        this.d_numerator = dnum;
    }

    /**
     * @return the greatest common divisor for the fraction
     * This is the Euclidean algorithm for finding the greatest common divisor,
     * reducing a fraction into its simplest form.
     * @param num = the numerator of the fraction
     * @param denom = the denominator of the fraction
     * */
    private int gcd(int num, int denom)
    {
        return denom == 0 ? num : gcd(denom, num % denom);
    }

    /**
     * @return double reduced version of gcd application
     * @param
     * */
    private double d_gcd(double num, double denom)
    {
        return denom == 0 ? num : d_gcd(denom, num % denom);
    }
    /**
     * @return int double reduced version of gcd application
     * @param
     * */
    private double d_gcd(int num, double denom)
    {
        return denom == 0 ? num : d_gcd(denom, num % denom);
    }

    /**
     * @return int double reduced version of gcd application
     * @param
     * */
    private double d_gcd(double num, int denom)
    {
        return denom == 0 ? num : d_gcd(denom, num % denom);
    }
    /**
     * reduce takes the numerator and denominator from the constructor input and converts it to
     * its simplest form, reducing the fraction.
     * @param num = numerator
     * @param denom = denominator
     * */
    private void reduce(int num, int denom)
    {
        int gcd = gcd(num, denom);
        this.numerator = num / gcd;
        this.denominator = denom / gcd;
    }

    /**
     * DOUBLE VERSION reduction
     * reduce takes the numerator and denominator from the constructor input and converts it to
     * its simplest form, reducing the fraction.
     * @param num = numerator
     * @param denom = denominator
     * */
    private void d_Reduce(double num, double denom)
    {
        double gcd = d_gcd(num, denom);
        this.d_numerator = num / gcd;
        this.d_denominator = denom / gcd;
    }
}
