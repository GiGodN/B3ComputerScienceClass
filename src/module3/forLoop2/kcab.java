package module3.forLoop2;

public class kcab {

	public static void main(String[] args) {
		System.out.println(back("Hello"));
		System.out.println(back("World"));
		System.out.println(back("JukeBox"));
		System.out.println(back("TCEA"));
		System.out.println(back("UIL"));
	}

	private static String back(String s1) {
		String results = "";
		char[] arr = s1.toCharArray();
		results += arr[0] + "\n";
		results += arr[s1.length()-1] + "\n";
		String revTemp = "\n";
		for (char c : arr) {
			revTemp = c + revTemp;
		}
		results += revTemp;
		for (char c : arr) {
			results += Character.toString(c);
		}
		results += "\n";
		return results;
	}

}
