import java.util.Scanner;

/** PizzaManager Skeleton File
 *  CSS 162, Final Project
 * 
 *  This class is a starting point for your final project and is incomplete.
 *  Note that if there are any inconsistencies between this skeleton and
 *  the assignment description, the assignment description controls.
 * 
 *  Author: Rob Nash with edits by Johnny Lin and Patrick O'Brien
 */
public class PizzaManager {
    /*
     *  TODO: Data definitions here.  
     */
    private ArrayList<Pizza> pizzaList = new ArrayList<>();
    private int numPizzas = 0;

    /** 
     * The console interface is defined in the start method 
     * You can exit or extend the code below to accomplish all of 
     * the outcomes defined in the homework document
     */
    public void start() {
        // char selection='q';
        boolean run = true;
        Scanner foo = new Scanner(System.in);
        
        while(run) {
            displayAllPizzas();
            displayInstructions();
            
            
             //foo.nextChar() doesn't exist, so now what?
            // create a getNextChar method
            
            switch(getNextChar()) {
                case 'A':    
                case 'a':    System.out.println("Adding a random pizza to the ArrayList<Pizza>.");
                                //todo:
                                addRandomPizza();
                                break;
                case 'H':    
                case 'h':    System.out.println("Adding one hundred random pizzas to the ArrayList<Pizza>.");
                                //todo:
                                addOneHundredPizzas();
                                break;                    
                case 'E':    
                case 'e':    System.out.println("Eating a fraction of a pizza.");
                                //todo:pizza eating code here
                                eatSomePizza(foo);
                                break;
                case 'P':    
                case 'p':     System.out.println("Sorting pizzas by (P)rice");
                                //todo:
                                sortByPrice();
                                break;
                case 'S':    
                case 's':     System.out.println("Sorting pizzas by (S)ize");
                                 //todo:
                                sortBySize();
                                break;
                case 'C':    
                case 'c':      System.out.println("Sorting pizzas by (C)alories");
                                  //todo
                                sortByCalories();
                                break;
                case 'B':
                case 'b':    System.out.println("(B)inary search over pizzas by calories(int). " +
                        " Sorting first.  What calorie count are you looking for?");
                                //todo:
                                binarySearchByCalories(getNextInt());
                                break;
                case 'Q':
                case 'q':    System.out.println("(Q)uitting!" );
                                //todo:
                                run = false;
                                break;
                default:    System.out.println("Unrecognized input - try again");
            }
        }

    }

    /**
     * The eatSomePizza method allows users to remove a fraction of the pizza.
     *  */
    private void eatSomePizza(Scanner in) {

        //ask what index they want to eat
        System.out.println("What index is the pizza you want to eat, at?");
        int index = in.nextInt(); //catch next input int

        //prompt user input
        System.out.println("What fraction of pizza would you like to eat?");
        String frac = in.next(); //catch user input as string

        //user parse int to get numerator and denominator from string and make fraction
        String[]splitNum = frac.split("/");
        int n = Integer.parseInt(splitNum[0]);
        int d = Integer.parseInt(splitNum[1]);

        Pizza temp; // null

        //try-catch
        try{
            //set pizza temp to the objectat index specified
            temp = (Pizza) pizzaList.objectAt(index);

            //remove fraction that was specified by user
            temp.eatSomePizza(new Fraction(n, d));
            System.out.println("Eat " + frac + " of the pizza.");
            //print action

            if (temp.getRemaining().getNumerator() == 0){
                //if the remaining num is 0, remove the pizza from list
                System.out.println("Pizza is all gone!");
                pizzaList.remove(index); //remove
                numPizzas--; //decrement numpizzas
            } else {
                System.out.println("The remaining fraction of pizza is "+ temp.getRemaining());
                //print the remaining fraction
                System.out.println();
            }


        } catch (PizzaException e){ //if didn't work
            throw new PizzaException("Something broke with eatSomePizza");
            //throw exception error and break
        }
    }

