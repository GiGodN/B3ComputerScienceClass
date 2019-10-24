package module1.GraphicsLabs;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class BigHouse extends Canvas {
	
	public Color gray = new Color(0x333333);
	
	private static final long serialVersionUID = 310417227430242327L;

	public BigHouse() // constructor - sets up the class
	{
		setSize(800, 600);
		setBackground(gray);
		setVisible(true);
	}

	public void paint(Graphics window) {
		bigHouse(window);
	}

	public void bigHouse(Graphics window) {
		window.setColor(Color.BLUE);
		window.drawString("BIG HOUSE ", 50, 50);

		window.fillRect(200, 200, 400, 400);
		
		window.setColor(Color.WHITE);
		window.fillRect(225, 300, 125, 125);
		window.fillRect(450, 300, 125, 125);
		
		window.setColor(Color.RED);
		window.fillRect(150, 150, 500, 100);
		
		window.setColor(Color.GREEN);
		window.fillRect(350, 430, 100, 175);
	}
}