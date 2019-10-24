package gameTest.Engine.io;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWVidMode;

public class Window {

	private int WIDTH, HEIGHT;
	private String Title;
	private long window;

	public Window(int WIDTH, int HEIGHT, String Title) {
		this.WIDTH = WIDTH;
		this.HEIGHT = HEIGHT;
		this.Title = Title;
	}

	public void create() {
		if (!GLFW.glfwInit()) {
			System.err.println("Error GLFW was not initalized");
			return;
		}
		
		window = GLFW.glfwCreateWindow(WIDTH, HEIGHT, Title, 0, 0);
		
		if (window == 0) {
			System.err.println("Error GLFW window was not created");
			return;
		}
		
		GLFWVidMode videomode = GLFW.glfwGetVideoMode(GLFW.glfwGetPrimaryMonitor());
		GLFW.glfwSetWindowPos(window, (videomode.width() - WIDTH) / 2, (videomode.height() - HEIGHT) / 2);
		
		GLFW.glfwShowWindow(window);
	}

}
