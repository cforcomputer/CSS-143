import java.awt.Color;
import java.awt.Graphics;

/**
 * Find or create a the shape hierarchy from a previous
 * lab or homework.
 *
 * Your Shape superclass should manage x,y, colors, etc.
 * just as in the labs. See the Shape and PolyDemo lab or
 * Savitch text for more information
 *
 * --> should have two subclasses for managing Pizza Shapes:
 * Circle and Square
 *
 * @author Patrick O'Brien
 * @version 12/01/19
 * */

public abstract class Shape implements Cloneable {

    private int x= 0, y=0;
    private Color myColor;

    @Override
    public abstract Object clone();

    public Shape(){}

    public Shape(int nx, int ny, Color c){
        setX(nx);
        setY(ny);
        setColor(c);
    }

    public abstract double getSideLength();
    public abstract double getRadius();

    public Shape(Shape other) {
        setX(other.x);
        setY(other.y);
        setColor(other.myColor);
    }


    public void setColor(Color c){
        this.myColor = c;
    }

    public Color getColor(){
        return myColor;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public abstract void draw(Graphics g);

    public abstract double getArea();
}
