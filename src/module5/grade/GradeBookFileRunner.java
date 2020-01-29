package module5.grade;

import static java.lang.System.out;

import java.io.File;
import java.util.Scanner;

public class GradeBookFileRunner {
	public static void main(String args[]) throws Exception {
		out.println("Welcome to the Class Stats program!");

		Scanner file = new Scanner(new File("data/gradebook.dat"));
		String className = file.nextLine();
		int numStudents = file.nextInt();
		file.nextLine();

		Class theClass = new Class(className, numStudents);

		for (int i = 0; i < numStudents; i++) {
			String stuName = file.nextLine();

			int c = file.nextInt();
			file.nextLine();

			double[] g = new double[c];
			for (int x = 0; x < c; x++) {
				g[x] = file.nextDouble();
			}
			file.nextLine();

			theClass.addStudent(i, new Student(stuName, g));
		}

		System.out.println("\n\n" + theClass);

		out.println("Failure List = " + theClass.getFailureList(70));
		out.println("Highest Average = " + theClass.getStudentWithHighestAverage());
		out.println("Lowest Average = " + theClass.getStudentWithLowestAverage());

		out.println("Class average = " + theClass.getClassAverage());
		file.close();
	}
}