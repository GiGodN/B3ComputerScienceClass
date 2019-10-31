package gameTest.Engine.Graphics;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;
import org.lwjgl.system.MemoryUtil;

public class Mesh {
	private Vertex[] verticies;
	private int[] indices;
	private int VAO, PBO, IBO;
	
	public Mesh(Vertex[] verticies, int[] indices) {
		this.verticies = verticies;
		this.indices = indices;
	}
	
	public void create() {
		VAO = GL30.glGenVertexArrays();
		GL30.glBindVertexArray(VAO);
		
		FloatBuffer positionBuffer = MemoryUtil.memAllocFloat(verticies.length * 3);
		float[] positionData = new float[verticies.length * 3];
		for (int i = 0; i < verticies.length; i++) {
			positionData[i * 3] = verticies[i].getPosition().getX();
			positionData[i * 3 + 1] = verticies[i].getPosition().getY();
			positionData[i * 3 + 2] = verticies[i].getPosition().getZ();
		}
		positionBuffer.put(positionData).flip();
		
		PBO = GL15.glGenBuffers();
		GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, PBO);
		GL15.glBufferData(GL15.GL_ARRAY_BUFFER, positionBuffer, GL15.GL_STATIC_DRAW);
		GL20.glVertexAttribPointer(0, 3, GL11.GL_FLOAT, false, 0, 0);
		GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, 0);
		
		IntBuffer indicesBuffer = MemoryUtil.memAllocInt(indices.length);
		indicesBuffer.put(indices).flip();
		
		IBO = GL15.glGenBuffers();
		GL15.glBindBuffer(GL15.GL_ELEMENT_ARRAY_BUFFER, IBO);
		GL15.glBufferData(GL15.GL_ELEMENT_ARRAY_BUFFER, IBO, GL15.GL_STATIC_DRAW);
		GL15.glBindBuffer(GL15.GL_ELEMENT_ARRAY_BUFFER, 0);
	}

	public Vertex[] getVerticies() {
		return verticies;
	}

	public int[] getIndices() {
		return indices;
	}

	public int getVAO() {
		return VAO;
	}

	public int getPBO() {
		return PBO;
	}

	public int getIBO() {
		return IBO;
	}
}
