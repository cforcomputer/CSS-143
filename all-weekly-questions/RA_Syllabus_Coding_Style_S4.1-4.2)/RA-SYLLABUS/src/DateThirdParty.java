// Program for RA (Syllabus, Coding Style, S4.1-4.2)
/**
 * Display 4.4
 * */
public class DateThirdParty {
    private String month;
    private int day;
    private int year; // a four digit number

    public void setDate(int newMonth, int newDay, int newYear)
    {
        month = monthString(newMonth);
        day = newDay;
        year = newYear;
    }

    public String monthString(int monthNumber)
    {
        switch (monthNumber)
        {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
        }
        return "Month number not a month number";
    }

    // has one parameter of type int.
    // The method increases the value of the `year` instance
    // variable by the amount of this one parameter
    public int advanceYear(int input)
    {
        return year += input;
    }
}
