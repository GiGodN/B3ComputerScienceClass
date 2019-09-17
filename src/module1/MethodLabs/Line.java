package module1.MethodLabs;

public class Line
{
	public static double getSlope( int x1, int y1, int x2, int y2 ) {
		double temp1 = y2-y1;
		double temp2 = x2-x1;
		double m = temp1 / temp2;
		return m;
	}

}