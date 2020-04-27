package module7.names;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

//Noah John and Austin Li
//Files are written to ~/data/

public class Names2 {

	public static void main(String[] args) {
		String[][][] data = new String[139][][];
		for (int i = 1880; i <= 2018; i++) {
			try {
				data[i - 1880] = Names.genNameMat(i);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		genStatFiles(data);
		createFile();
	}

	public static void genStatFiles(String[][][] data) {
		int year = 1880;
		for (String[][] y : data) {
			try {
				Names.writeFile(y, new FileWriter(System.getProperty("user.home") + File.separator + "data"
						+ File.separator + "stats" + File.separator + year + "NameStats.dat"));
			} catch (IOException e) {
				e.printStackTrace();
			}
			year++;
		}
	}

//	public static void createFile(String[][][] data) {
//		String nameFreq = "";
//		String[][] count = new String[26][2];
//		int year = 1880;
//		for (String[][] d : data) {
//			System.out.println(year++);
//			for(char i = 65; i <=90; i++) {
//				if(count[i-65][0] == null) {
//					count[i-65][0] = Character.toString(i);
//					count[i-65][1] = "0";
//				}
//				count[i-65][1] = Integer.toString(Integer.parseInt(count[i-65][1]) + Names.amntNameChar(i, d));
//			}
//		}
//		for(String[] s : count) {
//			nameFreq += s[0] + " :" + s[1] + "\n";
//		}
//		FileWriter fR;
//		try {
//			fR = new FileWriter(System.getProperty("user.home") + File.separator + "data" + File.separator + "all" + "NameData.dat");
//			fR.write(nameFreq);
//			fR.close();
//		} catch (IOException e) {
//			System.out.print("fR failure");
//			return;
//		}
//	}
	public static void createFile() {
		String data = "";
		String[][] count = new String[26][2];
		for (int year = 1880; year <= 2018; year++) {
			try {
				InputStream is = new FileInputStream(System.getProperty("user.home") + File.separator + "data"
						+ File.separator + "stats" + File.separator + year + "NameStats.dat");
				BufferedReader buf = new BufferedReader(new InputStreamReader(is));
				String line = buf.readLine();
				StringBuilder sb = new StringBuilder();
				while (line != null) {
					sb.append(line).append("\n");
					line = buf.readLine();
				}
				String fileAsString = sb.toString();
				Scanner s = new Scanner(fileAsString);
				for (char i = 65; i <= 90; i++) {
					String temp = s.nextLine();
					if (count[i - 65][0] == null) {
						count[i - 65][0] = Character.toString(i);
						count[i - 65][1] = "0";
					}
					count[i - 65][1] = Integer.toString(Integer.parseInt(count[i - 65][1]) + Integer.parseInt(temp.substring(3)));

				}
				s.close();
				buf.close();
			} catch (IOException e) {
				e.printStackTrace();
				return;
			}

		}
		for (String[] d : count) {
			data += d[0] + " : " + d[1] + "\n";
		}
		try {
			FileWriter writer = new FileWriter(
					System.getProperty("user.home") + File.separator + "data" + File.separator + "AllYears.txt");
			writer.write(data);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

}
