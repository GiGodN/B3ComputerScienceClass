package module4.scanner2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SSN {
	
	public static void main(String[] args) {
		File file = new File("data/social.dat");
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
			String s1 = temp[i];
			int sum = 0;
			while (s1.indexOf("-") != -1) {
				sum += Integer.parseInt(s1.substring(0, s1.indexOf("-")));
				s1 = s1.substring(s1.indexOf("-") + 1);
			}
			sum += Integer.parseInt(s1);
			System.out.println("SS# " + temp[i] + " Has a sum of " + sum);
		}
		read.close();
	}
	
}
