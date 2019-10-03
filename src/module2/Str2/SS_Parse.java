package module2.Str2;

public class SS_Parse {

	public static void main(String[] args) {
		System.out.println(SSParse("456-56-234"));
		System.out.println(SSParse("1-1-1"));
		System.out.println(SSParse("102-2-12"));
		System.out.println(SSParse("0-0-0"));
	}
	
	public static String SSParse(String s1) {
		int temp1 = Integer.parseInt(s1.substring(0, s1.indexOf('-')));
		int temp2 = Integer.parseInt(s1.substring(s1.indexOf("-")+1, s1.lastIndexOf("-")));
		int temp3 = Integer.parseInt(s1.substring(s1.lastIndexOf("-")+1, s1.length()));
		
		String temp = "SS# " + s1 + " has a total of " + (temp1 + temp2 + temp3);
		
		return temp;
	}

}
