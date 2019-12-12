import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.text.DecimalFormat;

/**
 * This Circle class is a child class of parent class Shape
 * The constructor uses
 *
 * @author Patrick O'Brien
 * @version 12/6/2019
 */
public class Circle extends Shape implements Cloneable {

    private double radius;
    private Color myColor;

    /**
     * Constructor
     * Utilizes the super class constructor (Shape)
     * And uses more variables that are specific to Circles
     *
     * @param nx = int
     * @param ny = int
     * @param r = double
     * @param c = Color object
     */
    public Circle(int nx, int ny, double r, Color c){
        super(nx, ny, c); //uses Shape constructor
        setRadius(r);
    }

    public Circle() {
        super();
        double val = Math.random() * 10;
        setRadius(val);
    }


    /**
     * clonable interface
     *
     * @see Shape#clone()
     */
    @Override
    public Object clone() {
        try {
            return new Circle(getX(), getY(), getRadius(), getColor());
        } catch (IllegalArgumentException e){
            throw new RuntimeException("Bad parameters");
        }
    }


    /**
     * gets the area of shape
     *
     * @see Shape#getArea()
     * @return double
     */
    @Override
    public double getArea() {
        return (Math.PI*(radius*radius));
    }

    /**
     * setter method for Color object
     *
     * @param c = color object
     */
    @Override
    public void setColor (Color c){
        this.myColor = c;
    }


    /**
     * This method overrides the Shape class draw method
     *
     * (non-Javadoc)
     * @see Shape#draw(java.awt.Graphics)
     */
    @Override
    public void draw(Graphics g) {

        Graphics2D g2d = (Graphics2D) g; //new Graphics2D object set to input Graphics g

        g2d.setColor(myColor); //sets color to first color

        g2d.fillOval(getX(), getY(), (int)getRadius(), (int)getRadius());
        //draws and fills the object with setcolor, starting at (x,y) and using the radius to create size of circle

    }

    /**
     * getter method
     *
     * @return double
     */
    @Override
    public double getRadius(){
        return (this.radius);
    }



    /**
     * setter method
     *
     * @param r = double
     */
    public void setRadius(double r){
        this.radius = r;
    }

    /**
     * tostring puts everything in a string to be printed
     *
     * @see java.lang.Object#toString()
     * @return string
     */
    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        return "circular, " + df.format(getRadius()*2) + "-inch";
    }

    /**
     * getsidelength returns sidelength of shape
     *
     * @see Shape#getSideLength()
     *
     * @return double
     */
    @Override
    public double getSideLength() {
        // TODO Auto-generated method stub
        return getRadius()*2;
    }
}
