package module3.nestedLoops2;

import java.util.ArrayList;
import java.util.List;

public class Trippels {

	public static void main(String[] args) {
		System.out.println(validate(110));
	}
	
	private static String validate(int target) {
		List<int[]> list = gen(target);
		List<int[]> temp = new ArrayList<int[]>();
		String val = "";
		for (int x = 0; x < list.size(); x++) {
			for (int y = 0; y < list.size(); y++) {
				if (!(list.get(x)[0] == list.get(y)[0] && list.get(x)[1] == list.get(y)[1])) {
					temp.add(list.get(x));
				}
			}
		}
		return val;
	}
	
	private static List<int[]> gen(int target) {
		List<int[]> val = new ArrayList<int[]>();
		for (int x = 1; x <= target; x++) {
			for (int y = 1; y <= target; y++) {
				for (int z = 1; z <= target; z++) {
					if ((x*x + y*y == z*z) 
							&& (((x % 2 == 0) && (y % 2 == 1)) || ((x % 2 == 1) && (y % 2 == 0))) 
							&& z % 2 == 1
							&& findGCD3(x, y, z) == 1) {
						val.add(new int[] {x, y, z});
					}
				}
			}
		}
		return val;
	}
	
	private static int findGCD2(int n1, int n2) {
        if(n2 == 0){
            return n1;
        }
        return findGCD2(n2, n1%n2);
    }
	
	private static int findGCD3(int n1, int n2, int n3) {
        int n4 = findGCD2(n1, n2);
        return findGCD2(n4, n3);
    }
	
}
