package module2.Ifs;

public class SSValidator {

	public static void main(String[] args) {
		System.out.println(validate("463-44-5678"));
		System.out.println(validate("46-144-5678"));
		System.out.println(validate("111-44-5678"));
		System.out.println(validate("463044-5678"));
		System.out.println(validate("463-99-8888"));
		System.out.println(validate("123-11-5323"));
		System.out.println(validate("463-4-55678"));
		System.out.println(validate("46314415678"));
	}

	private static String validate(String s1) {
		if (s1.indexOf('-') == 3 && s1.lastIndexOf('-') == 6) {
			return s1.substring(7, s1.length());
		}
		return "bad";
	}

}

/*
 * 463-44-5678
 * 
 * 46-144-5678
 * 
 * 111-44-5678
 * 
 * 463044-5678
 * 
 * 463-99-8888
 * 
 * 123-11-5323
 * 
 * 463-4-55678
 * 
 * 46314415678
 */
