package Module1;

public class MathLabConeVol {

	public static void main(String[] args) {
		System.out.println(coneVol(4, 4));
		System.out.println(coneVol(4, 3));
		System.out.println(coneVol(9, 3));
		System.out.println(coneVol(1, 3));
		System.out.println(coneVol(1, 5));
		System.out.println(coneVol(7, 7));
		System.out.println(coneVol(4, 4));
		System.out.println(coneVol(1.5, 3));
		System.out.println(coneVol(1.5, 5));
	}
	
	public static double coneVol(double radius, double heith) {
		double volume;
		volume = (Math.PI * (radius * radius) * heith) / 3;
		return volume;
	}

}
