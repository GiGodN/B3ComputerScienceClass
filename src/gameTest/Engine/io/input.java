package gameTest.Engine.io;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWCursorPosCallback;
import org.lwjgl.glfw.GLFWKeyCallback;
import org.lwjgl.glfw.GLFWMouseButtonCallback;

public class input {
	private boolean[] keys = new boolean[GLFW.GLFW_KEY_LAST];
	private boolean[] mouseBtn = new boolean[GLFW.GLFW_MOUSE_BUTTON_LAST];
	private double mouseX, mouseY;
	
	private GLFWKeyCallback keyboard;
	private GLFWCursorPosCallback mouseMov;
	private GLFWMouseButtonCallback MouseBtn;
	
	public input() {
		keyboard = new GLFWKeyCallback() {
			public void invoke(long window, int key, int scanCode, int action, int mods) {
				keys[key] = (action != GLFW.GLFW_RELEASE);
			}
		};
		mouseMov = new GLFWCursorPosCallback() {
			public void invoke(long window, double x, double y) {
				mouseX = x;
				mouseY = y;
			}
		};
		
	}
}
