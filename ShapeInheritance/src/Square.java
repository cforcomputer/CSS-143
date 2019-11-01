import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
                               

class Square extends Shape  {

    private int sideLength;

    public Square(int a, int b) {
        super(a, b);   // we explicitly call a superclass constructor
                       //  that takes 2 ints, as in Shape, because we
                       //  get a compiler error otherwise.  However,
                       //  you should write a constructor that is able
                       //  to accept more info., such as the sideLength,
                       //  since you need this info. to draw a square.
    }

    //getSide:  Add this getter method

    //setSide:  Add this setter method

    public double getArea() {
        return sideLength * sideLength; 
    }

    public void draw(Graphics g) {
        g.fill3DRect(getX(), getY(), sideLength, sideLength, false);
   }
}
