package module2.Str3;

public class WordFun {

	public static void main(String[] args) {
		System.out.println(fun("Hello World"));
		System.out.println(fun("Jim Bob"));
		System.out.println(fun("Computer Science"));
		System.out.println(fun("UIL TCEA"));
		System.out.println(fun("State Champion"));
	}
	
	private static String fun(String s1) {
		String temp1 = s1;
		temp1 += "\n" + s1.toUpperCase();
		temp1 += "\n" + s1.replace(' ', '-');
		return temp1;
	}

}
