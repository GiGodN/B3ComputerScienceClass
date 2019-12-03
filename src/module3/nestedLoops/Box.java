package module3.nestedLoops;

public class Box {

	public static void main(String[] args) {
		System.out.println(genBox(3) + "\n");
		System.out.println(genBox(4) + "\n");
		System.out.println(genBox(5) + "\n");
		System.out.println(genBox(2) + "\n");
		System.out.println(genBox(1) + "\n");
	}
	
	private static String genBox(int n1) {
		String box = "";
		for (int y = 0; y < n1; y++) {
			for (int x = 0; x <= n1; x++) {
				if (x <= n1 - y - 1) box += "*";
				else box += "#";
			}
			box += "\n";
		}
		return box;
	}

}
