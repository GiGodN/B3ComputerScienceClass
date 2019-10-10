package module2.Ifs1;

public class discount {

	public static void main(String[] args) {
		System.out.println(dPrice(500));
		System.out.println(dPrice(2500));
		System.out.println(dPrice(4000));
		System.out.println(dPrice(333.33));
		System.out.println(dPrice(95874.2154));
	}

	public static String dPrice(double n1) {
		double n2 = n1;
		if (n1 > 2000) {
			n2 = n1 * .85;
		}
		return "Original Bill amount: " + String.format("%.2f", n1) + "\nAmount after Discount: " + String.format("%.2f", n2) + "\n";
	}

}
