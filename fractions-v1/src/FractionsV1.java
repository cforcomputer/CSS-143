import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Patrick O'Brien
 * @version 1.0
 * @since 2019-10-04
 * Fractions V1 Project
 * */
public class FractionsV1 {

    /**
     * Main method reads the file line by line and adds each line to an array.
     *
     * */
    public static void main(String[] args) {
        File file = new File("fractions.txt");
        // Try/catch to handle the Scanner file reader (mandatory)
        try{
            Scanner reader = new Scanner(file);
            int arrayLength = 0;

            // Find arrayLength by running through every line in fractions.txt to collect the number of lines.
            while (reader.hasNextLine()) {
                arrayLength++;
                reader.nextLine();
            }

            // Declare the array to compare values
            String [] comparer = new String[arrayLength];
            Scanner fi = new Scanner(file);

            // Add the values to the array
            int count = 0;
            while (fi.hasNextLine()) {
                comparer[count] = fi.nextLine();
                count++;
            }
            // Check for equal strings while ignoring the comparison against self
            int equal = 0;
            int print = 0;
            for (int i = 0; i < comparer.length; i++) {
                for (int j=i+1; j < comparer.length; j++) {
                    // Check if the two strings are equal
                    if (comparer[i].equals(comparer[j])) {
                        equal++;
                    }
                }
                if (i == comparer.length - 1) {
                    // Print how many are equal for comparer[i]
                    System.out.println(comparer[print] + " has a count of " + equal);
                    equal = 0;
                    print++;
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
