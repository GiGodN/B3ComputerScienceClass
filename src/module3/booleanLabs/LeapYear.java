package module3.booleanLabs;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println(isLeapYear(1253));
		System.out.println(isLeapYear(209));
		System.out.println(isLeapYear(2131));
		System.out.println(isLeapYear(400));
		System.out.println(isLeapYear(4000));
		System.out.println(isLeapYear(1500));
		System.out.println(isLeapYear(1600));
	}
	
	private static String isLeapYear(int Year) {
		if(Year%400 == 0 || (Year%100 != 0 && Year%4 == 0)) {
			return Year + " is a leap year";
		}
		else {
			return Year + " is NOT a leap year";
		}
	}

}
