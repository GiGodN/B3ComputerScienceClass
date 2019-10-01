package module2.AvgStr;

public class SwitchFirstLetter {

	public static void main(String[] args) {
		System.out.println(sFir("dog", "cats"));
		System.out.println(sFir("aplus", "pigs"));
		System.out.println(sFir("catgiraffe", "apluscompsci"));
		System.out.println(sFir("ap", "aplus"));
		System.out.println(sFir("pluscat", "dogsaplus"));
		System.out.println(sFir("#", "#"));
		System.out.println(sFir("aplusdog#13337#", "pigaplusprogram"));
		System.out.println(sFir("code", "code1234"));
		System.out.println(sFir("wow", "plus"));
		System.out.println(sFir("catsand", "aplusdogsaplus"));
		System.out.println(sFir("7", "77777"));
	}

	private static String sFir(String s1, String s2) {
		char temp1 = s2.charAt(0);
		String temp2 = s1.substring(1);
		return temp1 + temp2;
	}

}
