package module6.arrayList2;

import java.util.ArrayList;

class Number {
	
	private int num;
	
	public Number (int num) {
		this.num = num;
	}
	
	public boolean isOdd() {
		if(num % 2 == 1) {
			return true;
		}
		return false;
	}
	
	public boolean isPerfect() {
		int sum = 0;
		for (int i : getListOfFactors(num)) {
			sum += i;
		}
		if(sum == num) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		return "" + num;
	}
	
	private static ArrayList<Integer> getListOfFactors(int number) {
		ArrayList<Integer> fact = new ArrayList<Integer>();
		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				fact.add(i);
			}
		}
		return fact;
	}
	
}