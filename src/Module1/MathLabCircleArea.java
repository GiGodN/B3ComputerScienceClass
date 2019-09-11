package Module1;

public class MathLabCircleArea {

	public static void main(String[] args) {
		System.out.println(CircleArea(7.5));
		System.out.println(CircleArea(10));
		System.out.println(CircleArea(72.534));
		System.out.println(CircleArea(55));
		System.out.println(CircleArea(101));
		System.out.println(CircleArea(99.952));
	}
	
	public static double CircleArea(double radius) {
		double area;
		area = Math.PI * radius * radius;
		return area;
	}

}
