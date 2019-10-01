package module1;

import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
	
	static Random rand = new Random();
	static int gNumber = 0;
	static boolean guessTrue = false;
	static Scanner uIn = new Scanner(System.in);
	static int tempNum;
	static boolean run = true;
	
	public static void main (String[] args) {
		GameLoop();
		while(run) {
			gNumber += 1;
			System.out.println("You Guess Corectly, you guess " + Integer.toString(getTemp()) + " in " + Integer.toString(gNumber) + " guess(s)");
			gNumber = 0;
			System.out.println("Do You want to play again Y/N");
			String usrYN = uIn.nextLine();
			if(usrYN.contains("Y") || usrYN.contains("y")) {
				guessTrue = false;
				GameLoop();
			}
			else {
				System.out.println("Good Game(s) your highscore is: 'placeholder'");
				run = false;
			}
		}
	}
	
	public static void GameLoop() {
		int rNumber = rand.nextInt(101);
		System.out.println(rNumber);
		while(!guessTrue) {
		    System.out.println("Guess a number 1-100, Number of Guesses: " + gNumber);
		    String usrNumS = uIn.nextLine();
		    int usrNum = 0;
		    try {
		    	usrNum = Integer.parseInt(usrNumS);	
		    }
		    catch (Exception e){
		    	System.out.println("Not a valid Number (Exeption in integer parse)");
		    	continue;
		    }
		    if(usrNum > 100 || usrNum < 0) {
		    	System.out.println("Not a valid Number (Exeption number was greater then 100 or less than 0");
		    	continue;
		    }
		    if(usrNum > rNumber) {
		    	System.out.println("Your Guess Was Too High");
		    	gNumber += 1;
		    }
		    else if(usrNum < rNumber) {
		    	System.out.println("Your Guess Was Too Low");
		    	gNumber += 1;
		    }
		    else {
		    	guessTrue = true;
		    	setTemp(rNumber);
		    }
		}
	}
	
	public static void setTemp(int temp) {
		tempNum = temp;
	}
	
	public static int getTemp() {
		return tempNum;
	}
	
}
