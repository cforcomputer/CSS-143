import java.awt.Color;
import java.awt.Graphics;
import java.text.DecimalFormat;

/**
 * Square class is subclass of Shape and implements cloneable
 *
 * @author Patrick O'Brien
 * @version 12/4/2019
 */
public class Square extends Shape implements Cloneable {
    //instance vars
    private int x;
    private int y;
    private double sideLength;
    private Color myColor;


    /**
     * clonable method
     * @see Shape#clone()
     *
     * @return object
     */
    public Object clone() {
        try {
            return new Square(getX(), getY(), (int)getSideLength(), getColor());
        } catch (IllegalArgumentException e){
            throw new RuntimeException("Bad parameters");
        }
    }

    /**
     * getter method for area of object
     * @see Shape#getArea()
     */
    public double getArea() {
        return (getSideLength()*getSideLength());
    }

    /**
     * Constructor
     *
     * @param nx = int
     * @param ny = int
     * @param sl = int
     * @param c = Color object
     */
    public Square(int nx, int ny, int sl, Color c){
        super(nx, ny, c);
        setSideLength(sl);
    }


    /**
     * no arg constructor for square that uses
     * a random number for sidelength
     */
    public Square() {
        super();
        double val = Math.random()*20;
        setSideLength(val);
    }

    /**
     * draw method for graphics
     * @see Shape#draw(java.awt.Graphics)
     */
    @Override
    public void draw(Graphics g) {
        g.draw3DRect(getX(), getY(), (int)getSideLength(), (int)getSideLength(), true);
    }

    /**
     * setter for color of shape
     */
    @Override
    public void setColor(Color c){
        this.myColor = c;
    }

    /**
     * getter for color of shape
     */
    @Override
    public Color getColor(){
        return myColor;
    }

    /**
     * accessor method
     *
     * @return int
     */
    @Override
    public int getX(){
        return x;
    }

    /**
     * accessor method
     *
     * @return int
     */
    @Override
    public int getY(){
        return y;
    }

    /**
     * accessor method
     *
     * @return double
     */
    @Override
    public double getSideLength(){
        return this.sideLength;
    }


    /**
     * mutator method
     *
     * @param nx = int
     */
    @Override
    public void setX(int nx){
        this.x = nx;
    }

    /**
     * mutator method
     *
     * @param ny = int
     */
    @Override
    public void setY(int ny){
        this.y = ny;
    }

    /**
     * mutator method
     *
     * @param sl = int
     */
    public void setSideLength(double sl){
        this.sideLength = sl;
    }

    /**
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        return "square, " + df.format(getSideLength()) + "-inch";
    }

    /**
     * Getter method for radius
     * */
    @Override
    public double getRadius() {
        return getSideLength();
    }
}
