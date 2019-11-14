package module1.MathMethodLabs;

import static java.lang.System.out;

import java.util.Scanner;

public class DistanceRunner {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		out.print("Enter X1 :: ");
		int x1 = keyboard.nextInt();
		out.print("Enter Y1 :: ");
		int y1 = keyboard.nextInt();
		out.print("Enter X2 :: ");
		int x2 = keyboard.nextInt();
		out.print("Enter Y2 :: ");
		int y2 = keyboard.nextInt();

		System.out.printf("Distance == %.3f", Distance.getDistance(x1, y1, x2, y2));
		keyboard.close();
	}
}

/*
 * 
 * Sample Data : 1 1 2 1 
 * 1 1 -2 2 
 * 1 1 0 0
 * 
 * 
 * 
 * Sample Output : Enter X1 :: 1 Enter Y1 :: 1 Enter X2 :: 2 Enter Y2 :: 1
 * distance == 1.000
 * 
 * 
 * Enter X1 :: 1 Enter Y1 :: 1 Enter X2 :: -2 Enter Y2 :: 2 distance == 3.162
 * 
 * 
 * Enter X1 :: 1 Enter Y1 :: 1 Enter X2 :: 0 Enter Y2 :: 0 distance == 1.414
 * 
 */