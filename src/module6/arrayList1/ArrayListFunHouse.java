package module6.arrayList1;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ArrayListFunHouse {
	public static ArrayList<Integer> getListOfFactors(int number) {
		ArrayList<Integer> fact = new ArrayList<Integer>();
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				fact.add(i);
			}
		}
		return fact;
	}

	public static void keepOnlyCompositeNumbers(List<Integer> nums) {
		for (int i = 0; i < nums.size(); i++) {
			if (getListOfFactors(nums.get(i)).size() < 2) {
				nums.remove(i);
			}
		}
	}
}