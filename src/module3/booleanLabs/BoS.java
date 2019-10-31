package module3.booleanLabs;

public class BoS {

	public static void main(String[] args) {
		System.out.println(compair(10, 20));
		System.out.println(compair(20, 10));
		System.out.println(compair(20, 20));
		System.out.println(compair(10, 10));
		System.out.println(compair(0, 1));
		System.out.println(compair(1, 0));
		System.out.println(compair(3, 5));
		System.out.println(compair(5, 3));
		System.out.println(compair(55342, 323));
	}
	
	private static String compair(int n1, int n2) {
		if (n1 > n2 && n1 % 2 == 1) {
			return "yes";
		}
		else if (n2 > n1 && n2 % 2 == 1) {
			return "no";
		}
		else if (n1 == n2) {
			return "aplus";
		}
		else {
			return "compsci";
		}
	}

}