    /**
     * This method uses a no-arg constructor in the Pizza
     * class to add a random pizza to the pizzaList
     * */
    private void addRandomPizza() {
        //todo:
        //new random pizza
        Pizza rand = new Pizza();
        //add it to the pizzalist
        pizzaList.insert(rand, numPizzas);
        //increment numpizzas
        numPizzas++;
    }

    /**
     * This method displays all pizzas and their details
     * in the console
     * */
    private void displayAllPizzas() {
        //todo:
        System.out.println(pizzaList.toString());
    }

    // SORTING BY PRICE (USE INSERTION SORT)
    //////////////////////////////////////////////////////////////
    /**
     * Sort the array by price of pizzas
     * (recursive quicksort method) -- did it all using the
     * same sort algorithm then reread and saw it had to be
     * specific (sorry)
     * */
    private void sortByPrice() {  
        //todo:
        sortByPrice2(0, pizzaList.size()-1);
    }

    /**
     * Second part for implementing the recursive
     * quickSort method.
     * */
    private void sortByPrice2(double start, double end) {

        double pivot = getMiddle(start, end); //pick a pivot using a getMiddle()

        //check the relationship between start and pivot
        if (start < pivot - 1) {
            sortByPrice2(start, pivot - 1);
        }

        if (end > pivot) {
            sortByPrice2(pivot, end);
        }

    }

    /**
     * Implemented using quicksort
     *
     * @param low = double
     * @param high = double
     */
    public double getMiddle(double low, double high) {
        //find the middle of the array
        double middle =
                ((Pizza) pizzaList.objectAt((int) low)) //Pizza object at index low
                        .getPrice().getMoney(),  //get the cost and get the Money obj that is equivalent
                first = low, last = high;


        //check cases
        while (first <= last) {

            //check another case
            while (((Pizza) pizzaList.objectAt((int) first)).getPrice()
                    .getMoney() < middle) {
                first++; //increment first
            }

            //check another case
            while (((Pizza) pizzaList.objectAt((int) last)).getPrice()
                    .getMoney() > middle) {
                last--; //decrement last
            }

            //check another case
            if (first <= last) {
                pizzaList.swap((int) first, (int) last);
                //swap in the pizzalist

                first++; //increment first
                last--; //decrement last
            }
        }
        return first;
    }

    //////////////////////////////////////////////////////////////

