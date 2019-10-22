package gameTest.main;

public class main implements Runnable{
	
	public Thread game;
	
	public void start() {
		game = new Thread(this, "game");
		game.run();
	}
	
	public static void init() {
		System.out.println("initalizing game");
	}
	
	public void run() {
		
	}
	
	public static void main(String[] args) {
		new main().start();
	}
	
}
