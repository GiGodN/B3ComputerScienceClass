package module1.GraphicsLabs;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ShapePanel extends JPanel {

	public static Color gray = new Color(0x333333);
	
	private static final long serialVersionUID = -3065135132783539473L;

	public ShapePanel() {
		setBackground(gray);
		setVisible(true);
	}

	public void update(Graphics window) {
		paint(window);
	}
	
	public void paint(Graphics window) {
		window.setColor(gray);
		window.fillRect(0, 0, getWidth(), getHeight());
		window.setColor(Color.BLUE);
		window.drawRect(20, 20, getWidth() - 40, getHeight() - 40);
		window.setFont(new Font("TAHOMA", Font.BOLD, 18));
		window.drawString("CREATE YOUR OWN SHAPE!", 40, 40);

		Shape s1 = new Shape(100, 100, 100, 100, new Font("TAHOMA", Font.BOLD, 25), "Hello", new Color(0x123456), new Color(0x654321));
		s1.draw(window);
		
		Shape s2 = new Shape(250, 200, 50, 50, new Font("Comic Sans", Font.ITALIC, 25), "Hi", new Color(0x553344), new Color(443355));
		s2.draw(window);
	}
}