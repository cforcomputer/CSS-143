import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Patrick O'Brien
 * @version 1.0
 *
 * This is the driver class that initiates and calls the methods for processing
 * calculations. Variables are stored here
 * */
public class Driver {
    /**
     * Main driver method for the class
     * ObjectList instance is created and then used to the input fractions.
     * The scanner takes the file and reads it line by line
     */

    public static void main(String[] args) {
        File file = new File("fractions.txt"); // point to fractions.txt file
        ObjectList list = new ObjectList();

        try {
            Scanner reader = new Scanner(file);
            int index = 0;

            while (reader.hasNextLine())   // while there are still lines in the file
            {
                int numerator, denominator;
                double d_numerator, d_denominator;
                String fractionsTxt = reader.nextLine();
                String[] splitFrac = fractionsTxt.split("/");

                // check to see if an int
                if (isInteger(splitFrac[0]) && isInteger(splitFrac[1]))
                {
                    numerator = Integer.parseInt(splitFrac[0]);
                    denominator = Integer.parseInt(splitFrac[1]);
                    Fraction createFraction = new Fraction(numerator, denominator);
                }
                else if (isInteger(splitFrac[0]) && !(isInteger(splitFrac[1])))
                {
                    numerator = Integer.parseInt(splitFrac[0]);
                    d_denominator = Double.parseDouble(splitFrac[1]);
                    Fraction createFraction = new Fraction(numerator, d_denominator);
                }
                else if (!(isInteger(splitFrac[0])) && (isInteger(splitFrac[1])))
                {
                    d_numerator = Double.parseDouble(splitFrac[0]);
                    denominator = Integer.parseInt(splitFrac[1]);
                    Fraction createFraction = new Fraction(d_numerator, denominator);
                }
                else // both are doubles
                {
                    d_numerator = Double.parseDouble(splitFrac[0]);
                    d_denominator = Double.parseDouble(splitFrac[1]);
                    Fraction createFraction = new Fraction(d_numerator, d_denominator);
                }

                if (index == 0) {
                    FractionCounter newCount = new FractionCounter(createFraction);
                    list.addFraction(newCount);
                    index++;
                } else {
                    boolean counted = false;
                    for (int i = 0; i < list.length(); i++) {
                        FractionCounter currentCount = list.getValue(i);

                        if (currentCount.compareAndIncrement((createFraction))) {
                            counted = true;
                            break;
                        }
                    }
                    if (!counted) {
                        FractionCounter newCurrentCount = new FractionCounter(createFraction);
                        list.addFraction(newCurrentCount);
                    }
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(list.toString());
    }

    /**
     * HAHAHA
     * Sorry
     * */
    private static boolean isInteger(String s)
    {
        try {
            Integer.parseInt(s);
        } catch(NumberFormatException e) {
            return false;
        } catch(NullPointerException e) {
            return false;
        }
        // only got here if we didn't return false
        return true;
    }
}

