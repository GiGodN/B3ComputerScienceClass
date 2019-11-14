package module3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

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
	}

	public void run() {
		init();
		GameLoop();
		while (run) {
			System.out.println("Do You want to play again Y/N");
			String usrYN = uIn.nextLine();
			if (usrYN.contains("Y") || usrYN.contains("y")) {
				guessTrue = false;
				GameLoop();
			} else {
				System.out.println(readScoreFile('c'));
				System.out.println(readScoreFile('p'));
				run = false;
			}
		}
	}

	public void GameLoop() {
		System.out.println("Make Computer Guess (C) or Guess Yourself (Y)");
		String guess = uIn.nextLine();
		if (guess.equals("C") || guess.equals("c")) {
			String scoreFileContent = "";
			try {
				scoreFileContent = readScoreFile('c');
			} catch (Exception e) {
				writeScoreFile("; Highes amout of tries it tool the computer to guess last time: " + 0, 'c', "default");
				scoreFileContent = readScoreFile('c');
			}
			int highScore;
			try {
				highScore = Integer.parseInt(scoreFileContent.substring(scoreFileContent.lastIndexOf(": ") + 2).trim());
			} catch (StringIndexOutOfBoundsException e) {
				highScore = 0;
			}
			System.out.println("Choose a number between 1-100");
			String usrNumS = uIn.nextLine();
			int usrNum;
			try {
				usrNum = Integer.parseInt(usrNumS);
			} catch (Exception e) {
				System.err.println("Not a valid Number (Exeption in integer parse)");
				GameLoop();
				return;
			}
			if (usrNum > 100 || usrNum < 0) {
				System.err.println("Not a valid Number (Exeption number was greater then 100 or less than 0");
				GameLoop();
				return;
			}
			int[] arr = new int[101];
			for (int i = 1; i <= 100; i++) {
				arr[i] = i;
			}
			int[] seachArr = search(arr, 1, 100, usrNum, 0);
			if (seachArr == null) {
				System.err.println("Error with computer guessing sheme please try again");
				GameLoop();
				return;
			}
			System.out.println("Computer took " + seachArr[1] + " guesss(es) to find your number");
			if (seachArr[1] >= highScore) {
				System.out.println("New high score: " + seachArr[1] + ", whats your name?");
				String name = uIn.nextLine();
				writeScoreFile("; Highes amout of tries it tool the computer to guess last time: " + seachArr[1], 'c', name);
			}
		} else if (guess.equals("Y") || guess.equals("y")) {
			int rNumber = rand.nextInt(101);
			String scoreFileContent = "";
			try {
				scoreFileContent = readScoreFile('p');
			} catch (Exception e) {
				writeScoreFile(" lowest number of guesses: " + 50, 'p', "default");
				scoreFileContent = readScoreFile('p');
			}
			int highScore;
			try {
				highScore = Integer.parseInt(scoreFileContent.substring(scoreFileContent.lastIndexOf(": ") + 2).trim());
			} catch (StringIndexOutOfBoundsException e) {
				highScore = 50;
			}
			System.out.println(scoreFileContent);
			while (!guessTrue) {
				System.out.println("Guess a number 1-100, Number of Guesses: " + gNumber);
				String usrNumS = uIn.nextLine();
				int usrNum = 0;
				try {
					usrNum = Integer.parseInt(usrNumS);
				} catch (Exception e) {
					System.err.println("Not a valid Number (Exeption in integer parse)");
					continue;
				}
				if (usrNum > 100 || usrNum < 0) {
					System.err.println("Not a valid Number (Exeption number was greater then 100 or less than 0");
					continue;
				}
				if (usrNum > rNumber) {
					System.out.println("Your Guess Was Too High");
					gNumber += 1;
				} else if (usrNum < rNumber) {
					System.out.println("Your Guess Was Too Low");
					gNumber += 1;
				} else {
					gNumber += 1;
					System.out.println("You Guessed Corectly, you guessed " + rNumber + " in "
							+ Integer.toString(gNumber) + " guess(s)");
					if (gNumber < highScore) {
						System.out.println("New high score: " + gNumber + ", whats your name?");
						String name = uIn.nextLine();
						writeScoreFile(" lowest number of guesses: " + (gNumber), 'p', name);
					}
					gNumber = 0;
					guessTrue = true;
					tempNum = rNumber;
				}
			}
		} else {
			System.err.println("invalid input try again");
			GameLoop();
		}
	}

	public void writeScoreFile(String s1, char c, String name) {
		directory = System.getProperty("user.home");
		fileName = "score" + c + ".txt";
		absolutePath = directory + File.separator + fileName;

		// write the content in file
		try (FileWriter fileWriter = new FileWriter(absolutePath)) {
			String fileContent = name + s1;
			fileWriter.write(fileContent);
		} catch (IOException e) {
			// exception handling
		}
	}

	public String readScoreFile(char c) {
		directory = System.getProperty("user.home");
		fileName = "score" + c + ".txt";
		absolutePath = directory + File.separator + fileName;
		// read the content from file
		String fileContent = "";
		try (FileReader fileReader = new FileReader(absolutePath)) {
			int ch = fileReader.read();
			while (ch != -1) {
				fileContent += Character.toString((char) ch);
				ch = fileReader.read();
			}
		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}
		return fileContent;
	}

	public static int[] search(int arr[], int first, int last, int key, int recusions) {
		if (last >= first) {
			int mid = first + (last - first) / 2;
			System.out.println("My Guess is: " + mid + ", Number of Guesses: " + (recusions + 1));
			if (arr[mid] == key) {
				int[] temp = { mid, recusions + 1 };
				return temp;
			}
			if (arr[mid] > key) {
				System.out.println("My guess was to high");
				return search(arr, first, mid - 1, key, recusions + 1);// search in left subarray
			} else {
				System.out.println("My guess was to low");
				return search(arr, mid + 1, last, key, recusions + 1);// search in right subarray
			}
		}
		return null;
	}

	public static void main(String[] args) {
		new GuessANumber().start();
	}

}
