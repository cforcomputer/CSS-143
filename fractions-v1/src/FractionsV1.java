import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
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
    private static int count = 0;
    public static void main(String[] args)
    {
        File file = new File("fractions.txt");
        int i = 0;
        try {
            Scanner sc = new Scanner(file);
            // run through the fractions.txt to find the size of array to declare
            while (sc.hasNextLine())
            {
                // line is the current line of fractions.txt
                count++;
                sc.nextLine();
            }
            sc.reset();
            // Declare the array to store all values of the fractions.txt
            String [] array = new String[count];
            while (sc.hasNextLine())
            {
                array[i] = sc.nextLine();
                i++;
                System.out.println(i);
            }
            System.out.println(Arrays.toString(array));
            // Call counter to split the array and return an array of calculated values.
            // counter(array);
        }
        // Catch the error if the file does not exist
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
    /**
     * counter is a method that takes the array as an input, splits them, and then divides every other number
     * by the number below it.
     * */
//    private static void counter(String[] array)
//    {
//
//        String[] array2 = array.split("/");
//        System.out.println(Arrays.toString(array2));
//    }
}
