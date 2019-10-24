package module2.Str2;

public class StrTools {

	public static void main(String[] args) {
		System.out.println(Tool("apluscompsci.com"));
		System.out.println(Tool("statechamps"));
		System.out.println(Tool("W"));
	}
	
	public static String Tool(String s1) {
		String temp = "";
		
		temp += "Intial String :: " + s1 + "\n";
		
		String temp1 = Character.toString(s1.charAt(0));
		String temp2 = Character.toString(s1.charAt(s1.length()-1));
		temp += "has first last letters ::  " + temp1 + temp2 + "\n";
		
		temp += "has middle letter :: " + s1.charAt((int)Math.floor(s1.length() / 2.0)) + "\n";
		
		temp += "has same first and last letter :: " + temp1.equals(temp2) + "\n";
		
		return temp;
	}

}
