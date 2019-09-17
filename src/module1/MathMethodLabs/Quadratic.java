package module1.MathMethodLabs;

public class Quadratic {
	
	public static double getRootOne(int a, int b, int c) {
		double x;
		double temp1 = b*-1 + Math.sqrt(b*b-4*a*c);
		double temp2 = 2*a;
		x = temp1/temp2;
		return x;
	}

	public static double getRootTwo(int a, int b, int c) {
		double x;
		double temp1 = b*-1 - Math.sqrt(b*b-4*a*c);
		double temp2 = 2*a;
		x = temp1/temp2;
		return x;
	}
}