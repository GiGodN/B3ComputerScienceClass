package module3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

import gameTest.main.Main;

public class GuessANumber implements Runnable {
	
	static Random rand = new Random();
	static int gNumber = 0;
	static boolean guessTrue = false;
	static Scanner uIn = new Scanner(System.in);
	static int tempNum;
	static boolean run = true;
	private String directory, fileName, absolutePath;
	
	public Thread game;
	
	public void start() {
		game = new Thread(this, "game");
		game.run();
	}
	
	public void init() {
		directory = System.getProperty("user.home");
		fileName = "score.txt";
		absolutePath = directory + File.separator + fileName;
	}
	
	public void run() {
		init();
		GameLoop();
		while(run) {
			gNumber += 1;
			System.out.println("You Guessed Corectly, you guessed " + Integer.toString(tempNum) + " in " + Integer.toString(gNumber) + " guess(s)");
			gNumber = 0;
			System.out.println("Do You want to play again Y/N");
			String usrYN = uIn.nextLine();
			if(usrYN.contains("Y") || usrYN.contains("y")) {
				guessTrue = false;
				GameLoop();
			}
			else {
				System.out.println(readScoreFile());
				run = false;
			}
		}
	}
	
	public void GameLoop() {
		System.out.println("Make Computer Guess (C) or Guess Yourself (Y)");
	    String guess = uIn.nextLine();
	    if(guess.equals("C") || guess.equals("c")) {
	    	System.out.println("Choose a number between 1-100");
		    String usrNumS = uIn.nextLine();
		    int usrNum;
		    try {
		    	usrNum = Integer.parseInt(usrNumS);	
		    }
		    catch (Exception e){
		    	System.out.println("Not a valid Number (Exeption in integer parse)");
		    	GameLoop();
		    	return;
		    }
		    if(usrNum > 100 || usrNum < 0) {
		    	System.out.println("Not a valid Number (Exeption number was greater then 100 or less than 0");
		    	GameLoop();
		    	return;
		    }
	    }
	    else if(guess.equals("Y") || guess.equals("y")) {
			int rNumber = rand.nextInt(101);
			String scoreFileContent = "";
			try {
				scoreFileContent = readScoreFile();
			}
			catch(Exception e) {
				writeScoreFile(50);
				scoreFileContent = readScoreFile();
			}
			int highScore;
			try {
				highScore = Integer.parseInt(scoreFileContent.substring(scoreFileContent.lastIndexOf(": ") + 2).trim());
			}
			catch (StringIndexOutOfBoundsException e) {
				highScore = 0;
			}
			System.out.println("Your High Score is: " + highScore);
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
			    	if(gNumber < highScore)
			    		writeScoreFile(gNumber+1);
			    	guessTrue = true;
			    	tempNum = rNumber;
			    }
			}
	    }
	    else {
	    	System.err.println("invalid input try again");
	    	GameLoop();
	    }
	}
	
	public void writeScoreFile(int n1) {
		directory = System.getProperty("user.home");
		fileName = "score.txt";
		absolutePath = directory + File.separator + fileName;

		// write the content in file 
		try(FileWriter fileWriter = new FileWriter(absolutePath)) {
		    String fileContent = "Good Game(s) your highscore is: " + n1;
		    fileWriter.write(fileContent);
		} catch (IOException e) {
		    // exception handling
		}
	}
	
	public String readScoreFile() {
		// read the content from file
		String fileContent = "";
		try(FileReader fileReader = new FileReader(absolutePath)) {
		    int ch = fileReader.read();
		    while(ch != -1) {
		    	fileContent += Character.toString((char)ch);
		        ch = fileReader.read();
		    }
		} catch (FileNotFoundException e) {
		    writeScoreFile(50);
		} catch (IOException e) {
			writeScoreFile(50);
		}
		return fileContent;
	}
	
	public static void main (String[] args) {
		new GuessANumber().start();
	}
	
}
