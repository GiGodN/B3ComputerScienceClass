package module2.AvgStr;

public class AvageStringLength {
	
	public static void main(String[] args) {
		System.out.println(AvgStr("dog", "cats"));
		System.out.println(AvgStr("aplus", "pigs"));
		System.out.println(AvgStr("catgiraffe", "apluscompsci"));
		System.out.println(AvgStr("ap", "aplus"));
		System.out.println(AvgStr("pluscat", "dogsaplus"));
		System.out.println(AvgStr("#", "#"));
		System.out.println(AvgStr("aplusdog#13337#", "pigaplusprogram"));
		System.out.println(AvgStr("code", "code1234"));
		System.out.println(AvgStr("wow", "plus"));
		System.out.println(AvgStr("catsand", "aplusdogsaplus"));
		System.out.println(AvgStr("7", "77777"));
	}
	
	private static double AvgStr(String s1, String s2) {
		double temp1 = s1.length() + s2.length();
		return temp1 / 2;
	}

}
