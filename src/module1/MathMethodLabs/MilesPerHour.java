package module1.MathMethodLabs;

public class MilesPerHour {
	
	public static double getMPH(int dist, int hrs, int mins) {
		double mph = dist/(hrs+(mins/60.0));
		return mph;
	}
}
