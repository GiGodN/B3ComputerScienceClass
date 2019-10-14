package module2.Ifs3;

public class FirstL {

	public static void main(String[] args) {
		System.out.println(First("hello", "howdy"));
		System.out.println(First("one", "two"));
		System.out.println(First("three", "two"));
		System.out.println(First("TCEA", "UIL"));
		System.out.println(First("State", "Champions"));
		System.out.println(First("ABC", "DEF"));
	}

	private static String First(String s1, String s2) {
		if (s1.charAt(0) == s2.charAt(0)) {
			return s1 + " has the same first letter as " + s2;
		} else {
			return s1 + " does not have the same first letter " + s2;
		}
	}

}

/*
 * hello, howdy
 * 
 * "one", "two"
 * 
 * "three", "two"
 * 
 * "TCEA", "UIL"
 * 
 * "State", "Champions"
 * 
 * "ABC", "DEF"
 */
