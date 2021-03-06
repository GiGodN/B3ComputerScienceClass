package module2.GraphicsLab;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JFrame;

public class DrawIt extends JFrame {
	private static final long serialVersionUID = 1L;
	public static int WIDTH = 800;
	public static int HEIGHT = 600;

	public DrawIt() {
		super("DrawIt");

		setSize(WIDTH, HEIGHT);
		setBackground(Color.BLACK);

		Tablet tb = new Tablet(this);
		((Component) tb).setFocusable(true);

		getContentPane().add(tb);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String args[]) {
		@SuppressWarnings("unused")
		DrawIt run = new DrawIt();
	}
}