package module1.GraphicsLabs;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class SmileyFace extends Canvas {
	
	private static final long serialVersionUID = 4156460185971353879L;
	

	public SmileyFace() // constructor - sets up the class
	{
		setSize(800, 600);
		setBackground(GraphicsRunner.gray);
		setVisible(true);
	}

	public void paint(Graphics window) {
		smileyFace(window);
	}

	public void smileyFace(Graphics window) {
		window.setColor(Color.BLUE);
		window.drawString("SMILEY FACE LAB ", 35, 35);

		window.setColor(Color.YELLOW);
		window.fillOval(210, 100, 400, 400);

		window.setColor(Color.BLUE);
		window.fillOval(300, 200, 75, 50);
		window.fillOval(450, 200, 75, 50);
		
		window.setColor(Color.RED);
		window.fillOval(405, 300, 20, 20);
		window.drawArc(340, 325, 150, 100, 0, -180);

	}
}