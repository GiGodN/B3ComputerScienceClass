package gameTest.Engine.io;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWVidMode;
import org.lwjgl.glfw.GLFWWindowSizeCallback;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;

import gameTest.Engine.Maths.Vector3f;

public class Window {

	private int WIDTH, HEIGHT;
	private String Title;
	private long window;

	public int frame;
	public static long time;

	private Input input;

	private Vector3f background = new Vector3f(0, 0, 0);

	private int windowPosX, windowPosY;

	private GLFWWindowSizeCallback sizeCallback;
	private boolean isResized;
	private boolean isFullscreen;

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
		window = GLFW.glfwCreateWindow(WIDTH, HEIGHT, Title, isFullscreen ? GLFW.glfwGetPrimaryMonitor() : 0, 0);

		if (window == 0) {
			System.err.println("Error GLFW window was not created");
			return;
		}

		GLFWVidMode videomode = GLFW.glfwGetVideoMode(GLFW.glfwGetPrimaryMonitor());
		windowPosX = (videomode.width() - WIDTH) / 2;
		windowPosY = (videomode.height() - HEIGHT) / 2;
		GLFW.glfwSetWindowPos(window, windowPosX, windowPosY);

		GLFW.glfwMakeContextCurrent(window);
		GL.createCapabilities();
		GL11.glEnable(GL11.GL_DEPTH_TEST);

		createCallbacks();

		time = System.currentTimeMillis();

		GLFW.glfwShowWindow(window);
		GLFW.glfwSwapInterval(0);
	}

	private void createCallbacks() {
		sizeCallback = new GLFWWindowSizeCallback() {
			public void invoke(long window, int W, int H) {
				WIDTH = W;
				HEIGHT = H;
				isResized = true;
			}
		};

		GLFW.glfwSetKeyCallback(window, input.getKeyboardCallback());
		GLFW.glfwSetCursorPosCallback(window, input.getMouseMovCallback());
		GLFW.glfwSetMouseButtonCallback(window, input.getMouseBtnCallback());
		GLFW.glfwSetScrollCallback(window, input.getMouseScrollCallback());
		GLFW.glfwSetWindowSizeCallback(window, sizeCallback);
	}

	public void update() {
		GL11.glClearColor(background.getX(), background.getY(), background.getZ(), 1.0f);
		GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
		if (isResized) {
			GL11.glViewport(0, 0, WIDTH, HEIGHT);
			isResized = false;
		}
		GL11.glClearColor(background.getX(), background.getY(), background.getZ(), 1.0f);
		GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
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
		background.set(r, g, b);
	}

	public boolean isFullscreen() {
		return isFullscreen;
	}

	public void setFullscreen(boolean isFullscreen) {
		GLFWVidMode videomode = GLFW.glfwGetVideoMode(GLFW.glfwGetPrimaryMonitor());
		this.isFullscreen = isFullscreen;
		isResized = true;
		if (isFullscreen) {
			GLFW.glfwSetWindowMonitor(window, GLFW.glfwGetPrimaryMonitor(), 0, 0, videomode.width(), videomode.height(),
					0);
		} else {
			GLFW.glfwSetWindowPos(window, windowPosX, windowPosY);
		}
	}

	public int getWIDTH() {
		return WIDTH;
	}

	public int getHEIGHT() {
		return HEIGHT;
	}

	public String getTitle() {
		return Title;
	}

	public long getWindow() {
		return window;
	}

	public void destroy() {
		input.destroy();
		sizeCallback.free();
		GLFW.glfwWindowShouldClose(window);
		GLFW.glfwDestroyWindow(window);
		GLFW.glfwTerminate();
	}

}
