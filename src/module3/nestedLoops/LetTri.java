package module3.nestedLoops;

public class LetTri {

	public static void main(String[] args) {
		System.out.println(make('C', 4) + "\n");
		System.out.println(make('A', 5) + "\n");
		System.out.println(make('B', 7) + "\n");
		System.out.println(make('X', 6) + "\n");
		System.out.println(make('Z', 8) + "\n");
	}

	private static String make(char c1, int n1) {
		String Tri = "";
		char c2 = c1;
		for (int y = 0; y < n1; y++) {
			for (int x1 = 0; x1 < n1 - y; x1++) {
				for (int x2 = 0; x2 < n1 - x1; x2++) {
					Tri += Character.toString(c1);
				}
				if (c1 < 'Z') {
					c1 += 1;
				} else
					c1 -= 25;
				Tri += "   ";
			}
			c1 = c2;
			Tri += "\n";
		}
		return Tri;
	}

}

/*
 * C 4
 * 
 * A 5
 * 
 * B 7
 * 
 * X 6
 * 
 * Z 8
 */
