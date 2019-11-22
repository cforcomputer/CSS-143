import java.io.Serializable;

/**
 * @author Patrick O'Brien
 * @version 10/22/2019
 *
 * Date Class
 *  * 1. All days should be between [1-31]
 *  * 2. All months should be between [1-12]
 *  * 3. All years should be between [2001-2024]
 *  * Data privacy should be maintained at all times.
 * */

public class Date implements Comparable<Date>, Cloneable, Serializable
{
    // implement the new serial
    private static final long serialVersionUID = -251929286948567102L;
    // Declare instance variables day, month, year
    private int day;
    private int month;
    private int year;

    /**
     * Date constructor that sets all instance variables,
     * month, day, and year based on values passed through the method
     * and calling the setDate method (reusing code) to prevent privacy leaks
     * @param inputM = The current month as input int
     * @param inputD = The current day as input int
     * @param inputY = The current year as input int
     */
    public Date(int inputM, int inputD, int inputY)
    {
        setDate(inputM, inputD, inputY);
    }

    /**
     * (Overloaded) Copy constructor
     * @param date = takes a new Date object as input
     */
    public Date(Date date)
    {
        this(date.getMonth(), date.getDay(), date.getYear());
    }

    /**
     * Equals method will check if two instances / objects
     * are equivalent or not.
     * @return boolean
     * @param other = takes a Date object as input
     */
    @Override
    public boolean equals(Object other){
        if (!(other instanceof Date)){
            return false;
            // if input Object is null or not and instance of Date class, return false
        }

        // create new instance of the Date class (a Date obj) that will represent the input
        Date that = (Date)other;
        // Returns true if the month and day are equivalent for this and that,
        // false if not.
        return this.getMonth() == that.getMonth()
                && this.getDay() == that.getDay()
                && this.getYear() == that.getYear();
    }

    /**
     * The setter method for the date (month, day, year).
     * Focusing on code reuse
     * @param newMonth = the new month input value to be set
     * @param newDay = the new day input value to be set
     * @param newYear = the new year input value to be set
     */
    public void setDate(int newMonth, int newDay, int newYear)
    {
        // Call the appropriate method to set the day, month, year
        // preventing privacy leaks through code reuse
        setMonth(newMonth);
        setDay(newDay);
        setYear(newYear);
    }

    /**
     * toString method stores all of the elements of the Date
     * (month, day, year) in a String
     * @return String
     */
    @Override
    public String toString()
    {
        return getMonth() + "/" + getDay() + "/" + getYear();
    }

    /**
     * This method sets the months
     * Check to make sure that the month is between 1 and 12
     * If between 1 and 12, set the instance val for month = newMonth
     * @param newMonth = the new month value to be checked and set
     */
    private void setMonth(int newMonth)
    {
        if (newMonth >= 1 && newMonth <= 12)
        {
            // if between 1 and 12
            this.month = newMonth; // set the new value for the instance variable
        }
        else
        {
            // if not, print error
            System.err.println("Invalid month value, must be between 1 and 12");
        }
    }

    /**
     * This method returns the month variable
     * @return the month instance variable
     */
    public int getMonth()
    {
        return month;
    }

    /**
     * setter method for day.
     * checks if input is between 1 and 31 inclusive.
     * Even though there are some months that only have 30 days or 28 (Feb)
     * @param newDay = takes the new day value to be checked and set
     */
    public void setDay (int newDay)
    {
        // if the day is between 1 and 31, then
        if (newDay >= 1 && newDay <= 31)
        {
            this.day = newDay;
        }
    }

    /**
     * getter method to return day value
     * @return the current day
     */
    public int getDay()
    {
        return day;
    }

    /**
     * The year instance variable setter method
     * Year must remain realistic and cannot be negative.
     * @param newYear = the new year instance variable value checked and set
     */
    public void setYear(int newYear)
    {
        if (newYear >= 2001 && newYear <= 2024) // if the year is not negative or too high
        {
            this.year = newYear; // set the instance variable
        }
    }

    /**
     * The getter method for the current year
     * @return the current year as an int
     */
    public int getYear()
    {
        return year;
    }

    /**
     * New method isAfter
     * @returns true if the compareTo date is after the date
     * */
    public boolean isAfter(Date compareTo)
    {
        int cmp = Integer.compare(compareTo.year, year);
        if(cmp == 0)
        {
            cmp = Integer.compare(compareTo.month, month);
            if(cmp == 0)
            {
                cmp = Integer.compare(compareTo.day, day);
                return cmp < 0;
            } else {
                return cmp < 0;
            }
        }
        else
        {
            return cmp < 0;
        }
    }

    /**
     * New compareTo method
     * @param o = Date class object
     * */
    @Override
    public int compareTo(Date o)
    {
        if (getClass() != o.getClass())
        {
            throw new IllegalArgumentException();
        }

        if(this.equals(o))
        {
            return 0;
        }

        else if (this.isAfter(o))
        {
            return 1;
        }

        else
        {
            return -1;
        }
    }

    /**
     * Overrides clone
     * */
    public Date clone()
    {
        Date d;
        try
        {
            d = (Date) super.clone();
            return d;
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
