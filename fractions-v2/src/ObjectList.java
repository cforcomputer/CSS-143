import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Patrick O'Brien
 * @version 1.0
 *
 * This method creates the ObjectList to store the results from each result from the
 * driver class.
 * */
public class ObjectList {
    private int idx = 0;

    /**
     * Method counts the number of lines of the input file and makes sure that the ObjectList always has enough space to
     * start
     * */
//    private int lineCounter() {
//        File file = new File("fractions.txt"); // point to fractions.txt file
//        int lineCounter = 0;
//        try {
//            Scanner reader = new Scanner(file);
//            // Find arrayLength by running through every line in fractions.txt to collect the number of lines. O(N)
//            while (reader.hasNextLine()) {
//                lineCounter++;
//                reader.nextLine();
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        return lineCounter;
//    }
    private FractionCounter[] fList = new FractionCounter[150]; // Declare a new fList

    FractionCounter getValue(int index)
    {
        return fList[index];
    }

    /**
     * Adds items to the ObjectList
     * @param fracString = the string containing the result of the calculation and the count, to be added to the
     * ObjectList at idx (index).
     *
     */
    void addFraction(FractionCounter fracString)
    {
        fList[idx++] = fracString;
    }

    /**
     * @return returns the current index of the ObjectList fList
     * */
    int length()
    {
        return idx;
    }

    /**
     * Increments through the fList, building a string to print
     * @return the string containing all the contents of the fList ObjectList
     * */
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < idx; i++)
        {
            builder.append(fList[i]).append("\n"); // Add each element to the array and add a space between them
        }
        return builder.toString();
    }
}
