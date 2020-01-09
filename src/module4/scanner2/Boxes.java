package module4.scanner2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Boxes {
	
	public static void main(String[] args) {
		File file = new File("data/box.dat");
		Scanner read = null;
		try {
			read = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return;
		}
		int ii = read.nextInt();
		String[] temp = new String[ii];
		String[] tempS = new String[ii];
		int[] tempN = new int[ii];
		read.nextLine();
		for (int i = 0; i < temp.length; i++) {
			temp[i] = read.nextLine();
			tempS[i] = temp[i].substring(0, 1);
			tempN[i] = Integer.parseInt(temp[i].substring(2));
		}
		for (int i = 0; i < temp.length; i++) {
			for (int y = 0; y < tempN[i]; y++) {
				for (int x = 0; x < tempN[i]; x++) {
					System.out.print(tempS[i]);
				}
				System.out.println();
			}
			System.out.println();
		}
		read.close();
	}
}
