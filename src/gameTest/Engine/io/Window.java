package gameTest.Engine.io;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWVidMode;

public class Window {

	private int WIDTH, HEIGHT;
	private String Title;
	private long window;
	
	public int frame;
	public static long time;

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
		GLFW.glfwMakeContextCurrent(window);
		GLFW.glfwSwapInterval(1);

		time = System.currentTimeMillis();
		
		GLFW.glfwShowWindow(window);
	}
	
	public void update() {
		GLFW.glfwPollEvents();
		frame++;
		if (System.currentTimeMillis() > time + 1000) {
			GLFW.glfwSetWindowTitle(window, Title + " FPS: " + frame);
			time = System.currentTimeMillis();
			frame = 0;
		}
			
	}
	
	public void swapBuffers() {
		GLFW.glfwSwapBuffers(window);
	}
	
	public boolean shouldClose() {
		return GLFW.glfwWindowShouldClose(window);
	}

}
