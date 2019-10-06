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
    // Q&A:
    // Q: Can you complete without using arrays?
    // A: Yes. You can process and compare each line as they are handled.
    //
    // Q: What is the least number of variables that you can use to solve this problem?
    // A:

    /**
     * Main method reads the file line by line and adds each line to an array.
     * 1. Take each value in each index of the array
     * 2. Split the string value into two variables - numerator and denominator
     * 3. Find the Greatest Common Divisor (GCD) of the values
     * 4. If there is a GCD --> Euclidean Algorithm
     *    whole = x/y; numerator x%y; denominator = y;
     * 5. Convert all numerators and denominators into their simplest forms
     * 6. Run through the array and check the new fractions for duplicates
     * 7. Record the number of times each fraction repeats, print to console
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
            // Declare the array that will hold information from text file
            String [] comparer = new String[arrayLength];
            Scanner fi = new Scanner(file);

            // Add the values to the array that has as many indexes as the text file has lines
            int count = 0;
            while (fi.hasNextLine()) {
                comparer[count] = fi.nextLine();
                count++;
            }
            // Call fractionCheck to check the fraction and test for duplicates
            for (int i = 0; i < comparer.length; i++) {
                fractionCheck(comparer, i);
            }

            String [] prev = new String[comparer.length];
            // Get the count for the total fraction duplicates --> then print the results
            for (int i = 0; i < comparer.length; i++) {
                    System.out.println(findDuplicates(comparer, i, prev));
            }
        } catch (FileNotFoundException e) { // Error handling for scanner
            e.printStackTrace();
        }
    }

    /**
     * @return the greatest common divisor for the fraction
     * This is the Euclidean algorithm for finding the greatest common divisor,
     * reducing a fraction into its simplest form.
     * @param numerator = the numerator of the fraction
     * @param denominator = the denominator of the fraction
     * */
    private static int GCD(int numerator, int denominator) {
        return denominator == 0 ? numerator : GCD(denominator, numerator % denominator);
    }

    /**
     * @return the total count for the number of duplicates for the @target fraction.
     * This method takes new array with values that have been converted to simplest form.
     * Each index is compared against every other index in the array to check for duplicates,
     * then the number of duplicates is returned with the current fraction (string) value
     * as a string with the intent to be printed.
     * @param array = The array that holds the fractions.txt fractions in simplest form.
     * @param target = The current index of the array from main method.
     * @param prev = The array that holds values previously compared by the method to stop repeat comparisons
     * */
    private static String findDuplicates(String[] array, int target, String[] prev) {
        for (String s : prev) {
            if (s == null) { // If it is the first call of method, array is empty, continue
                continue;
            }
            if (s.equals(array[target])) { // If the method has been compared before, stop the method
                return "";
            }
        }
        int duplicateCount = 0; // number of duplicate fractions
        for (int j = target; j < array.length; j++) {
            if (array[target].equals(array[j])) { // Check to see if the two strings are equal
                duplicateCount++;
            }
        }
        prev[target] = array[target]; // Add the previously checked array values to buffer (history) array.
        return array[target] + " has a count of " + duplicateCount;
    }
    /**
     * @return the results of the duplicate comparison in the form of a string to be printed.
     * This method runs through the array and checks for duplicates
     * @param array = The array that holds the contents from fractions.txt
     * @param target = The current index of the for loop in the main method.
     * */
    private static String fractionCheck(String[] array, int target) {
        String[] fraction = array[target].split("/");
        // Separate the numerator and denominator to calculate GCD using the Euclidean algorithm
        int numerator = Integer.parseInt(fraction[0]);
        int denominator = Integer.parseInt(fraction[1]);
        int gcd = GCD(numerator, denominator);  // Get the GCD for each fraction
        // Simplify the fraction
        numerator /= gcd;
        denominator /= gcd;
        // Replace the index value in the array with the simplified fraction.
        array[target] = numerator + "/" + denominator;

        return array[target];
    }
}
