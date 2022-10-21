import java.awt.Color;

public class SquareWithText 
{
	// The x-coordinate of the CENTER of this box
	private double x;
	
	// The y-coordinate of the CENTER of this box
	private double y;
	
	// The length of the square
	private double length;
	
	// The text to display inside this box
	private String text;
	
	/**
	 * Creates a new instance of SquareWithText
	 * @param xP The x-coordinate of the CENTER of this box
	 * @param yP The y-coordinate of the CENTER of this box
	 * @param lengthP The length of the square
	 * @param textP The text to display inside this box
	 */
	public SquareWithText(double xP, double yP, double lengthP, String textP)
	{
		x = xP;
		y = yP;
		length = lengthP;
		text = textP;
		draw();
	}
	
	/**
	 * Returns the current x-coordinate of this box.
	 * @return the current x-coordinate of this box.
	 */
	public double getX()
	{
		return x;
	}
	
	/**
	 * Returns the current y-coordinate of this box.
	 * @return the current y-coordinate of this box.
	 */
	public double getY()
	{
		return y;
	}
	
	/** 
	 * Changes the current x-coordinate of this box. 
	 * @param xP The new x-coordinate
	 */
	public void setX(double xP)
	{
		x = xP;
	}
	
	/** 
	 * Changes the current y-coordinate of this box. 
	 * @param yP The new x-coordinate
	 */
	public void setY(double yP)
	{
		y = yP;
	}
	
	/**
	 * Draws the box and its text centered at the current x- and y-coordinates.
	 */
	public void draw()
	{
		// This picks the color to use for the next call(s) to StdDraw
		StdDraw.setPenColor(Color.BLACK);
		
		// This chooses the thickness of the pen used for the next
		// call(s) to StdDraw.
		StdDraw.setPenRadius(0.002);
		
		// This draws a square.  WEIRD: The x and y parameters determine the
		// CENTER of the square (not its corner), and the third parameter is
		// the "radius" of the square, which is half of its length
		StdDraw.square(x, y, length / 2);
		
		// Prints the text for this SquareWithText instance in the center.  As
		// before, the x and y parameters determine the CENTER of the text, not
		// the left corner.
		StdDraw.text(x, y, text);
	}
}
