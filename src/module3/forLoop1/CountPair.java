package module3.forLoop1;

public class CountPair {

	public static void main(String[] args) {
		System.out.println(pairs("ddogccatppig"));
		System.out.println(pairs("dogcatpig"));
		System.out.println(pairs("xxyyzz"));
		System.out.println(pairs("a"));
		System.out.println(pairs("abc"));
		System.out.println(pairs("aabb"));
		System.out.println(pairs("dogcatpigaabbcc"));
		System.out.println(pairs("aabbccdogcatpig"));
		System.out.println(pairs("dogabbcccatpig"));
		System.out.println(pairs("aaaa"));
		System.out.println(pairs("AAAAAAAAA"));
	}

	private static int pairs(String s1) {
		int total = 0;
		if (s1.length() > 1) {
			for (int i = 0; i < s1.length() - 1; i++) {
				if (s1.charAt(i) == s1.charAt(i + 1)) {
					total++;
				}
			}
		}
		return total;
	}

}
