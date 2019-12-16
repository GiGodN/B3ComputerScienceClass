package module3.booleanLabs;

public class BigStr {

	public static void main(String[] args) {
		System.out.println(compair("abc", "cba", "bca"));
		System.out.println(compair("one", "fourteen", "twenty"));
		System.out.println(compair("124323", "20009", "3434"));
		System.out.println(compair("abcde", "ABCDE", "1234234324"));
	}
	
	private static String compair(String s1, String s2, String s3) {
		if ((s1.compareTo(s2) > s2.compareTo(s1)) && (s1.compareTo(s3) > s3.compareTo(s1))) {
			return "Biggest = " + s1;
		}
		else if ((s2.compareTo(s1) > s1.compareTo(s2)) && (s2.compareTo(s3) > s3.compareTo(s2))) {
			return "Biggest = " + s2;
		}
		else {
			return "Biggest = " + s3;
		}
	}
	
}
