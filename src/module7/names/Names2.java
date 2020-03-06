package module7.names;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//Noah John and Austin Li

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
		createFile(data);
	}

	public static void createFile(String[][][] data) {
		String nameFreq = "";
		String[][] count = new String[26][2];
		int year = 1880;
		for (String[][] d : data) {
			System.out.println(year++);
			for(char i = 65; i <=90; i++) {
				if(count[i-65][0] == null) {
					count[i-65][0] = Character.toString(i);
					count[i-65][1] = "0";
				}
				count[i-65][1] = Integer.toString(Integer.parseInt(count[i-65][1]) + Names.amntNameChar(i, d));
			}
		}
		for(String[] s : count) {
			nameFreq += s[0] + " :" + s[1] + "\n";
		}
		FileWriter fR;
		try {
			fR = new FileWriter(System.getProperty("user.home") + File.separator + "data" + File.separator + "a" + "NameData.dat");
			fR.write(nameFreq);
			fR.close();
		} catch (IOException e) {
			System.out.print("fR failure");
			return;
		}
	}

}
