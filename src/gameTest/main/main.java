package gameTest.main;

import gameTest.Engine.io.Window;

public class main implements Runnable{
	
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
		window.create();
	}
	
	public void run() {
		init();
		while (!window.shouldClose()) {
			update();
			render();
		}
	}
	
	private void update() {
		window.update();
	}
	
	private void render() {
		window.swapBuffers();
	}
	
	public static void main(String[] args) {
		new main().start();
	}
	
}
