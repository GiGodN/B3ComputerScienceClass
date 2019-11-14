package module3.forLoop1;

public class GreatestCommonDenom {

	public static void main(String[] args) {
		System.out.println("GCD of " + 5 + " and " + 25 + " is " + GCD(5, 25));
		System.out.println("GCD of " + 4 + " and " + 400 + " is " + GCD(4, 400));
		System.out.println("GCD of " + 8 + " and " + 80 + " is " + GCD(8, 80));
		System.out.println("GCD of " + 15 + " and " + 45 + " is " + GCD(15, 45));
		System.out.println("GCD of " + 6 + " and " + 66 + " is " + GCD(6, 66));
		System.out.println("GCD of " + 9 + " and " + 9 + " is " + GCD(9, 9));
		System.out.println("GCD of " + 9 + " and " + 543 + " is " + GCD(9, 543));
		System.out.println("GCD of " + 15 + " and " + 40 + " is " + GCD(15, 40));
		System.out.println("GCD of " + 6 + " and " + 51 + " is " + GCD(6, 51));
	}

	private static int GCD(int n1, int n2) {
		if (n1 == 0) {
			return n2;
		}
		if (n2 == 0) {
			return n1;
		}
		if (n1 == n2) {
			return n1;
		}
		if (n1 > n2)
			return GCD(n1 - n2, n2);
		return GCD(n1, n2 - n1);
	}

}
