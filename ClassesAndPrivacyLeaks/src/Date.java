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

public class Date
{
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
     * @param date =
     */
    public Date(Date date)
    {
        this(date.getMonth(), date.getDay(), date.getYear());
    }


    /**
     * Equals method will check if two instances / objects
     * are equivalent or not.
     * @return boolean
     * @param other =
     */
    @Override
    public boolean equals(Object other){
        if (!(other instanceof Date)){
            return false;
            //if input Object is null or not and instance of Date class, return false
        }

        Date that = (Date)other;
        //create new instance of the Date class (a Date obj) to represent the input obj

        return this.getMonth() == that.getMonth() &&
                this.getDay() == that.getDay() &&
                this.getYear() == that.getYear();
        //returns true if the month day and year of the two dates are equivalent
    }


    /**
     * toString method stores all of the elements of the Date
     * (month, day, year) in a String
     *
     * @return String
     */
    @Override
    public String toString()
    {
        return getMonth() + "/" + getDay() + "/" + getYear();
        //format is "mm/dd/yyyy"
    }

    /**
     * setter method for the date (month, day, year).
     * I copied the code from the Date Constructor to reuse code
     *
     * @param int, int, int
     */
    public void setDate(int nM, int nD, int nY)
    {
        setMonth(nM);
        setDay(nD);
        setYear(nY); //reusing code helps prevent privacy leaks
        //calls the setDate method and sets it to input month, day, and year
    }

    /**
     * setter method for months.
     * checks if input is valid (month is between 1 and 12 inclusive)
     * and if it is, sets the intance variable month to input var
     * @param nMonth =
     */
    private void setMonth(int nMonth)
    {
        if (nMonth >= 1 && nMonth <= 12)
        {
            //if nMonth is between 1 and 12 inclusive,
            this.month = nMonth;
            //set the instance var month to nMonth
        }
        else
        {
            //if not, print error message
            System.err.println("Invalid month value. Must be between 1 and 12, inclusive.");
        }
    }

    /**
     * getter method to return month value
     * @return int
     */
    public int getMonth()
    {
        return month;
    }

    /**
     * setter method for day.
     * checks if input is between 1 and 31 inclusive.
     * Even though there are some months that only have 30 days or 28 (Feb)
     *
     * @param nDay =
     */
    public void setDay (int nDay)
    {
        if (nDay >= 1 && nDay <= 31)
        {
            //if the day is between 1 and 31 then set the instance var to this
            this.day = nDay;
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
     * setter method for year
     * year must be between 2014 and 2024 inclusive
     * @param nYear =
     */
    public void setYear(int nYear){
        if (nYear >= 2014 && nYear <= 2024){
            //if year is between 2014 and 2024, then
            this.year = nYear; //set the instance var equal to this
        }
    }

    /**
     * getter method to return year value
     *
     * @return the current year as an int
     */
    public int getYear(){
        return year;
    }
}
