package module1.ClassLabs;

import java.util.Scanner;
import java.lang.Math.*;

public class Triangle {
	
	private int sideA, sideB, sideC;
	private double perimeter;

	public Triangle(int a, int b, int c) {
		sideA = a;
		sideB = b;
		sideC = c;
	}

	public void calcPerimeter() {
		perimeter = sideA + sideB + sideC;
	}

	public double getArea() {
		double temp1 = perimeter/2;
		double area = Math.sqrt(temp1 * (temp1 - sideA) * (temp1 - sideB) * (temp1 - sideC));
		return area;
	}
}