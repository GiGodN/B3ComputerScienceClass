package module2.IfsElseIf;

public class AB {

	public static void main(String[] args) {
		System.out.println(Contains("chicken", 'a', 'b'));
		System.out.println(Contains("frog", 'f', 'g'));
		System.out.println(Contains("chicken", 'c', 'k'));
		System.out.println(Contains("apluscompsci", 'a', 's'));
		System.out.println(Contains("apluscompsci", 'a', 'p'));
		System.out.println(Contains("apluscompsci", 's', 'c'));
		System.out.println(Contains("apluscompsci", 'c', 'p'));
	}

	private static boolean Contains(String s1, char c1, char c2) {
		String temp1 = Character.toString(c1) + Character.toString(c2);
		if (s1.contains(temp1) && !s1.startsWith(temp1) && !s1.endsWith(temp1)) {
			return true;
		} else {
			return false;
		}
	}

}

/*
 * chicken a b
 * 
 * frog f g
 * 
 * chicken c k
 * 
 * apluscompsci a s
 * 
 * apluscompsci a p
 * 
 * apluscompsci s c
 * 
 * apluscompsci c p
 */