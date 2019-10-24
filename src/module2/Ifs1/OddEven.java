package module2.Ifs1;

public class OddEven {
	
	public static void main(String[] args) {
		System.out.println(isEven(111));
		System.out.println(isEven(2000));
		System.out.println(isEven(-99));
		System.out.println(isEven(1111));
		System.out.println(isEven(-850));
	}
	
	private static String isEven(int n1) {
		if (n1 % 2 == 0) {
			return "" + n1 + " is even";
		}
		else {
			return "" + n1 + " is odd";
		}
	}

}
