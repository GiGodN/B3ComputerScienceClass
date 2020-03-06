package module7.names;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

//Noah John & Austin Li

public class Names {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("enter a year between 1880 and 2018 (inclusive)");
		int year = key.nextInt();
		String[][] nameM;
		try {
			nameM = genNameMat(year);
		} catch (IOException e) {
			return;
		}
		if (nameM == null) {
			return;
		}
//		for (String[] s : nameM) {
//			for (String s1 : s) {
//				System.out.print(s1 + " ");
//			}
//			System.out.println();
//		}
//		System.out.println(nameM.length);
		System.out.println(getTopName(nameM));
		System.out.println("enter a starting letter");
		System.out.println(amntName(key.next(), nameM));
		String nameFreq = "";
		for(char i = 65; i <=90; i++) {
			System.out.println(i + " :" + amntNameChar(i,  nameM));
			nameFreq += i + " :" + amntNameChar(i,  nameM) + "\n";
		}
		FileWriter fR;
		try {
			fR = new FileWriter(System.getProperty("user.home") + File.separator + "data" + File.separator + year + "NameData.dat");
			fR.write(nameFreq);
			fR.close();
		} catch (IOException e) {
			System.out.print("fR failure");
			return;
		}
		key.close();
	}
	
	public static int amntName(String let, String[][] data) {
		char lett = let.toUpperCase().toCharArray()[0];
		int amt = 0;
		for(String[] sA : data) {
			if(sA[0].toCharArray()[0] == lett) {
				amt += Integer.parseInt(sA[2]);
			}
		}
		return amt;
	}
	
	public static int amntNameChar(char let, String[][] data) {
		char lett = let;
		int amt = 0;
		for(String[] sA : data) {
			if(sA[0].toCharArray()[0] == lett) {
				amt += Integer.parseInt(sA[2]);
			}
		}
		return amt;
	}

	public static String getTopName(String[][] data) {
		String response = "Female: " + data[0][0];
		for (String[] s : data) {
			if(s[1].equals("M")) {
				response += " | Male: " + s[0];
				break;
			}
		}
		return response;
	}

	public static String[][] genNameMat(int year) throws IOException {
		Scanner s;
		String[][] nameM;
		File p;
		try {
			p = new File("data/names/yob" + year + ".txt");
			s = new Scanner(p);
			nameM = new String[countLines(p.getAbsolutePath())][3];
		} catch (FileNotFoundException e) {
			System.out.println("invalid year try again");
			return null;
		}
		for (int i = 0; s.hasNext(); i++) {
			Scanner f = new Scanner(s.next());
			f.useDelimiter(",");
			nameM[i][0] = f.next();
			nameM[i][1] = f.next();
			nameM[i][2] = f.next();
		}
		s.close();
		return nameM;
	}

	public static int countLines(String filename) throws IOException {
		InputStream is = new BufferedInputStream(new FileInputStream(filename));
		try {
			byte[] c = new byte[1024];
			int readChars = is.read(c);
			if (readChars == -1) {
				return 0;
			}
			int count = 0;
			while (readChars == 1024) {
				for (int i = 0; i < 1024;) {
					if (c[i++] == '\n') {
						++count;
					}
				}
				readChars = is.read(c);
			}
			while (readChars != -1) {
				//System.out.println(readChars);
				for (int i = 0; i < readChars; ++i) {
					if (c[i] == '\n') {
						++count;
					}
				}
				readChars = is.read(c);
			}
			return count == 0 ? 1 : count;
		} finally {
			is.close();
		}
	}

}
