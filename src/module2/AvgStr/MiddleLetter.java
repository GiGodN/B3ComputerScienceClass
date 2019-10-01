package module2.AvgStr;

public class MiddleLetter {

	public static void main(String[] args) {
		System.out.println(midLet("dog"));
		System.out.println(midLet("aplus"));
		System.out.println(midLet("catgirrafe"));
		System.out.println(midLet("ap"));
		System.out.println(midLet("pluscat"));
		System.out.println(midLet("aplusdog#13337#"));
		System.out.println(midLet("code"));
		System.out.println(midLet("wow"));
		System.out.println(midLet("catsand"));
	}
	
	private static char midLet(String s1) {
		int temp1 = (int)Math.floor(s1.length() / 2.0);
		return s1.charAt(temp1);
	}

}
