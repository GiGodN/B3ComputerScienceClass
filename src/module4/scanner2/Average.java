package module4.scanner2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Average {
	
	public static void main(String[] args) {
		File file = new File("data/average.dat");
		Scanner read = null;
		try {
			read = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return;
		}
		String[] temp = new String[read.nextInt()];
		read.nextLine();
		for (int i = 0; i < temp.length; i++) {
			temp[i] = read.nextLine();
		}
		for (int i = 0; i < temp.length; i++) {
			Scanner sr = new Scanner(temp[i]);
			List<Integer> l = new ArrayList<Integer>();
			int sum = 0;
			while (sr.hasNext()) {
				l.add(Integer.parseInt(sr.next()));
			}
			Collections.sort(l);
			l.remove(0);
			for(int i1 = 0; i1 < l.size(); i1++) {
				sum += l.get(i1);
			}
			double average = sum / (double) l.size();
			System.out.println(temp[i] + "\naverage = " + average);
			sr.close();
			System.out.println();
		}
		read.close();
	}
	
}
