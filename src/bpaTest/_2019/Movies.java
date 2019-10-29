package bpaTest._2019;

//a contestant number here
import java.util.Scanner;

public class Movies {

	public static void main(String[] args) {
		// number of movies as stated by users
		int numMov;
		// array for the ratings of websites
		int[] webScr = new int[3];

		// array for the focus group ratings
		double[] focScr = new double[2];
		// average rating for websites
		double avgWeb;
		// average rating for focus groups
		double avgFoc;
		// randomized critic rating
		double critScr = Math.random() * 100;

		// create and initialize the scanner
		Scanner key = new Scanner(System.in);

		// ask user for number of movies store to the variable numMov and handle
		// exceptions
		System.out.println("How many movies are you rating?");
		try {
			numMov = key.nextInt();
		} catch (Exception e) {
			System.out.println("Inncorrect data entered");
			numMov = 0;
		}

		// handle all movies
		for (int i = 0; i < numMov; i++) {
			// ask user for website ratings, store to the variable webScr and handle
			// exceptions
			System.out.println("Please enter ratings from the movie review website for movie #" + (i + 1));
			for (int a = 0; a < 3; a++) {
				try {
					webScr[a] = key.nextInt();
				} catch (Exception e) {
					System.out.println("Inncorrect data entered");
					break;
				}
			}

			// ask user for focus group ratings, store to the variable focScr and handle
			// exceptions
			System.out.println("Please enter ratings from the focus group for movie #" + (i + 1));
			for (int a = 0; a < 2; a++) {
				try {
					focScr[a] = key.nextDouble();
				} catch (Exception e) {
					System.out.println("Inncorrect data entered");
					break;
				}
			}

			// calculate average ratings
			avgWeb = average(webScr);
			avgFoc = average(focScr);

			// print average ratings
			System.out.println("Ratings for movie #" + (i + 1));
			System.out.printf("Average website rating: %.2f \n", avgWeb);
			System.out.printf("Average focus group rating: %.2f \n", avgFoc);
			System.out.printf("Average movie criticrating: %.2f \n", critScr);
			System.out.printf("Overall movie rating: %.2f \n", average(avgWeb, .2, avgFoc, .3, critScr, .5));
		}
	}

	// Average for integer array
	// a1 is the array of integers
	private static double average(int[] a1) {
		double temp1 = 0;
		for (int i = 0; i < a1.length; i++) {
			temp1 += a1[i];
		}
		return temp1 / a1.length;
	}

	// Average for double array
	// a1 is the array of doubles
	private static double average(double[] a1) {
		double temp1 = 0;
		for (int i = 0; i < a1.length; i++) {
			temp1 += a1[i];
		}
		return temp1 / a1.length;
	}

	// Weighted average of three numbers
	// d1, d2, d2 are numbers
	// p1, p2, p3 are the weights
	private static double average(double d1, double p1, double d2, double p2, double d3, double p3) {
		return d1 * p1 + d2 * p2 + d3 * p3;
	}

}
