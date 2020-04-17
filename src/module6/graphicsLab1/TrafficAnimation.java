package module6.graphicsLab1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * CS 121 Project 1: Traffic Animation
 *
 * Animates a [put your description here]
 *
 * @author BSU CS 121 Instructors
 * @author Noah John
 */
@SuppressWarnings("serial")
public class TrafficAnimation extends JPanel
{
	// This is where you declare constants and variables that need to keep their
	// values between calls	to paintComponent(). Any other variables should be
	// declared locally, in the method where they are used.

	/**
	 * A constant to regulate the frequency of Timer events.
	 * Note: 100ms is 10 frames per second - you should not need
	 * a faster refresh rate than this
	 */
	private final int DELAY = 100; //milliseconds

	/**
	 * The anchor coordinate for drawing / animating. All of your vehicle's
	 * coordinates should be relative to this offset value.
	 */
	private int xOffset = 0;
	private int red = 0;
	private int green = 0;
	private int blue = 0;

	/**
	 * The number of pixels added to xOffset each time paintComponent() is called.
	 */
	private int stepSize = 10;

	private final Color BACKGROUND_COLOR = new Color(10, 145, 46);

	/* This method draws on the panel's Graphics context.
	 * This is where the majority of your work will be.
	 *
	 * (non-Javadoc)
	 * @see java.awt.Container#paint(java.awt.Graphics)
	 */
	public void paintComponent(Graphics g)
	{
		// Get the current width and height of the window.
		int width = getWidth(); // panel width
		int height = getHeight(); // panel height

		// Fill the graphics page with the background color.
		int roadHeight = height/3;
		g.setColor(BACKGROUND_COLOR);
		g.fillRect(0, 0, width, height);
		g.setColor(Color.black);
		g.fillRect(0, roadHeight-(roadHeight/3), width, (int) (roadHeight+(roadHeight/1.5)));

		// Calculate the new xOffset position of the moving object.
		xOffset  = (xOffset + stepSize) % (width + 300);

		// TODO: Use width, height, and xOffset to draw your scalable objects
		// at their new positions on the screen

		// This draws a green square. Replace it with your own object.
		int squareSide = height / 8;
		int middleY = height / 2;
		int squareOffset = height / 6;
		
		g.setColor(new Color(234, 255, 0));
		g.fillRect(0, middleY-middleY/12-height/52, width, height/36);
		g.fillRect(0, middleY+middleY/12-height/52, width, height/36);
		
		g.setColor(Color.green);
		g.fillRect(xOffset-squareSide+3, middleY-squareOffset-squareSide/2, squareSide, squareSide);
		g.fillRect(width-(xOffset-squareSide+3), middleY+squareOffset-squareSide/2, squareSide, squareSide);
		
		if(red < 250) {
			red += 5;
		}
		else {
			red = 0;
		}
		
		if(green < 248) {
			green += 7;
		}
		else {
			green = 0;
		}
		
		if(blue < 253) {
			blue += 2;
		}
		g.setColor(new Color(red, green, blue));
		g.fillOval(xOffset-squareSide, middleY-squareOffset+squareSide/2-squareSide/6, squareSide/3, squareSide/3);
		g.fillOval(xOffset-squareSide/6, middleY-squareOffset+squareSide/2-squareSide/6, squareSide/3, squareSide/3);
		g.fillOval(width-(xOffset-squareSide+squareSide/6), middleY+squareOffset+squareSide/2-squareSide/6, squareSide/3, squareSide/3);
		g.fillOval(width-(xOffset-squareSide*2+squareSide/6), middleY+squareOffset+squareSide/2-squareSide/6, squareSide/3, squareSide/3);
		
		g.drawString("Zooe mama", width/2 - 30, height/8);
		
		g.setColor(Color.gray);
		g.fillRect(width/2-(width/16), height-(width/8), width/8, width/8);
		
		g.setColor(Color.black);
		g.fillRect(width/2-(width/25)-width/80, height-(width/8)+10, width/40, width/20);
		g.fillRect(width/2+(width/25)-width/80, height-(width/8)+10, width/40, width/20);
		
		g.drawString("Yes I am Human", width/2+(width/16)+5, height-(width/16));
		
		// Put your code above this line. This makes the drawing smoother.
		Toolkit.getDefaultToolkit().sync();
	}


	//==============================================================
	// You don't need to modify anything beyond this point.
	//==============================================================


	/**
	 * Starting point for this program. Your code will not go in the
	 * main method for this program. It will go in the paintComponent
	 * method above.
	 *
	 * DO NOT MODIFY this method!
	 *
	 * @param args unused
	 */
	public static void main (String[] args)
	{
		// DO NOT MODIFY THIS CODE.
		JFrame frame = new JFrame ("Traffic Animation");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new TrafficAnimation());
		frame.pack();
		frame.setVisible(true);
	}

	/**
	 * Constructor for the display panel initializes necessary variables.
	 * Only called once, when the program first begins. This method also
	 * sets up a Timer that will call paint() with frequency specified by
	 * the DELAY constant.
	 */
	public TrafficAnimation()
	{
		// Do not initialize larger than 800x600. I won't be able to
		// grade your project if you do.
		int initWidth = 600;
		int initHeight = 400;
		setPreferredSize(new Dimension(initWidth, initHeight));
		this.setDoubleBuffered(true);

		//Start the animation - DO NOT REMOVE
		startAnimation();
	}

	/**
	 * Create an animation thread that runs periodically.
	 * DO NOT MODIFY this method!
	 */
	private void startAnimation()
	{
		ActionListener timerListener = new TimerListener();
		Timer timer = new Timer(DELAY, timerListener);
		timer.start();
	}

	/**
	 * Repaints the graphics panel every time the timer fires.
	 * DO NOT MODIFY this class!
	 */
	private class TimerListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			repaint();
		}
	}
}