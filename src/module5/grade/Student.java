package module5.grade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Student {
	private String myName;
	private Grades myGrades;

	public Student(String myName, double[] myGrades) {
		this.myName = myName;
		this.myGrades = new Grades(myGrades);
	}

	public void setGrade(int spot, double grade) {
		myGrades.setGrade(spot, grade);
	}

	public String getName() {
		return myName;
	}

	public int getNumGrades() {
		return myGrades.getNumGrades();
	}

	public double getSum() {
		return myGrades.getSum();
	}

	public double getAverage() {
		return myGrades.getSum()/myGrades.getNumGrades();
	}

	public double getAverageMinusLow() {
		List<Grade> tempL = new ArrayList<Grade>();
		for (Grade g : myGrades.getGArr()) {
			tempL.add(g);
		}
		System.out.println(tempL.remove(myGrades.getLowGrade()));
		double[] tempA = new double[tempL.size()];
		for (int i = 0; i < tempL.size(); i++) {
			tempA[i] = tempL.get(i).getNumericGrade();
		}
		Grades tempG = new Grades(tempA);
		return tempG.getSum()/tempG.getNumGrades();
	}

	public double getHighGrade() {
		return myGrades.getHighGrade();
	}

	public double getLowGrade() {
		return myGrades.getLowGrade();
	}

	public String toString() {
		return myName + " = " + myGrades.toString();
	}
}