package module8.Enum1;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String myName;
	private Grades myGrades;
	
	private Classes year;
	
	public Student(String myName, double[] myGrades, Classes year) {
		this.myName = myName;
		this.myGrades = new Grades(myGrades);
		this.year = year;
	}

	public void setGrade(int spot, double grade) {
		myGrades.setGrade(spot, grade);
	}

	public String getName() {
		return myName;
	}
	
	public void setYear(Classes year) {
		this.year = year;
	}
	
	public String getYear() {
		return year.toString();
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
		List<Double> tempL = new ArrayList<Double>();
		for (Grade g : myGrades.getGArr()) {
			tempL.add(g.getNumericGrade());
		}tempL.remove(myGrades.getLowGrade());
		Grades tempG = new Grades(new double[tempL.size()]);
		for (int i = 0; i < tempL.size(); i++) {
			tempG.setGrade(i, tempL.get(i).doubleValue());
		}
		return tempG.getSum()/tempG.getNumGrades();
	}

	public double getHighGrade() {
		return myGrades.getHighGrade();
	}

	public double getLowGrade() {
		return myGrades.getLowGrade();
	}

	public String toString() {
		return "Name: " + myName + ", Class: " + year.toString() + " = " + myGrades.toString();
	}
}