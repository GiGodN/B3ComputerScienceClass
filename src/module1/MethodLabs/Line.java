package module1.MethodLabs;

public class Line
{
	public static double getSlope( int x1, int y1, int x2, int y2 ) {
		double m = (y2-y1) / (x2-x1);
		return m;
	}

}