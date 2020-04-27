package module6.arrayList1;

import java.util.ArrayList;
import java.util.Arrays;

public class ListOddToEven {
	public static void main(String args[]) {
		System.out.println(go(new ArrayList<Integer>(Arrays.asList(7,1,5,3,11,5,6,7,8,9,10,12345,11))));
		System.out.println(go(new ArrayList<Integer>(Arrays.asList(11,9,8,7,6,5,4,3,2,1,-99,7))));
		System.out.println(go(new ArrayList<Integer>(Arrays.asList(10,20,30,40,5,41,31,20,11,7))));
		System.out.println(go(new ArrayList<Integer>(Arrays.asList(32767,70,4,5,6,7))));
		System.out.println(go(new ArrayList<Integer>(Arrays.asList(2,7,11,21,5,7))));
		System.out.println(go(new ArrayList<Integer>(Arrays.asList(7,255,11,255,100,3,2))));
		System.out.println(go(new ArrayList<Integer>(Arrays.asList(9,11,11,11,7,1000,3))));
		System.out.println(go(new ArrayList<Integer>(Arrays.asList(7,7,7,11,2,7,7,11,11,2))));
		System.out.println(go(new ArrayList<Integer>(Arrays.asList(2,4,6,8,8))));
	}

	public static int go(ArrayList<Integer> ray) {
		int dist = -1;
		int oddI = -1;
		int evenI = -1;
		for(int num : ray) {
			if(num % 2 == 1) {
				oddI = ray.indexOf(num);
				break;
			}
		}
		for(int i = 0; i < ray.size(); i++) {
			if(ray.get(i) % 2 == 0) {
				evenI = i;
			}
		}
		if(oddI != -1 && evenI != -1) {
			dist = evenI - oddI;
			if(dist < 0) {
				dist = -1;
			}
		}
		return dist;
	}
}