package gameTest.Engine.io;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWVidMode;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;

public class Window {

	private int WIDTH, HEIGHT;
	private String Title;
	private long window;
	
	public int frame;
	public static long time;
	
	private Input input;
	
	private float backgroundR, backgroundG, backgroundB;

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
		
		input = new Input();
		window = GLFW.glfwCreateWindow(WIDTH, HEIGHT, Title, 0, 0);
		
		if (window == 0) {
			System.err.println("Error GLFW window was not created");
			return;
		}
		
		GLFWVidMode videomode = GLFW.glfwGetVideoMode(GLFW.glfwGetPrimaryMonitor());
		GLFW.glfwSetWindowPos(window, (videomode.width() - WIDTH) / 2, (videomode.height() - HEIGHT) / 2);
		
		GLFW.glfwMakeContextCurrent(window);
		GL.createCapabilities();
		
		GLFW.glfwSetKeyCallback(window, input.getKeyboardCallback());
		GLFW.glfwSetCursorPosCallback(window, input.getMouseMovCallback());
		GLFW.glfwSetMouseButtonCallback(window, input.getMouseBtnCallback());

		time = System.currentTimeMillis();
		
		GLFW.glfwShowWindow(window);
		GLFW.glfwSwapInterval(1);
	}
	
	public void update() {
		GL11.glClearColor(backgroundR, backgroundG, backgroundB, 1.0f);
		GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
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
	
	public void setBackgroundColor(float r, float g, float b) {
		backgroundR = r;
		backgroundG = g;
		backgroundB = b;
	}
	
	public void destroy() {
		input.destroy();
		GLFW.glfwWindowShouldClose(window);
		GLFW.glfwDestroyWindow(window);
		GLFW.glfwTerminate();
	}

}
