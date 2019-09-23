package module1.GraphicsLabs;

import javax.swing.JFrame;

public class GraphicsRunnerS extends JFrame {
	
	private static final long serialVersionUID = -52866776126606422L;
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public GraphicsRunnerS() {
		super("Graphics Runner");

		setSize(WIDTH, HEIGHT);

		getContentPane().add(new ShapePanel());

		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		GraphicsRunnerS run = new GraphicsRunnerS();
	}
}