package module1.MathMethodLabs;

import static java.lang.System.out;

import java.util.Scanner;

public class QuadraticRunner {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		out.print("Enter a :: ");
		int quadA = keyboard.nextInt();
		out.print("Enter b :: ");
		int quadB = keyboard.nextInt();
		out.print("Enter c :: ");
		int quadC = keyboard.nextInt();

		System.out.println("rootone :: " + Quadratic.getRootOne(quadA, quadB, quadC));
		System.out.println("rootone :: " + Quadratic.getRootTwo(quadA, quadB, quadC));
		keyboard.close();
	}
}

/*
 * 
 * Sample Data : 5 -8 3 3 2 -7 9 6 1
 * 
 * 
 * Sample Output : Enter a :: 5 Enter b :: -8 Enter c :: 3
 * 
 * 
 * rootone :: 1.00 roottwo :: 0.60
 * 
 * 
 * 
 * 
 * Enter a :: 3 Enter b :: 2 Enter c :: -7
 * 
 * 
 * rootone :: 1.23 roottwo :: -1.90
 * 
 * 
 * 
 * 
 * Enter a :: 9 Enter b :: 6 Enter c :: 1
 * 
 * 
 * rootone :: -0.33 roottwo :: -0.33
 * 
 */