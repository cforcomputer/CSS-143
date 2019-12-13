import javax.swing.*;
import java.awt.*;

/**
 * This class is a (driver) class that inherits JFrame
 * JFrame class is a type of container that itself inherits
 * from from the java.awt.Frame class. Jframe works like the
 * main window where components such as labels, buttons,
 * and text fields are added to create an interactive GUI.
 *
 * @author Patrick O'Brien
 * @version 10/31/2019
 * */

public class Pokeball extends JFrame {

    /**
     * The default constructor for the Pokeball class
     * Creates a new JFrame window for the Pokeball to display inside.
     * */
    public Pokeball() {
        // sets window for all frames
        getContentPane().add(new PokeballPanel());
        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    /**
     * Nested class inheriting jPanel
     * Creates a new Pokeball inside the JFrame
     * */
    public static class PokeballPanel extends JPanel {

        Shape[] shapes = new Shape[20]; // create a shape array
        int idx = 0; // the index counter

        /**
         * Pokeball constructor where shapes are created and added to array
         * */
        public PokeballPanel() {
            // Create the background ball
            Shape ball = new Circle(120, 100,100, Color.WHITE, Color.RED, false);
            shapes[idx++] = ball; // assign to next index in array

            // Create the white bottom portion of the pokeball
            Shape button = new Circle(160, 140, 20, Color.WHITE, Color.WHITE, true);
            shapes[idx++] = button; // assign to next index in array

            // Creates the black center dote in the pokeball
            Shape buttonTwo = new Circle(164, 143, 13, Color.BLACK, Color.BLACK, true);
            shapes[idx++] = buttonTwo; // assign to next index in array
        }

        /**
         * The method paint draws the shapes stored in the array using a Graphics object
         * @param g = Graphics object input
         * */
        @Override
        public void paint(Graphics g) {
            super.paint(g); // required for widgets to draw

            for(int i = 0; i < idx; i++) { //iterate through shapes in array
                shapes[i].draw(g); // draw shape at each index
            }
        }
    }
}
