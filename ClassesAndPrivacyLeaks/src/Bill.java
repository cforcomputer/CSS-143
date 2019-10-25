/**
 * @author Patrick O'Brien
 * @version 10/22/2019
 *
 * Bill Class
 * */

/**
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
        { //if null, print error message
            System.err.println("No originator entered.");
            System.exit(-1);
        }
        else
        { //if not null, set instance var to input
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
     * setter method for dueDate which sets the duedate as
     * param value if it is a valid input
     * @param nextDueDate
     */
    public void setDueDate(Date nextDueDate)
    {
        if (nextDueDate == null)
        { //if input is null value print error message
            System.err.println("No date has been entered.");
            System.exit(-1); //and exit
        }
        else
        {
            //if it is a valid input value then
            Date dueDate2 = new Date(nextDueDate);
            //create new instance/object of Date class and store input value

            dueDate = dueDate2;
            //then set the instance variable to this value
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
     * setter method for paidDate using input Date obj var.
     * copying an object because paidDate is an object
     * @param pd
     */
    public void setPaidDate(Date pd)
    {
        if (pd == null)
        {
            System.err.println("No date has been entered.");
            System.exit(-1);
        }
        else
        {
            //set a new instance/object of Date class and use it to store input value
            paidDate = new Date(pd);
            //set the instance var equal to this input value
        }
    }

    /**
     * getter method to return paidDate
     * @return Date
     */
    public Date getPaidDate()
    {
        return paidDate;
    }

    /**
     * setter method to set paidDate to null if bill has yet to be paid still
     */
    public void unpaidBill()
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
        //for amount, due date, and originator, set to param value
        setAmount(amount);
        setDueDate(date);
        setOriginator(orig);

        //paid date is set to null because it has not yet been paid
        paidDate = null;
    }

    /**
     * setter for the amount of money. copy an object constructor because
     * the amount is an object.
     * @param amt = amount Money object input as param
     */
    public void setAmount(Money amt)
    {
        if (amt == null)
        {
            System.err.println("No amount was entered");
            System.exit(-1);
        }
        else
        {
            //create new instance/object of Money class and use it to store param value
            amount = new Money(amt);
            //set the instance var equal to the input value
        }
    }

    /**
     * getter method for returning amount of money
     * @return Money obj
     */
    public Money getAmount()
    {
        return new Money(amount);
    }

    /**
     * Determines if two bills are identical
     * @return boolean, false if bills are not identical, true if they are
     * @param other = new
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
     * build a string that reports the amount, when its due, to whom,
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
    private boolean isPaid()
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
     * @param nBill = a new Bill object
     */
    Bill(Bill nBill)
    {
        this(nBill.getAmount(), nBill.getDueDate(), nBill.getOriginator());
    }
}
