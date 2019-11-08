package module3.loop1;

import java.util.ArrayList;
import java.util.List;

public class Reverse {

	public static void main(String[] args) {
		System.out.println(rev(234));
		System.out.println(rev(10000));
		System.out.println(rev(111));
		System.out.println(rev(9005));
		System.out.println(rev(84645));
		System.out.println(rev(8547));
		System.out.println(rev(123456789));
	}

	private static String rev(int n1) {
		String value = n1 + " reversed is: ";;
		List<Integer> digits = new ArrayList<Integer>();
		while (n1 != 0) {
			digits.add(n1%10);
			n1 /= 10;
		}
		int temp1 = 0;
		for(int i = 0; i < digits.size(); i++) {
			temp1 *= 10;
			temp1 += digits.get(i);
		}
		return value + temp1;
	}

}