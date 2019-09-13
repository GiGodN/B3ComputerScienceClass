package Module1.MathLab;

public class MathLabTrapazoidArea {

	public static void main(String[] args) {
		System.out.println(TrapArea(3, 3, 3));
		System.out.println(TrapArea(5, 6, 7));
		System.out.println(TrapArea(7, 10, 6));
		System.out.println(TrapArea(13, 9, 3));
		System.out.println(TrapArea(6, 11, 4));
		System.out.println(TrapArea(11, 8, 5));
	}
	
	public static double TrapArea(double Base1, double Base2, double Height) {
		double Area;
		Area = ((Base1 + Base2) * Height) / 2;
		return Area;
	}

}
