import javax.swing.*;
import java.awt.*;

/**
 * Class PolyDemo (is a JFrame) and PolyDemoPanel (is a JPanel)
 * 
 * Author: Rob Nash Edits by Patrick O'Brien
 * @version 10/30/2019
 */


class PolyDemo extends JFrame {
	
	/**
	 * This method is the PolyDemo constructor that assigns window size,
	 * visibility, and what happens when the window is closed.
	 * */
	public PolyDemo() {
		getContentPane().add( new PolyDemoPanel() );
		//just some windowing stuff that must happen for all Frames
		setSize( 300,300 );
		setVisible( true );
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}
	
	/**
	 * The main method of the class, creates a new PolyDemo
	 * object that is assigned to myApp
	 *
	 * Edits:
	 * The main has been modified to also create a Pokeball window
	 * */
	public static void main( String args[] ) {
		PolyDemo myApp = new PolyDemo();
		Pokeball ball = new Pokeball();
	}
	
	
	/** this is our first "inner" or internal class
	 *the purpose of this class is solely to support the JFrame class above,
	 * and I don't want it reused in arbitrary contexts, so by nesting this class here
	 * I can indicate the intent a bit more clearly that this class "goes with" the class above it
	 * In general, each class is a separate entity that should be contained in a separate file
	**/
	 public class PolyDemoPanel extends JPanel {
		Shape[] myShapes= new Shape[20];
		
		public PolyDemoPanel() {
			//Shape a = new Shape( getRandInt(), getRandInt());
			//Shape b = new Circle( getRandInt(), getRandInt(), getRandInt() );
		
			//a = new Square(getRandInt(), getRandInt(), getRandInt(), getRandInt() );
		
			//a = getRandShape();

			//( (Circle) b ).getRadius();
		
		
			/*********************************************************************************************************************
			* Code for populating our myShapes changes minimally when new classes are introduced (only in getRandShape())
			*********************************************************************************************************************/
			for( int i = 0; i < 20; i++ ) {
				myShapes[i] =  getRandShape();
			}
		}
		
		/*********************************************************************************************************************
		 * Code for drawing our shapes doesn't change at all! Since we intended to take advantage of polymorphism, we coded 
		 * this "in general" with respect to the superclass, and not specific to any subclass.
		 *********************************************************************************************************************/
		/**
		 * Paint method Overrides the paint method in the jComponent.java
		 * to draw a custom shape given by the Graphics object input param (g)
		 * @param g = Graphics object input
		 * */
		@Override
		public void paint( Graphics g ) {
			super.paint(g);  //don't remove - required for GUI widgets to draw correctly
			/************************
			 * Late Binding Demo
			 ************************/
			for( int i = 0; i < myShapes.length; i++ ){
				//which draw method is invoked here? There are many forms of the method (polymorphic), so which is chosen?
				//Java has RTTI about every object, and it uses this info to choose the correct method to invoke!
				myShapes[i].draw( g );	
			}	
		}
			
		/**
		 * This method getRandInt returns a random integer within the range of 200
		 * */
		public int getRandInt() {
			return ( (int) ( Math.random() * 200 ) );	
		}

		/**
		 * This method getRandShape assigns two random integer values to x and y variables
		 * It has been edited so that the newly created shapes for the HW assignment
		 * are created.
		 *
		 * Edits:
		 * Edited so that it only contains 3 Shapes in the switch
		 * the 4th shape is generated inside its own window, which stacked on
		 * top of the PolyDemo window at the start of the program.
		 * */
		public Shape getRandShape() {
			Shape retVal = null;
			final int x = getRandInt();
			final int y = getRandInt();
			
			
			/********************************
			 * Polymorphic extensibility demo
			 *
			 *******************************/
			switch( ( int )(Math.random() * 3) ) {
				// new random circle
				case 0: 	retVal = new Circle(getRandInt(), getRandInt(), getRandInt(), Color.RED, Color.BLACK, true);
							break;
				// new random triangle
				case 1: 	retVal = new Triangle(getRandInt(), getRandInt(), getRandInt(), Color.BLUE);
							break;
				// new random hexagon
				case 2: 	retVal = new Hexagon(getRandInt()/2, getRandInt()/2, getRandInt()/2, Color.GREEN);
							break;
				// object 4 is Pokeball, which has its own window.
			}
		
			return retVal;
		}
	}	
	
}











