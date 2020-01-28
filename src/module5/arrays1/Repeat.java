package module5.arrays1;

public class Repeat {

	public static void main(String[] args) {
		System.out.println(repeat(new int[] {-99,1,2,3,4,5,6,6,6,6,6,7,8,9,10,12345,5,5,5,5}));
		System.out.println(repeat(new int[] {10,9,8,7,6,5,4,3,2,1,-99}));
		System.out.println(repeat(new int[] {10,20,30,40,50,-11818,40,30,20,10}));
		System.out.println(repeat(new int[] {32767}));
		System.out.println(repeat(new int[] {255,255}));
		System.out.println(repeat(new int[] {9,10,-88,100,-555,1000}));
		System.out.println(repeat(new int[] {10,10,10,11,456}));
		System.out.println(repeat(new int[] {-111,1,2,3,9,11,20,30}));
		System.out.println(repeat(new int[] {9,8,7,6,5,4,3,2,0,-2,-989}));
		System.out.println(repeat(new int[] {12,12,15,18,21,23,1000}));
		System.out.println(repeat(new int[] {250,19,17,15,13,13,13,13,11,10,9,6,3,2,1,1}));
		System.out.println(repeat(new int[] {9,10,-8,10000,-5000,1000}));
	}
	
	private static boolean repeat(int[] arr) {
		for (int x = 0; x < arr.length; x++) {
			for (int y = 0; y < arr.length; y++) {
				if(x != y && arr[x] == arr[y]) {
					return false;
				}
			}
		}
		return true;
	}

}
