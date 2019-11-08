package module3.loop1;

import java.util.ArrayList;
import java.util.List;

public class Divisor {

	public static void main(String[] args) {
		System.out.println(div(10));
		System.out.println(div(45));
		System.out.println(div(14));
		System.out.println(div(1024));
		System.out.println(div(1245));
		System.out.println(div(33));
		System.out.println(div(65535));
	}

	private static String div(int n1) {
		List<Integer> divisors = new ArrayList<Integer>();
		for (int i = 1; i < n1; i++) {
			if (n1 % i == 0) {
				divisors.add(i);
			}
		}
		String value = n1 + " has divisors: ";
		for (int i = 0; i < divisors.size(); i++) {
			value += divisors.get(i) + ", ";
		}
		return value;
	}

}

/*
 * 10
 * 
 * 45
 * 
 * 14
 * 
 * 1024
 * 
 * 1245
 * 
 * 33
 * 
 * 65535
 */
