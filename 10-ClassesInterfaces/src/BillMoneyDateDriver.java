/**
 Simple driver to test Money, Date, and Bill classes
 Improved for the purposes of the ClassesAndPrivacyLeaks assignment
 @author Rob Nash, borrowed from cfolsen
 @author Patrick O'Brien
 */
public class BillMoneyDateDriver
{
    /**
     * This method creates new objects from classes to utilize.
     * It then utilizes ALL their methods to check for errors, creating
     * new bill objects.
     */
    public static void main(String[] args)
    {
        int errorCount = 0; // records how many tests failed
        /*
        Functionality OOP testing
        These following tests are to see if the output
        is the desired result and all inputs
        are working as they should be.
         */
        // Create new money object for testing
        Money m1 = new Money(40); // Create a new money class object
        Money m2 = new Money(m1); // Create a new money class object using the previous

        m1.setMoney(40, 90); // set the money amount for m1
        m2.setMoney(295, 30);
        Money m3 = new Money(10, 55); // Create a new money class object

        m3.setMoney(60, 80); // set the money amount for m3

        // print out the outputs for the money objects
        System.out.println("Money: \n");
        System.out.println("Money One: \n" + m1 + "\n\nMoney Two:\n" + m2 +
                "\n\nMoney Three: \n" + m3 + "\n");

        // Create new bill objects
        // Set the new Date class object to a date
        Date dueDate = new Date(2, 21, 2015);
        // Set the new paidDate object to a date
        Date paidDate = new Date(2, 15, 2015);

        // Create a new bill class object that is set to an amount
        Money amount = new Money(m2);

        Bill billOne = new Bill(amount, dueDate, "The cloud-networking company");
        //new Bill class obj that is set to the amount, dueDate, and originator

        billOne.setPaidDate(paidDate); // set a paid date to first Bill class object

        Bill billTwo = new Bill(billOne); // True since paid before the due date
        // copy the first Bill object and declare a second one
        // with the same values as the first one

        billTwo.setAmount(m3); // Set the new amount value for bill
        // set new value for paidDate for the second Bill object
        paidDate.setDate(5, 31, 2015);
        billTwo.setPaidDate(paidDate); // Set to paidDate on second Bill object
        // should return false because it was paid after due date
        if (billTwo.isPaid())
        {
            System.err.println("There is something wrong with the paidDate method in" +
                    "the bill class!");
            errorCount++;
        }
        else
        {
            System.out.println("Test passed!");
        }

        // --------------------------------------------------------------------------------
        amount.setMoney(53, 17); // set a new money amount

        // set the dueDate on second Bill obj
        billTwo.setDueDate(new Date(5, 30, 2015));
        dueDate.setDay(22); //set a new day
        Bill billThree = new Bill(amount, dueDate, "The software company");

        // new Bill class obj that is set to the amount, dueDate, and originator
        billThree.setAmount(m1); // set new money amount value for new bill
        paidDate.setDate(2,  20, 2015); // set new paidDate

        // set this new paidDate to the paidDate in third Bill obj
        billThree.setPaidDate(paidDate); // should return true
        if (!billThree.isPaid())
        {
            System.err.println("Something is wrong with the paidDate method!");
            errorCount++;
        }
        else
        {
            System.out.println("Test passed!");
        }

        System.out.println("\n\nBills: \n");

        // Print all bill objects
        System.out.println("Bill One: \n" + billOne +
                "\n\nBill Two (Copy of Bill One with new due date):" + " \n" +
                billTwo + "\n\nBill Three: \n" + billThree);

        // -----------------------------------------------------------
        // Misc. method tests
        System.out.println("Running misc checks");

        // Check functionality of unpaidBill
        Money m4 = new Money(20);
        System.out.println("\nInput: 20");
        System.out.println("GetMoney() Output: " + m4.getMoney());
        if (m4.getMoney() == 20)
        {
            System.out.println("Test passed!");
        }
        else
        {
            System.err.println("getMoney method in Money class isn't working right!");
            errorCount++;
        }

        // Add a negative number to make the total money value equal to 0
        // The following test will fail if negative numbers do not work.
        m4.add(-20);

        // Change these values to test the method
        int num1 = 10, num2 = 5;
        int sumTest = num1 + num2;
        // Testing for the Money add() method
        System.out.println("\nRunning test on Money add() \nAdding " +
                sumTest + " dollars");
        m4.add(num1);
        m4.add(num2);

        if (m4.getMoney() == (sumTest))
        {
            System.out.println("Money total is: " + m4.getMoney() + "\nTest passed!");
        }
        else
        {
            System.err.println("The Money add() method isn't working right!");
            errorCount++;
        }

        // Test for money object class
        Money m5 = new Money(40);
        m5.add(m5);
        System.out.println(m5.getMoney());
        if (m5.getMoney() == 80)
        {
            System.out.println("Test passed!");
        }
        else
        {
            System.err.println("Something is wrong with Money add(Object money) method");
            errorCount++;
        }

        // Say whether all the tests passed or not
        if (errorCount == 0)
        {
            System.out.println("\nAll tests have passed!\nThere were 0 errors.");
        }
        else
        {
            System.out.println("Not all tests passed\nThere were " + errorCount +
                    " errors.");
        }

        ////////////////////////////////////////////////////////////////////////////////////////////
        // New tests
        ////////////////////////////////////////////////////////////////////////////////////////////

                Money money = new Money(10, 50);
                System.out.println("Money value: " + money.getMoney());
                money.add(10);
                System.out.println(money.toString());
                money.add(new Money(10));
                System.out.println(money.toString());
                System.out.println();
                Date date = new Date(10, 16, 2015);
                System.out.println("Date value :" + date.toString());
                System.out.println("Is date after 10-17-2015? " + date.isAfter(new Date(10, 17, 2015)));
                System.out.println();
                Bill bill = new Bill(money, date, "dummyOriginator");
                System.out.println( bill.toString());
                bill.setAmount(new Money(40));
                System.out.println( bill.toString());

    }
}
