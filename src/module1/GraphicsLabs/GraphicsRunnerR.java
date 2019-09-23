package module1.GraphicsLabs;

import javax.swing.JFrame;

public class GraphicsRunnerR extends JFrame {
	
	private static final long serialVersionUID = -5831558973944631713L;
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public GraphicsRunnerR() {
		super("Graphics Runner");

		setSize(WIDTH, HEIGHT);

		getContentPane().add(new Robot());

		// add other classes to run them
		// BigHouse, Robot, or ShapePanel

		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		GraphicsRunnerR run = new GraphicsRunnerR();
	}
}