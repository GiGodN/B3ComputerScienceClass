package module2.Ifs2;

public class FirstLetter {

	public static void main(String[] args) {
		System.out.println(first("dog#cat#pigaplus"));
		System.out.println(first("pigs#apluscompsci#food"));
		System.out.println(first("a"));
		System.out.println(first("aplus"));
		System.out.println(first("01234567890"));
		System.out.println(first("abcdefghijklmnopqrstuvwxyz"));
		System.out.println(first("code#H00P#code1234"));
		System.out.println(first("##wowgira77##eplus"));
		System.out.println(first("catsandaplusdogsaplus###"));
		System.out.println(first("7"));
	}

	private static String first(String s1) {
		char temp1 = s1.charAt(0);
		if (s1.indexOf(temp1) != s1.lastIndexOf(temp1)) {
			return "yes";
		} else {
			return "no";
		}
	}

}

/*
 * dog#cat#pigaplus
 * 
 * pigs#apluscompsci#food
 * 
 * a
 * 
 * aplus
 * 
 * 01234567890
 * 
 * abcdefghijklmnopqrstuvwxyz
 * 
 * code#H00P#code1234
 * 
 * ##wowgira77##eplus
 * 
 * catsandaplusdogsaplus###
 * 
 * 7
 */
