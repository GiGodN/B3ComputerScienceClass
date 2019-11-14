package module3.forLoop1;

public class isPrime {

	public static void main(String[] args) {
		System.out.println(prime(24));
		System.out.println(prime(7));
		System.out.println(prime(100));
		System.out.println(prime(113));
		System.out.println(prime(65535));
		System.out.println(prime(2));
		System.out.println(prime(7334));
		System.out.println(prime(7919));
		System.out.println(prime(1115125003));
	}

	private static String prime(int n1) {
		for (int i = 2; i < Math.sqrt(n1); i++) {
			if (n1 % i == 0) {
				return n1 + " is not Prime";
			}
		}
		return n1 + " is Prime";
	}

}

/*
 * 24
 * 
 * 7
 * 
 * 100
 * 
 * 113
 * 
 * 65535
 * 
 * 2
 * 
 * 7334
 * 
 * 7919
 * 
 * 1115125003
 */