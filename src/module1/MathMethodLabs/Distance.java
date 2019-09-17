package module1.MathMethodLabs;

public class Distance {
	
	public static double getDistance(int xOne, int yOne, int xTwo, int yTwo) {
		double temp1 = Math.pow(xTwo - xOne, 2);
		double temp2 = Math.pow(yTwo - yOne, 2);
		double temp3 = temp1 + temp2;
		double D = Math.sqrt(temp3);
		return D;
	}
}