package module1.GraphicsLabs;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class BigHouse extends Canvas {
	
	private static final long serialVersionUID = 310417227430242327L;

	public BigHouse() // constructor - sets up the class
	{
		setSize(800, 600);
		setBackground(GraphicsRunner.gray);
		setVisible(true);
	}

	public void paint(Graphics window) {
		bigHouse(window);
	}

	public void bigHouse(Graphics window) {
		window.setColor(Color.BLUE);

		window.drawString("BIG HOUSE ", 50, 50);

		window.setColor(Color.BLUE);

		window.fillRect(200, 200, 400, 400);

	}
}