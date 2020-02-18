package module6.arrayList2;

import java.util.ArrayList;

public class NumberAnalyzer
{
	private ArrayList<Number> list;

	public NumberAnalyzer(int[] list) {
		this.list = new ArrayList<Number>(); 
		for (int i : list) {
			this.list.add(new Number(i));
		}
	}

	public int countOdds() {
		int sum = 0;
		for (Number i : list) {
			if(i.isOdd()) {
				sum++;
			}
		}
		return sum;
	}

	public int countEvens() {
		int sum = 0;
		for (Number i : list) {
			if(!i.isOdd()) {
				sum++;
			}
		}
		return sum;
	}
	
	public int countPerfects() {
		int sum = 0;
		for (Number i : list) {
			if(i.isPerfect()) {
				sum++;
			}
		}
		return sum;
	}
	
	public String toString() {
		return list.toString();
	}
}