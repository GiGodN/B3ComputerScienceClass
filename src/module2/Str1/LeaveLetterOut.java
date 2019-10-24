package module2.Str1;

public class LeaveLetterOut {
	
	public static void main(String[] args) {
		System.out.println(lLO("dog", 1));
		System.out.println(lLO("aplus", 2));
		System.out.println(lLO("catgiraffe", 3));
		System.out.println(lLO("ap", 1));
		System.out.println(lLO("pluscat", 4));
		System.out.println(lLO("aplusdog#13337#", 9));
		System.out.println(lLO("code", 2));
		System.out.println(lLO("wow", 1));
		System.out.println(lLO("catsand", 0));
	}
	
	private static String lLO(String s1, int index) {
		String temp1 = (String) s1.subSequence(0, index);
		String temp2 = (String) s1.subSequence(index + 1, s1.length());
		return temp1 + temp2;
	}

}