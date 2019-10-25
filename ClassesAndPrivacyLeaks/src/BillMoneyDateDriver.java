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
        /*
        Functionality OOP testing
        These following tests are to see if the output
        is the desired result and all inputs
        are working as they should be.
         */
        // Create new money object for testing
        Money m1 = new Money(40); // new Money class obj
        Money m2 = new Money(m1); // new Money class obj copying that previous one

        m1.setMoney(40, 90); // set the money amount for m1
        m2.setMoney(295, 30);
        Money m3 = new Money(10, 55); // Create a new money class object

        m3.setMoney(60, 80); // set the money amount for m3

        // print out each output of the Money objects
        System.out.println("Money: \n");
        System.out.println("Money One: \n" + m1 + "\n\nMoney Two:\n" + m2 +
                "\n\nMoney Three: \n" + m3 + "\n");

        // Create new bill objs
        // Set the new Date class object to a date
        Date dueDate = new Date(2, 21, 2015);
        // Set the new paidDate object to a date
        Date paidDate = new Date(2, 15, 2015);

        // Create a new bill class object that is set to an amount
        Money amount = new Money(m2);

        Bill billOne = new Bill(amount, dueDate, "The cloud-networking company");
        //new Bill class obj that is set to the amount, dueDate, and originator

        billOne.setPaidDate(paidDate);
        //should be true that it is paid bc paid date was before due date
        //set a paid date to the first Bill class obj
        Bill billTwo = new Bill(billOne);
        // copy the first Bill obj and create a second Bill obj
        // with same as first Bill obj
        billTwo.setAmount(m3); //set new Money amount value for new bill
        //set new value for paidDate for second Bill obj
        paidDate.setDate(5, 31, 2015);
        billTwo.setPaidDate(paidDate); //set it to paidDate on second Bill obj
        //should return false because it was paid after due date

        amount.setMoney(53, 17); //set a new money amount
        //set the dueDate on second Bill obj
        billTwo.setDueDate(new Date(5, 30, 2015));
        dueDate.setDay(22); //set a new day
        Bill billThree = new Bill(amount, dueDate, "The software company");
        //new Bill class obj that is set to the amount, dueDate, and originator
        billThree.setAmount(m1); //set new money amount value for new bill
        paidDate.setDate(2,  20, 2015); //set new paidDate
        //set this new paidDate to the paidDate in third Bill obj
        billThree.setPaidDate(paidDate);
        //should return true

        System.out.println("\n\n\nBills: \n");

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
        }

        // Testing for the Money add() method
        System.out.println("\nRunning test on Money add() \nAdding 10 to dollars");
        m4.add(10);
        m4.add(5);
        if (m4.getMoney() == 35)
        {
            System.out.println("Money total is: " + m4.getMoney() + "\nTest passed!");
        }
        else
        {
            System.err.println("The Money add() method isn't working right!");
        }

        System.out.println("\nAll tests have passed!");
    }
}
