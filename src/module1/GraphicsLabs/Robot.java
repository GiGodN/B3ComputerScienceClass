package module1.GraphicsLabs;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas {
	
	public static Color gray = new Color(0x333333);
	
	private static final long serialVersionUID = 1524645181916148474L;

	public Robot() {
		setSize(800, 600);
		setBackground(gray);
		setVisible(true);
	}

	public void paint(Graphics window) {
		window.setColor(Color.BLUE);

		window.drawString("Robot LAB ", 35, 35);

		head(window);
		upperBody(window);
		lowerBody(window);

	}

	public void head(Graphics window) {
		
		window.setColor(Color.YELLOW);
		window.fillOval(300, 100, 200, 100);
		
		window.setColor(Color.LIGHT_GRAY);
		window.fillOval(350, 115, 25, 25);
		window.fillOval(425, 115, 25, 25);
		
		window.setColor(Color.BLACK);
		window.fillOval(390, 150, 25, 15);
		
		window.setColor(Color.GREEN);
		window.drawArc(350, 115, 100, 75, -30, -120);

	}

	public void upperBody(Graphics window) {

		window.setColor(Color.BLUE);
		window.fillRect(300, 225, 200, 100);
		
		window.setColor(Color.WHITE);
		window.drawRect(300, 225, 200, 100);
		
		window.drawLine(300, 225, 200, 125);
		window.drawLine(500, 225, 600, 125);
	}

	public void lowerBody(Graphics window) {

		window.setColor(Color.RED);
		
		window.fillRect(300, 350, 200, 100);
		
		window.setColor(Color.WHITE);
		window.drawRect(300, 350, 200, 100);
		
		window.drawLine(300, 450, 200, 550);
		window.drawLine(500, 450, 600, 550);

	}
}