package module2.Ifs2;

public class StrMixer {

	public static void main(String[] args) {
		System.out.println(mix("apluscompsci", 3));
		System.out.println(mix("apluscompsci", 5));
		System.out.println(mix("apluscompsci", 1));
		System.out.println(mix("apluscompsci", 2));
		System.out.println(mix("apluscompsci", 30));
		System.out.println(mix("apluscompsci", 4));
	}
	
	private static String mix(String s1, int n1) {
		if(s1.length() > n1) {
			String temp1 = s1.substring(0, n1);
			String temp2 = s1.replaceFirst(temp1, "");
			return temp2+temp1;
		}
		else {
			return "No Can Do";
		}
	}

}
