package module4.scanner1;

import java.util.Scanner;

public class Total {
	
	public static void main(String[] args) {
		System.out.println("sum = " + sum("1 2 3 4 5 6"));
		System.out.println("sum = " + sum("10 20 30 40 50 60"));
		System.out.println("sum = " + sum("250 657 2154 345 6796"));
		System.out.println("sum = " + sum("0"));
		System.out.println("sum = " + sum("-99 45 -98 92 87"));
	}
	
	public static int sum(String s1) {
		Scanner temp = new Scanner(s1);
		int sum = 0;
		while(temp.hasNext()) {
			sum += temp.nextInt();
		}
		temp.close();
		return sum;
	}
	
}
