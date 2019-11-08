package module3.loop1;

import java.util.ArrayList;
import java.util.List;

public class AvgAll {

	public static void main(String[] args) {
		System.out.printf("%.1f \n", average(234));
		System.out.printf("%.1f \n", average(10000));
		System.out.printf("%.1f \n", average(111));
		System.out.printf("%.1f \n", average(9005));
		System.out.printf("%.1f \n", average(84645));
		System.out.printf("%.1f \n", average(123456789));
		System.out.printf("%.1f \n", average(55556468));
		System.out.printf("%.1f \n", average(8525455));
		System.out.printf("%.1f \n", average(8514548));
		System.out.printf("%.1f \n", average(111111));
		System.out.printf("%.1f \n", average(1212121212));
		System.out.printf("%.1f \n", average(222222));
	}

	public static double average(int n1) {
		List<Integer> digits = new ArrayList<Integer>();
		while (n1 != 0) {
			digits.add(n1 % 10);
			n1 /= 10;
		}
		int temp1 = 0;
		for (int i = 0; i < digits.size(); i++) {
			temp1 += digits.get(i);
		}
		return (double)temp1 / digits.size();
	}

}
