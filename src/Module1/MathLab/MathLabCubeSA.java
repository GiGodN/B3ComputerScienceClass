package Module1.MathLab;

public class MathLabCubeSA {
	public static void main(String[] args) {
		System.out.println(cubeSA(112));
		System.out.println(cubeSA(4));
		System.out.println(cubeSA(33));
		System.out.println(cubeSA(50));
		System.out.println(cubeSA(5));
		System.out.println(cubeSA(19));
		System.out.println(cubeSA(111));
	}
	
	public static double cubeSA(double side) {
		double SurfaceArea;
		SurfaceArea = 6 *(side * side);
		return SurfaceArea;
	}
}
