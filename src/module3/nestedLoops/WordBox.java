package module3.nestedLoops;

public class WordBox {

	public static void main(String[] args) {
		System.out.println(Box("SQUARE") + "\n");
		System.out.println(Box("BOX") + "\n");
		System.out.println(Box("A") + "\n");
		System.out.println(Box("IT") + "\n");
		System.out.println(Box("TOAD") + "\n");
	}

	private static String Box(String s1) {
		char[] ca1 = s1.toCharArray();
		String box = "";
		for (int y = 0; y < s1.length(); y++) {
			for (int x = 0; x < s1.length(); x++) {
				if (y == 0) {
					box += ca1[x];
				} 
				else if (y == s1.length() - 1) {
					box += ca1[s1.length() - 1 - x];
				} 
				else {
					if (x == 0) {
						box += ca1[y];
					} 
					else if (x == s1.length() - 1) {
						box += ca1[s1.length() - 1 - y];
					} 
					else {
						box += " ";
					}
				}
			}
			box += "\n";
		}
		return box;
	}

}
