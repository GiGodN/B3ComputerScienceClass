package module2.IfsElseIf;

public class NumCheck {

	public static void main(String[] args) {
		System.out.println(check(200));
		System.out.println(check(100));
		System.out.println(check(25));
		System.out.println(check(88));
		System.out.println(check(99));
		System.out.println(check(7));
		System.out.println(check(8));
		System.out.println(check(10));
	}
	
	private static int check(int n1) {
		if(n1 % 5 == 0) {
			return 1;
		}
		else if(n1 % 4 == 0) {
			return 2;
		}
		else if(n1 % 3 == 0) {
			return 3;
		}
		else {
			return 4;
		}
	}

}
