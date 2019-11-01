import java.awt.*;

/**
 * Triangle class, a child class of the Shape class
 * Extends on the functionality of Shape to generate triangles
 *
 * @author Patrick O'Brien
 * @version 10/30/2019
 * */
public class Triangle extends Shape {
    private int side;
    private Color myColor;

    /**
     * A constructor that references the constructor in parent class (Shape)
     * using super.
     * @param fx = new x value
     * @param fy = new y value
     * @param sl = new side length value
     * @param c = new color value
     * */
    public Triangle(int fx, int fy, int sl, Color c) {
        super(fx, fy); // super reference

        setSide(sl);
        setColor(c);
    }

    /**
     * Method to override the parent class draw method
     * and draw the triangle
     * @param g = the Graphics object input
     * */
    @Override
    public void draw(Graphics g) {
        // get g to be the new Graphics2D
        Graphics2D g1 = (Graphics2D) g;

        // create an int array to hold the x values for the triangle
        int[] xVal = {getX(), (getX() + (getSide()/2)), getX() + getSide()};

        // create an int array to hold the y values for the triangle
        int[] yVal = {getY(), (getY() - getSide()), getY()};

        g1.setColor(myColor); // sets triangle color
        // draw and fill polygon, 3 = numberOfPoints
        g1.fillPolygon(xVal, yVal, 3);
    }

    /**
     * Getter method for the side length
     * @return the triangle's side length
     * */
    public int getSide() {
        return side;
    }

    /**
     * Setter method for sideLength
     * @param sl = the side length
     * */
    public void setSide(int sl) {
        this.side = sl;
    }

    /**
     * Setter method for the color val
     * */
    public void setColor(Color c) {
        this.myColor = c;
    }

}
