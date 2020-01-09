package module4.scanner1;

import java.util.Scanner;

public class Dog {
	
	public static void main(String[] args) {
		System.out.println(calc("6 10 14 18 25 32"));
		System.out.println(calc("12 15 20 26 35 42"));
		System.out.println(calc("33 38 45 51 60 65"));
		System.out.println(calc("40 50 60 77 90 101"));
	}
	
	public static String calc(String s1) {
		String tempS = "";
		Scanner temp = new Scanner(s1);
		double totalFood = 0;
		while(temp.hasNext()) {
			int next = temp.nextInt();
			if(2 <= next && next <= 4) {
				totalFood += 0.5*7;
			}
			else if (5 <= next && next <= 7) {
				totalFood += 1.0*7;
			}
			else if (8 <= next && next <= 9) {
				totalFood += 1.5*7;
			}
			else if (10 <= next && next <= 19) {
				totalFood += 2.0*7;
			}
			else if (20 <= next && next <= 39) {
				totalFood += 3.5*7;
			}
			else if (40 <= next && next <= 59) {
				totalFood += 4.5*7;
			}
			else if (60 <= next && next <= 79) {
				totalFood += 6.0*7;
			}
			else {
				totalFood += 7.5*7;
			}
		}
		double totalBags = totalFood / 60;
		tempS = "" + (int)Math.ceil(totalBags) + " - 10 Pound Bags";
		temp.close();
		return tempS;
	}
	
}
