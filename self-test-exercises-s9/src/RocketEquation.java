import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RocketEquation {

    /**
     * Bring measurements from 50 stars
     * fuel is required to launch a given module
     * based on mass
     * SO: mass/3 rounded down - 2 = fuel
     *
     * Find the sum of the fuel requirements of all
     * modules on spacecraft
     * */
    public static void main(String[] args) throws FileNotFoundException {
        calculateFuel();
        System.out.println(sum);
    }

    private static int sum = 0;

    /**
     * Calculate fuel for day 1
     * */
    public static void calculateFuel() throws FileNotFoundException {
        File measureFile = new File("input.txt");
        Scanner in = new Scanner(measureFile);


        // Calculate fuel requirements and output to sum
        while (in.hasNextLine()) {
            int mass = 0;
            mass = in.nextInt();

            while (Math.floor(mass/3) - 2 > 0) {
                int temp; // holds smaller number
                temp = (int) Math.floor(mass / 3) - 2; // calculate the fuel for temp
                sum += temp; // add the new value to the total
                // calculate the smaller number
                temp = (int) Math.floor(temp / 3) - 2;
                mass = temp;
            }
        }
    }
}
