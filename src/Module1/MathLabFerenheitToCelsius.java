package Module1;

public class MathLabFerenheitToCelsius {

	public static void main(String[] args) {
		System.out.println(ferenheitToCelsius(98.6));
		System.out.println(ferenheitToCelsius(52.30));
		System.out.println(ferenheitToCelsius(82.45));
		System.out.println(ferenheitToCelsius(75.00));
		System.out.println(ferenheitToCelsius(100));
	}
	
	public static String ferenheitToCelsius(double temp1) {
		double temp2 = (temp1 - 32) * 5 / 9;
		return Double.toString(temp2) + " Degrees Celsius";
	}

}
