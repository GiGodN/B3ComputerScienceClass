package module2.IfsElseIf;

public class Grade {

	public static void main(String[] args) {
		System.out.println(GradeCal(78));
		System.out.println(GradeCal(92));
		System.out.println(GradeCal(31));
		System.out.println(GradeCal(82));
		System.out.println(GradeCal(77));
		System.out.println(GradeCal(77));
		System.out.println(GradeCal(55));
		System.out.println(GradeCal(65));
	}

	private static String GradeCal(double n1) {
		if (n1 >= 90) {
			return "A";
		} else if (n1 >= 80) {
			return "B";
		} else if (n1 >= 75) {
			return "C";
		} else if (n1 >= 70) {
			return "D";
		} else {
			return "F";
		}
	}

}
