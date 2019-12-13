/**
 * Money class that allows you to set a value for a dollar amount and
 * a number of cents. Using two class-wide instance vars to be accessed and
 * mutated by getter and setter methods.
 *
 * @author Patrick O'Brien
 * @version 12/5/2019
 */

public class Money implements Comparable{

    //started by initializing the vars to 0 to keep compiler happy and because we can't have negative values
    private int dollars = 0;
    private int cents = 0;

    @Override
    public int compareTo(Object o){
        // TODO Auto-generated method stub
        if (!(o instanceof Money)){
            throw new RuntimeException("invalid params");
        }

        Money that = (Money) o;
        if (this.dollars == that.dollars &&
                this.cents == that.cents) {
            return 0;
        } else if (that.getMoney() < this.getMoney()){
            return 1;
        } else {
            return -1;
        }
    }

    /**
     * getmoney returns the value of dollars and cents
     *
     * @return double
     */
    public double getMoney(){
        return getDollars() + (getCents()*0.01);
    }

    /**
     * Constructor that sets dollars to
     * given value, and then cents to 0
     *
     * @param dol = int
     */
    Money(int dol){
        this.dollars = dol;
        this.cents = 0;
    }

    /**
     * Constructor that sets dollar and cents
     * amounts to given values
     *
     * @param dol = int
     * @param cent = int
     */
    public Money(int dol, int cent){
        this.dollars = dol;
        this.cents = cent;
    }

    /**
     * "Copy constructor"
     * It sets a Money object given to the same dollar
     * and cents values as the instance vars
     *
     * @param other = Money class object
     */
    Money(Money other){
        if (other == null){
            System.err.println("Invalid!");
        } else {
            dollars = other.dollars;
            cents = other.cents;
        }
    }

    /**
     * money constructor that takes a double and sets the dollars and cents
     * accordingly
     *
     * @param d = double
     */
    public Money(double d) {
        setDollars((int)d);
        setCents((int)(d-dollars) * 100);
    }

    /**
     * setter method to set the dollars and cents based on given
     * input values
     *
     * @param d = int
     * @param cent = int
     */
    public void setMoney(int d, int cent) {
        setDollars(d);
        setCents(cent);
    }


    /**
     * this toString method stores the money (dollar and cent value) together
     * in a String, and then returns it
     *
     * @return String
     */
    @Override
    public String toString(){
        return "$" + dollars + "." + cents;
    }

    /**
     * this method compares two objects for equivalence
     *
     * (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     *
     * @param other = Object
     * @return boolean
     */
    @Override
    public boolean equals(Object other){
        if (!(other instanceof Money)) {
            return false; //if input Obj is null or not an instance of Money class, return false
        }

        //if it's NOT null and IS an instance of Money class then:
        Money that = (Money)other;
        //create a new Money object (instance of Money class) called that and store input Obj in it

        //return true if cents and dollar amounts are equivalent between Money objects
        return this.cents == that.cents && this.dollars == that.dollars;
    }

    /**
     * Add method that adds a dollar value to the
     * instance dollar variable
     *
     * @param dol = int
     */
    public void add (int dol){
        setDollars((getDollars() + dol));
        //adds the current dollar amount to the input dollar amount, and sets the instance var to new value

    }

    /**
     * Overloaded add method that adds a dollar amount and cents amount to
     * the current instance vars dollar and cents
     *
     * @param dol = int
     * @param cent = int
     */
    public void add (int dol, int cent){

        //make new temp var to store the current dollars plus the input dollars
        int newDollars = (getDollars() + dol);

        //make new temp var to store the current cents plus the input cents
        int newCents = (getCents() + cent);


        //if the new cent value is over 99 then:
        newMoney(newDollars, newCents);
    }

    /**
     * Overloaded add method in case the argument passed through
     * the add method is an instance of Money class. Copied the code
     * from the previous method and changed the initial calculations for
     * the newDollars and newCents int vars.
     *
     * @param other = Money class object
     */
    public void add(Money other){

        //make new temp var to store the current dollars plus the other obj's dollars
        int newDollars = (other.getDollars() + getDollars());

        //make new temp var to store the current cents plus the other obj's cents
        int newCents = (other.getCents() + getCents());

        //if the new cent value is over 99 then:
        newMoney(newDollars, newCents);
    }

    /**
     * This method removes the need for duplicate code in the add
     * method.
     * @param newDollars = int
     * @param newCents = int
     * */
    private void newMoney(int newDollars, int newCents) {
        if (newCents > 99) {
            //divide the value by 100, giving you the integer value and no remainder (dollars)
            int tempDollars = (newCents / 100);
            //take modulus 100 of the value, giving you the remainder value (cents)
            int tempCents = (newCents % 100);

            setDollars(newDollars + tempDollars);
            //add the new amount of dollars (made up of cents over 99 and the dollar input to this method)

            setCents(tempCents);
            //add the new amount of cents (remainder from the modulus)

        } else {
            setDollars(newDollars);
            //if cents is still less than 99, then just add the new dollar value to dollars

            setCents(newCents);
            //if cents is still less than 99, then just add the new cents value to cents
        }
    }

    /**
     * getter method to return dollar amount
     *
     * @return int
     */
    public int getDollars() {
        return dollars;
    }

    /**
     * setter method to set the instance var to
     * given value of dollars
     *
     * @param dollars = int
     */
    public void setDollars(int dollars) {
        this.dollars = dollars;
    }

    /**
     * getter method to return cents amount
     *
     * @return int
     */
    public int getCents() {
        return cents;
    }

    /**
     * setter method that sets cents vars to the
     * given input variable if the input is valid
     *
     * @param cents = int
     */
    public void setCents(int cents) {
        if (cents > 99 || cents < 0) {
            System.err.println("Invalid cent value! Must be between 0 and 99, inclusive.");
            //if cents input value is NOT between 0 and 99, then print error message and exit
            System.exit(-1);
        } else {
            this.cents = cents;
            //if it is a valid input, then set the instance var to the cents input int
        }
    }
}
