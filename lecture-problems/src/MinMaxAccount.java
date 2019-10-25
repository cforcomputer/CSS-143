/**
 * Assume credit and debit methods change the account balance.
 * A company has written a large class BankingAccount with many methods including:
 *   Method/Constructor 	Description
 *   public BankingAccount(Startup s) 	constructs a BankingAccount object using information in the Startup object s
 *   public void debit(Debit d) 	records the given debit
 *   public void credit(Credit c) 	records the given credit
 *   public int getBalance() 	returns current balance in pennies
 *
 *   Design a new class MinMaxAccount whose instances can be used in place of a BankingAccount object but include
 *   new behavior of remembering the minimum and maximum balances ever recorded for the account.
 *   You should provide the same methods as the superclass, as well as the following new behavior:
 * 
 */

/**
 * Constructs a MinMaxAccount object using the information in the Startup object s
 */

 public class MinMaxAccount extends BankingAccount
 {
    public MinMaxAccount(Startup s)
    {
            BankingAccount newBank = new BankingAccount(s);
    }

    /**
     * @return returns minimum balance in pennies
     */
    public int getMin()
    {
        return 1;
    }

    /**
     * @return returns maximum balance in 
     */
    public int getMax()
    {
        return 1;
    }
 }
