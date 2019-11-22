/**
 * @author Patrick O'Brien
 * @version 11/21/2019
 *
 *
 * An example of questions to ask when defining an interface (for the ExpenseAccount class):
 * What kind of data and methods should go into an ExpenseAccount class?
 * >>> Bills owed (Object billsTotalOwed)
 * > Total amount owed (double amountOwed)
 * > Date due (String billDates)
 * >>> Bills paid (Object billsPaid)
 * > Total amount paid (double amountPaid)
 * > Date paid (String datePaid)
 *
 * What would you use
 * an ExpenseAccount for?
 * What would you want to inquire of an expense account?
 * A: See methods
 * (If you don't know what an expense account is, do some web searches to find out.)
 * >>> No idea
 * A: it's a company account that keeps track of finances
 *
 * For instance, you might be interested in knowing the total amount of expenses that is
 * outstanding in the ExpenseAccount.  You might be interested in knowing which expense is next
 * due and unpaid and how much it is.  And so on ... these are just two examples of questions
 * you might ask of an expense account.  It depends on the use cases you want the expense
 * account to satisfy.  These kinds of questions can also be asked for Bill, etc.
 *
 * Build a class ExpenseAccount that extends (i.e., inherits from) your ArrayList.
 * You should remove the limit on the number of bills that can be placed in an
 * account by making your ArrayList dynamically resize itself.
 * */

public class ExpenseAccount extends ArrayList
{
    /**
     * Testing method that doesn't contain anything yet
     * */
    public static void main(String[] args)
    {
        //TODO
        // Tests
    }

    /**
     * This method will display the total number of bills owed for the ExpensesAccount
     * */
    public Object billsTotalOwed()
    {
        //TODO
        // add billsTotalOwed to the  arrayList and then return?

        return null;
    }

    /**
     * This method will display the total amount owed for the account
     * */
    public double totalAmountOwed()
    {
        //TODO
        // Add the totalAmountOwed to the arrayList and then return the value?
        return 0.0;
    }
}
