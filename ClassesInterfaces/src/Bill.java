/**
 * @author Patrick O'Brien
 * @version 10/22/2019
 *
 * Bill Class
 *
 * 1. The internal paid date should be on or earlier than the due date.
 * 2. Every Bill is owed someone, so the originator should never be empty.
 * Data privacy should be maintained at all times.
 * */
public class Bill
{
    // Instance and class variables
    private Money amount; // a Money object
    private Date dueDate; // a Date object
    private Date paidDate; // a Date object, null if not yet paid
    private String originator; // a String containing the company or
    // institution who issued the bill

    /**
     * setter method for originator sets the instance var
     * to the value passed through if it is a valid input
     * @param orig = a string input that contains the company or institution name
     */
    public void setOriginator(String orig)
    {
        if (orig == null)
        {
            // if null, print error
            System.err.println("No originator entered.");
            System.exit(-1);
        }
        else
        {
            //if not null, set instance variable to the input
            originator = orig;
        }
    }

    /**
     * getter method for originator, to return
     * originator var value
     * @return the the originator string
     */
    public String getOriginator()
    {
        return originator;
    }


    /**
     * This method is a setter method for dueDate which sets the dueDate as
     * param value if it is a valid input
     * @param nextDueDate = Date object input containing date values
     */
    public void setDueDate(Date nextDueDate)
    {
        if (nextDueDate == null)
        { // if input is null value print error message
            System.err.println("No date has been entered.");
            System.exit(-1); //and exit
        }
        else
        {
            // if it is a valid input value then
            dueDate = new Date(nextDueDate);
        }
    }

    /**
     * getter method for dueDate which returns Date obj
     * @return Date obj
     */
    public Date getDueDate()
    {
        return dueDate;
    }

    /**
     * setter method for paidDate using input Date object variable.
     * copying an object because paidDate is an object
     * @param paidDate = paidDate Date input
     */
    public void setPaidDate(Date paidDate)
    {
        if (paidDate == null)
        {
            System.err.println("No date has been entered.");
            System.exit(-1);
        }
        else
        {
            // set a new instance/object of Date class and use it to store input value
            this.paidDate = new Date(paidDate);
        }
    }

    /**
     * Getter method to return paidDate
     * @return Date object
     */
    public Date getPaidDate()
    {
        return paidDate;
    }

    /**
     * The setter method to set paidDate = null if still not paid
     */
    public void setUnpaid()
    {
        paidDate = null;
    }

    /**
     * Constructor for Bill class to set amount, duedate, and originator
     * values accordingly to the param values
     * @param date = the current date
     * @param amount = the current money object
     * @param orig = the originator string
     */
    public Bill(Money amount, Date date, String orig)
    {
        // for amount, due date, and originator, set to param value
        setAmount(amount);
        setDueDate(date);
        setOriginator(orig);

        // paid date is set to null because it has not yet been paid
        setUnpaid();
    }

    /**
     * setter for the amount of money. copy an object constructor because
     * the amount is an object.
     * @param amount = amount Money object input as param
     */
    public void setAmount(Money amount)
    {
        if (amount == null)
        {
            System.err.println("No amount was entered");
            System.exit(-1);
        }
        else
        {
            // New instance/object of Money class, use to store param value
            this.amount = new Money(amount);
        }
    }

    /**
     * This method is a getter method for returning amount of money
     * @return Money obj
     */
    public Money getAmount()
    {
        return new Money(amount);
    }

    /**
     * Determines if two bills are identical
     * @return boolean, false if bills are not identical, true if they are
     * @param other = new Bill object
     */
    @Override
    public boolean equals(Object other)
    {
        if (!(other instanceof Bill))
        {
            return false; // if not a Bill object or equal to null
            // return false
        }
        else
        {
            Bill that = (Bill) other;
            //create new instance of Bill to store input value
            //returns true if all are equal to each other
            return this.amount == that.amount &&
                    this.dueDate == that.dueDate &&
                        this.originator.equals(that.originator);
        }
    }

    /**
     * Build a string that reports the amount, when its due, to whom,
     * whether paid, and if paid, and the date paid.
     * @return The amount and when it was due, and if paidDate is set, the date
     * the payment was paid.
     */
    @Override
    public String toString()
    {
        // Amount and when it is due
        String results = ("Amount: " + getAmount() + "\nDue: " +
                getDueDate() + "\nOriginator: " + getOriginator());

        // If paidDate is set
        if (paidDate != null)
        {
            // Print whether the amount was paid and when
            results += ("\nWas it paid?: " + isPaid() + "\nDate Paid: " + getPaidDate());
        }
        return results; // return the resulting string
    }

    /**
     * This method checks to see if it is past the due date for the payment.
     * @return true or false, false if it is past the due date, true if it is not
     * */
    public boolean isPaid()
    {
        if (getPaidDate() != null) // if the PaidDate is not empty
        {
            /*
            If the current year is less than or equal to the year of the due date
            AND the current month is less than or equal to the month of the due date
            AND the current day is less than or equal to the due date, then
            return false or true
             */
            return getPaidDate().getYear() <= getDueDate().getYear() &&
                    (getPaidDate().getMonth() <= getDueDate().getMonth()) &&
                    (getPaidDate().getDay() <= getDueDate().getDay());
        }
        return false;
    }

    /**
     * Overloaded copy constructor of the Bill constructor.
     * Helps to prevent privacy leaks
     * @param newBill = a new Bill object
     */
    Bill(Bill newBill)
    {
        this(newBill.getAmount(), newBill.getDueDate(), newBill.getOriginator());
    }
}
