package module1.GraphicsLabs;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Shape {

	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Font font;
	private String text;
	private Color textColor;
	private Color rectColor;

	public Shape(int xPos, int yPos, int width, int height, Font font, String text, Color textColor, Color rectColor) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.width = width;
		this.height = height;
		this.font = font;
		this.text = text;
		this.textColor = textColor;
		this.rectColor = rectColor;
	}

	public void draw(Graphics window) {
		window.setColor(rectColor);
		window.fillRect(xPos, yPos, width, height);

		window.setColor(textColor);
		window.setFont(font);
		window.drawString(text, xPos, yPos + height);
	}

	public int getxPos() {
		return xPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public int getyPos() {
		return yPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Font getFont() {
		return font;
	}

	public void setFont(Font font) {
		this.font = font;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Color getTextColor() {
		return textColor;
	}

	public void setTextColor(Color textColor) {
		this.textColor = textColor;
	}

	public Color getRectColor() {
		return rectColor;
	}

	public void setRectColor(Color rectColor) {
		this.rectColor = rectColor;
	}

	public String toString() {
		return xPos + " " + yPos + " " + width + " " + height + " " + rectColor + " " + textColor;
	}
}