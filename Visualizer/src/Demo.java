import java.awt.Font;

/**
 * This class demonstrates how to do some very simple animation.  It creates
 * two instances of SquareWithText, and moves them vertically and then
 * horizontally.
 */
public class Demo 
{
	public static void main(String[] args) 
	{
		// For the demo, we'll let both x and y
		// range between 0-1000
		StdDraw.setXscale(0, 1000);
		StdDraw.setYscale(0, 1000);
		
		// This is how you choose the font.
		StdDraw.setFont(new Font("SansSerif", Font.BOLD, 20));
		
		// Create two instances of our own SquareWithText class.  We made
		// a draw method on SquareWithText, which demonstrates more StdDraw methods.
		SquareWithText box1 = new SquareWithText(100, 100, 100, "1");
		SquareWithText box2 = new SquareWithText(800, 800, 100, "2");
		
		// This loop animates both instances moving vertically
		for (int step = 0; step <= 50; step++)
		{
			StdDraw.clear();
			
			// This calls methods on the SquareWithText class to change
			// its center y-coordinate by 10 pixels
			box1.setY(box1.getY() + 10);		// Go UP
			box2.setY(box2.getY() - 10);		// Go DOWN
			
			// Have the boxes draw themselves in their new locations
			box1.draw();
			box2.draw();
			
			// Display everything we drew in the off-screen buffer into the
			// window at once
			StdDraw.show(20);
		}
		
		// This loop animates both instances moving horizontally
		for (int step = 0; step <= 50; step++)
		{
			StdDraw.clear();
			
			box1.setX(box1.getX() + 10);	// Go RIGHT
			box2.setX(box2.getX() - 10);	// Go LEFT
			
			box1.draw();
			box2.draw();
			
			StdDraw.show(20);
		}
	}
}
