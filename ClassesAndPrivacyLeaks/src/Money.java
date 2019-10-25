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
     * */
    Money(Money other)
    {
        if (other == null)
        {
            System.err.println("Money object does not exist or is equal to null");
        }
        else
        {
            this.dollars = other.dollars;
            this.cents = other.cents;
        }
    }
    // All the getters and setters should avoid privacy leaks
    /**
     * The getter method for the dollars instance variable
     * */
    private int getDollars()
    {
        return dollars;
    }

    /**
     * This is the getter method for the cents instance variable
     * */
    private int getCents()
    {
        return cents;
    }

    /**
     * This is the setter method for the dollars instance variable
     * */
    private void setDollars(int dollars)
    {
        this.dollars = dollars;
    }

    /**
     * This is the setter method for the cents instance variable
     * */
    private void setCents(int cents)
    {
        if (cents > 99 || cents < 0)
        {
            System.err.println("Invalid cent value! Must be between 0 and 99, inclusive.");
            //if cents input value is NOT between 0 and 99, then print error message and exit
            System.exit(-1);
        }
        else
        {
            this.cents = cents;
            //if it is a valid input, then set the instance var to the cents input int
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
     * */
    void setMoney(int dol, int cent)
    {
        //make new temp var to store the current dollars plus the input dollars
        int newDollars = (getDollars() + dol);

        //make new temp var to store the current cents plus the input cents
        int newCents = (getCents() + cent);

        //if the new cent value is over 99 then:
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
            //divide the value by 100, giving you the integer value and no remainder (dollars)
            int tempDollars = (newCents / 100);
            //take modulus 100 of the value, giving you the remainder value (cents)
            int tempCents = (newCents % 100);

            setDollars(newDollars + tempDollars);
            //add the new amount of dollars (made up of cents over 99 and the dollar input to this method)

            setCents(tempCents);
            //add the new amount of cents (remainder from the modulus)

        }
        else
        {
            setDollars(newDollars);
            //if cents is still less than 99, then just add the new dollar value to dollars

            setCents(newCents);
            //if cents is still less than 99, then just add the new cents value to cents
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
     * */
    public void add(Money other)
    {
        //make new temp var to store the current dollars plus the other obj's dollars
        int newDollars = (other.getDollars() + getDollars());

        //make new temp var to store the current cents plus the other obj's cents
        int newCents = (other.getCents() + getCents());

        //if the new cent value is over 99 then:
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
            return false; //if input Obj is null or not an instance of Money class, return false
        }

        //if it's NOT null and IS an instance of Money class then:
        Money that = (Money)o;
        //create a new Money object (instance of Money class) called that and store input Obj in it

        //return true if cents and dollar amounts are equivalent between Money objects
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
