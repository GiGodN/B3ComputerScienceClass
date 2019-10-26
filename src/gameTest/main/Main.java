package gameTest.main;

import org.lwjgl.glfw.GLFW;

import gameTest.Engine.io.Input;
import gameTest.Engine.io.Window;

public class Main implements Runnable{
	
	public Thread game;
	public Window window;
	
	public final int WIDTH = 1280, HEIGHT = 760;
	
	public void start() {
		game = new Thread(this, "game");
		game.run();
	}
	
	public void init() {
		System.out.println("initalizing game");
		window = new Window(WIDTH, HEIGHT, "GAME");
		window.setBackgroundColor(1.0f, 0f, 0f);
		window.create();
	}
	
	public void run() {
		init();
		while (!window.shouldClose()) {
			update();
			render();
			if(Input.isKeyDown(GLFW.GLFW_KEY_ESCAPE))
				return;
		}
		window.destroy();
	}
	
	private void update() {
		window.update();
		if(Input.isBtnDown(GLFW.GLFW_MOUSE_BUTTON_LEFT))
			System.out.println("x: " + Input.getMouseX() + ", y: " + Input.getMouseY());
	}
	
	private void render() {
		window.swapBuffers();
	}
	
	public static void main(String[] args) {
		new Main().start();
	}
	
}
