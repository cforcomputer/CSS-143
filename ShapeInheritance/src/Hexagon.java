import java.awt.*;

/**
 * Hexagon class that extends the functionality from the Shape class
 * Draws Hexagons when called from PolyDemo
 * @author Patrick O'Brien
 * @version 10/30/2019
 * */

public class Hexagon extends Shape{

    // Hexagon variables
    private int side;
    private Color hexColor;

    /**
     * This is the constructor for Hexagon that
     * uses the constructor from the parent class (super)
     * sets variables specific to the Hexagon class
     * */
    public Hexagon(int fx, int fy, int sl, Color c) {
        super(fx, fy);
        setSide(sl);
        setColor(c);
    }

    /**
     * The setter method for the side length
     * @param sl = the side length
     * */
    public void setSide(int sl) {
        this.side = sl;
    }

    /**
     * the getter method for the side length
     * @return the hexagon's side length
     * */
    public int getSide() {
        return side;
    }

    /**
     * The setter method for color
     * */
    public void setColor(Color c) {
        this.hexColor = c;
    }

    /**
     * This method overrides the parent class draw method to
     * draw the Hexagon.
     *
     * @param g = the Graphics object input
     * */
    @Override
    public void draw(Graphics g) {
        // get g to be the new Graphics2D
        Graphics2D g1 = (Graphics2D) g;

        // create an int array to hold the x values of the hexagon
        // x values are mapped out on a coordinate plane - terms point x
        // and sideLength variable
        int[] xVal = { getX(), getX() + getSide(),
                getX() + getSide() + (getSide() / 2),
                getX() + getSide(), getX(), getX() - (getSide() / 2)};

        // create an int array to hold the hexagon y values
        int[] yVal = {getY(), getY(), getY() + getSide(), getY() + (2 * getSide()),
        getY() + (2 * getSide()), getY() + getSide()};

        g1.setColor(hexColor); // set hexagon color
        g1.fillPolygon(xVal, yVal, 6); // draw and fill hexagon - 6 = number of points
    }
}
