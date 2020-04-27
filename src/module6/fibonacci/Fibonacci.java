package module6.fibonacci;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean repeat = true;
		while(repeat) {
			System.out.println("Enter the Posiotion: ");
			int temp = s.nextInt();
			System.out.println("yesArr: " + yesArr(temp));
			System.out.println("noArr: " + noArr(temp));
			System.out.println("Would you like to enter another number (y/n)");
			String s1 = s.next();
			if(s1.toLowerCase().equals("n")) break;
		}
		System.out.println("exit");
	}
	
	public static int yesArr(int pos) {
		ArrayList<Integer> fib = new ArrayList<Integer>();
		fib.add(0);fib.add(1);
		for(int i = 2; i < pos+1; i++) {
			fib.add(fib.get(i-2) + fib.get(i-1));
		}
		return fib.get(pos);
	}
	
	public static int noArr(int pos) {
		int first = 0;
		int second = 1;
		//if(pos < 2)
		for (int i = 1; i < pos; i++) {
			int firstT = first;
			int secondT = second;
			int thirdT = firstT + secondT;
			first = secondT;
			second = thirdT;
		}
		return second;
	}

}
