package gameTest.main;

import gameTest.Engine.io.Window;

public class main implements Runnable{
	
	public Thread game;
	public static Window window;
	
	public static final int WIDTH = 1280, HEIGHT = 760;
	
	public void start() {
		game = new Thread(this, "game");
		game.run();
	}
	
	public static void init() {
		System.out.println("initalizing game");
		window = new Window(WIDTH, HEIGHT, "GAME");
		window.create();
	}
	
	public void run() {
		init();
		while (true) {
			update();
			render();
		}
	}
	
	private void update() {
		System.out.println("updating game");
	}
	
	private void render() {
		System.out.println("rendering game");
	}
	
	public static void main(String[] args) {
		new main().start();
	}
	
}
