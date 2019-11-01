import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * Circle is a child class of the Shape class, it builds on the Shape
 * functionality to create a new Shape to display - random sizes
 * are generated using the PolyDemo class.
 *
 * Lab circle class modified
 * @author Patrick O'Brien
 * @version 10/30/2019
 * */

public class Circle extends Shape {

    private double radius;
    private Color colorOne;
    private Color colorTwo;
    private boolean circleType;

    /**
     * The constructor for Circle
     * uses super() to access parent class constructor - Shape
     * Initializes additional variables applicable to Circles
     *
     * @param fx = the new x value
     * @param fy = the new y value
     * @param r = the radius value
     * @param one = the first Color object
     * @param two = the second Color object
     * @param type = the string value that defines whether the circle is half or full (two colors)
     * */
    public Circle(int fx, int fy, int r, Color one, Color two, boolean type) {
        super(fx, fy);
        // using setter methods to avoid potential privacy leaks
        setRadius(r);
        setColor(one, two);
        setCircleType(type);
    }

    /**
     * Getter method for the circle radius
     * @return the value of the circle's radius
     * */
    public double getRadius() {
        return radius;
    }

    /**
     * Getter method for the circle area
     * "Override the getArea() method: This method should return a double
     * corresponding to the area of your shape.  If your shape is too complex
     * such the area is too difficult to calculate or is not well-defined,
     * you don't have to override this method."
     *
     * @return The circle's area
     * */
    @Override
    public double getArea() {
        return (Math.PI*(radius * radius));
    }

    /**
     * Setter method for the circle radius
     * @param r = radius of the circle
     * */
    public void setRadius(int r) {
        this.radius = r;
    }

    /**
     * Setter method for the Color object
     * @param one = first Color object
     * @param two = second Color object
     * */
    public void setColor(Color one, Color two) {
        // top half == half circle
        // or full circle
        this.colorOne = one;

        // bottom half == half circle
        this.colorTwo = two;
    }

    /**
     * Setter method for the string input deciding if circle is half or full
     * */
    public void setCircleType(boolean type) {
        this.circleType = type;
    }

    /**
     * This method overrides the Shape class draw
     * "Override the draw() method: This method will draw the shape onto the Graphics
     * context g (or g2D). Look at Spray for an example of how to do this, or try:
     *
     *     g.draw3DRect(x,y,width,height, raised)
     *     g.drawOval(x,y,width,height)
     * @param g = the Graphics object input
     */

    @Override
    public void draw(Graphics g) {

        if (!circleType) { // if half circle is specified
            Graphics2D g1 = (Graphics2D) g;

            g1.setColor(colorOne); // set color one

            // draws & fills object with set color
            g1.fillOval(getX(), getY(), (int)getRadius(), (int)getRadius());

            g1.setColor(colorTwo); // set color two

            // draws and fills second with color
            g1.setClip(getX(), getY(), (int)getRadius(), (int)(getRadius() / 1.7));

            g1.fillOval(getX(), getY(), (int)getRadius(), (int)getRadius());

        } else { // if circle == full

            Graphics2D g2 = (Graphics2D) g; // sets Graphics2D object to input

            g2.setColor(colorOne); // set to colorOne

            // draws and fills the object with the currently set color at x and y
            g2.fillOval(getX(), getY(), (int)getRadius(), (int)getRadius());
        }
    }
}
