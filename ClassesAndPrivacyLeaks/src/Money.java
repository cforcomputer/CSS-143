/**
 * @author Patrick O'Brien
 * @version 10/22/2019
 * Money class
 * Interfaces already defined, once classes implemented - design a test harness (testing strategy)
 * Driver file is just a starting point
 * Final driver should test every function in each class
 * Start development with bill and move to Money and Date object.
 *
 * 1. Our internal cents should be between [0-99] at all times
 * 2. Our internal Cents and dollars should be < 0, at all times
 * Data privacy should be maintained at all times.
 *
 * Class is used to track USD amount consisting of two integers to manage dollars and
 * cents. All dollars and cents will be positive or 0, and cents will never exceed 99.
 * */

public class Money
{
    // declare instance variables
    private int dollars;
    private int cents;

    /**
     * This constructor initializes using dollars input and assumes no cents
     * Assuming no cents, this.cents is initialized to 0.
     * */
    public Money(int dol)
    {
        this.dollars = dol;
        this.cents = 0;
    }

    /**
     * This constructor initializes dollars and cents accordingly
     * */
    public Money(int dol, int cent)
    {
        this.dollars = dol;
        this.cents = cent;
    }

    /**
     * This constructor should redirect to the one above
     * @param other = new money object as input
     * */
    Money(Money other)
    {
        if (other == null)
        {
            System.err.println("Money object does not exist or is equal to null");
        }
        else
        {
            // Assign values of other object to this object
            this.dollars = other.dollars;
            this.cents = other.cents;
        }
    }

    // Note: All the getters and setters should avoid privacy leaks
    /**
     * The getter method for the dollars instance variable
     * @return the instance variable dollar amount
     * */
    public int getDollars()
    {
        return dollars;
    }

    /**
     * This is the getter method for the cents instance variable
     * @return the instance variable amount in cents
     * */
    public int getCents()
    {
        return cents;
    }

    /**
     * This is the setter method for the dollars instance variable
     * @param dollars = the new value that the instance variable dollars
     *                will be set to.
     * */
    public void setDollars(int dollars)
    {
        this.dollars = dollars;
    }

    /**
     * This is the setter method for the cents instance variable
     * @param cents = the new value in cents (between 0 and 99)
     * */
    public void setCents(int cents)
    {
        if (cents > 99 || cents < 0)
        {
            // If cents value is not between 0 and 99, print and exit.
            System.err.println("You've entered an invalid cent value. Must be between 0 and 99!");
            System.exit(-1);
        }
        else
        {
            this.cents = cents; // If it is valid, set
        }
    }
    /**
     * This method is a getter for the total monetary amount as a double
     * @return the total monetary amount as a double, returns 5.75 as an example.
     */
    double getMoney()
    {
        return dollars + cents;
    }

    /**
     * This method sets our dollars and cents accordingly
     * This function should make use of setters for dollars and cents
     * @param dol = the new dollar amount
     * @param cent = the new cent amount
     * */
    void setMoney(int dol, int cent)
    {
        // Temp to store the current dollars + the input dollars
        int newDollars = (getDollars() + dol);

        // Temp to store the current cents + the input cents
        int newCents = (getCents() + cent);

        // New cent value is over 99 then
        centCheck(newDollars, newCents);
    }

    /**
     * This method is an extra method that removes the need for duplicate code within the setMoney method.
     * @param newDollars = the new value of the dollars as an int
     * @param newCents = the new value of cents as an int
     * */
    private void centCheck(int newDollars, int newCents)
    {
        if (newCents > 99)
        {
            // Gives you the integer value and no remainder for dollars
            int tempDollars = (newCents / 100);
            // Gives you the remainder value for cents
            int tempCents = (newCents % 100);

            // add the new amount of dollars
            setDollars(newDollars + tempDollars);
            // add the new amount of cents
            setCents(tempCents);
        }
        else
        {
            // if cents is still less than 99, then add the new dollar value to dollars
            setDollars(newDollars);
            // if cents is still less than 99, then add the new cents value to cents
            setCents(newCents);
        }
    }

    /**
     * This method adds the int passed into the function to dollars
     * should accept positive and negative arguments
     * @param dol = the current dollar amount as an int
     * */
    void add(int dol)
    {
        setDollars((getDollars() + dol));
        //adds the current dollar amount to the input dollar amount, and sets the instance var to new value
    }

    /**
     * This method takes a new money object as a method input
     * @param other = a new money object
     * */
    public void add(Money other)
    {
        // make new temp variable to store this dollars + that dollars
        int newDollars = (other.getDollars() + getDollars());

        // make new temp variable to store this cents + that cents
        int newCents = (other.getCents() + getCents());

        // if the new cent value is over 99
        centCheck(newDollars, newCents);
    }

    /**
     * This method overrides the equals method and takes an object parameter called o
     * @param o = takes a money object and compares to see if the value is equal or not
     * @return true or false, true if dollar amounts between this and that are equal,
     * false if the money object is empty or the values are not equal.
     * */
    @Override
    public boolean equals(Object o)
    {
        if (!(o instanceof Money))
        {
            return false; // If the input object is null or not an instance of Money class,
            // return false
        }

        // if it's NOT null and IS an instance of Money class
        // create a new Money object (instance of Money class) called that, storing
        // the input object.
        Money that = (Money)o;

        // If cents and dollars are true between objects, return true, otherwise false
        return this.cents == that.cents && this.dollars == that.dollars;
    }

    /**
     * This method overrides the toString method
     * @return the dollars with the cents added at the end
     * */
    @Override
    public String toString()
    {
        return "$" + dollars + "." + cents; // concatenate the string and return
    }
}