    // QUICKSORT BY SIZE (USE SELECTION SORT)
    //////////////////////////////////////////////////////////////
    /**
     * Sort by size -- selection sort implementation
     * */
    private void sortBySize() {
        //todo:
        Object temp;
        int n = pizzaList.size();

        // one by one move
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            // find the minimum element in the unsorted array
            for (int j = i + 1; j < n; j++) {
                 if (((Pizza) pizzaList.objectAt(j)).getRemainingArea() <
                         (((Pizza) pizzaList.objectAt(min_idx)).getRemainingArea())) {
                     min_idx = j;
                }
            }
            // I'm having a moment
//            temp = pizzaList.objectAt(i);
//            pizzaList.objectAt(min_idx) = pizzaList.objectAt(i);
//            pizzaList.objectAt(i) = temp;
        }
    }


    // SORTING CALORIES
    //////////////////////////////////////////////////////////////
    /**
     * Build a function that searches over pizzas using their calorie count:
     * public int binarySearchByCalories(int targetCal)
     * Be sure to call sortByCalories first
     * */
    private void sortByCalories() {
        //todo:
        calorieSort(0, pizzaList.size() - 1);
    }

    /**
     * second method in recursive quicksort
     *
     * @param low = double
     * @param high = double
     */
    public void calorieSort(double low, double high) {
        //pick pivot using the other method
        double middle = getMiddleCalorie(low, high);

        //check case
        if (low < middle - 1) {
            //recursive call
            calorieSort(low, middle - 1);
        }

        //check case
        if (high > middle) {
            //recursive call
            calorieSort(middle, high);
        }
    }

    /**
     * use this to get pivot for recursive quicksort for calories
     *
     * @param low = double
     * @param high = double
     * @return double
     */
    public double getMiddleCalorie(double low, double high) {
        //pivot
        double middle =
                ((Pizza) pizzaList.objectAt((int) low)).getCalories(),
                start = low, end = high;
        //initialize start and end

        //check relationships
        while (start <= end) {
            while (((Pizza) pizzaList.objectAt((int) start)).getCalories() < middle-1) {
                start++;// increment start
            }
            //check relationships
            while (((Pizza) pizzaList.objectAt((int) end)).getCalories() > middle) {
                end--; // decrement end

            }
            //check relationship
            if (start <= end) {
                pizzaList.swap((int) start, (int) end);

                //swap pizzalist objects
                start++;
                end--;
            }
        }
        return start; //return the starting point
    }

    /**
     * Binary search by calories
     * @param cals = int
     * */
    private int binarySearchByCalories(int cals) {
        //todo:
        sortByCalories();  //call quicksort to sort array first

        int low = 0;
        int hi = pizzaList.size() - 1;

        //pick start and end

        int middle;

        //check relationship
        while (low <= hi) {

            middle = (low + hi) / 2;
            //set middle

            //check relationships
            if (cals < (((Pizza) pizzaList.objectAt(middle)).getCalories())) {
                hi = (middle - 1); //reset hi
            }

            //check relationships
            else if (cals == (((Pizza) pizzaList.objectAt(middle)).getCalories())) {
                return middle;
                //return the middle if equal
            }

            //check relationships
            else if (cals > (((Pizza) pizzaList.objectAt(middle))
                    .getCalories())) {
                //reset low
                low = (middle + 1);
            }
        }
        //else case
        //exit and return error
        throw new PizzaException("No pizza found with " + cals + " calories!");
    }

    /**
     * This method adds one hundred pizzas to the arraylist
     * */
    public void addOneHundredPizzas() {
        System.out.println("Adding one hundred random pizzas to the ArrayList<Pizza>.");
        for (int i = 0; i < 99; i++) {
            addRandomPizza();
        }
    }

    /**
     * This method uses scanner to let the user choose a menu option.
     * */
    private char getNextChar() {
        char[] options = {'A','H','E','P','S','C','B','R','Q',
                'a', 'h', 'e', 'p', 's', 'c', 'b', 'r', 'q'
        };

        Scanner keyboard = new Scanner(System.in); // Used to take in users
        // input.
        String input = keyboard.next(); // Take in as string first.
        char selection = input.charAt(0); // Save first char.

        //check if the selection was a menu option
        for (char option : options) {
            if (option == selection) {
                //return if contained
                return selection;
            }
        }
        //else case; throw exception and break
        throw new PizzaException("Menu option not found");
    }

    /**
     * getNextInt uses the scanner to let user choose a calorie count they are looking for
     * in a list of sorted calories.
     *
     * @return int
     */
    protected int getNextInt() {
        //use scanner
        Scanner in = new Scanner(System.in);
        //catch next user input int

        //return input value
        return in.nextInt();
    }
    
    /**
     * No need to edit functions below this line, unless extending the menu or
     * changing the instructions
     */
    private static final String instructions = "-----------------------\n" +
            "Welcome to PizzaManager" +
            "\n-----------------------\n" +
            "(A)dd a random pizza\n" +
            "Add a (H)undred random pizzas\n" +
            "(E)at a fraction of a pizza" +
            "\nSort pizzas by (P)rice\n" +
            "Sort pizzas by (S)ize\n" +
            "Sort pizzas by (C)alories\n" +
            "(B)inary Search pizzas by calories\n" +
            "(Q)uit\n";

    /**
     * This method prints the instructions
     * */
    private void displayInstructions() {
        System.out.println(instructions);    
    }

    /**
     * Main starts the program
     * *notice the one line main (?)
     * */
    public static void main(String[] args) {
        new PizzaManager().start();
    }
}
