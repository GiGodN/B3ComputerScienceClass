package gameTest.main;

import org.lwjgl.glfw.GLFW;

import gameTest.Engine.Graphics.Mesh;
import gameTest.Engine.Graphics.Renderer;
import gameTest.Engine.Graphics.Shader;
import gameTest.Engine.Graphics.Vertex;
import gameTest.Engine.Maths.Vector3f;
import gameTest.Engine.io.Input;
import gameTest.Engine.io.Window;

public class Main implements Runnable {

	public Thread game;
	public Window window;

	public final int WIDTH = 1280, HEIGHT = 760;

	public Renderer renderer;
	public Shader shader;
	public Mesh mesh = new Mesh(
		new Vertex[] { 
			new Vertex(new Vector3f(-0.5f,  0.5f, 0.0f)), 
			new Vertex(new Vector3f( 0.5f,  0.5f, 0.0f)),
			new Vertex(new Vector3f( 0.5f, -0.5f, 0.0f)), 
			new Vertex(new Vector3f(-0.5f, -0.5f, 0.0f)) 
		},
		new int[] { 
			0, 1, 2, 
			0, 3, 2 
	});

	public void start() {
		game = new Thread(this, "game");
		game.run();
	}

	public void init() {
		System.out.println("initalizing game");
		shader = new Shader("/shaders/mainVertex.glsl", "/shaders/mainFragment.glsl");
		renderer = new Renderer(shader);
		window = new Window(WIDTH, HEIGHT, "GAME");
		window.setBackgroundColor(1.0f, 0f, 0f);
		window.create();
		mesh.create();
		shader.create();
	}

	public void run() {
		init();
		while (!window.shouldClose() && !Input.isKeyDown(GLFW.GLFW_KEY_ESCAPE)) {
			update();
			render();
			if (Input.isKeyDown(GLFW.GLFW_KEY_F11))
				window.setFullscreen(!window.isFullscreen());
		}
		window.destroy();
	}

	private void update() {
		window.update();
	}

	private void render() {
		renderer.renderMesh(mesh);
		window.swapBuffers();
	}

	public static void main(String[] args) {
		new Main().start();
	}

}
