package module5.grade;

public class Grades {
	private Grade[] grades;

	public Grades(double[] list) {
		grades = new Grade[list.length];
		for (int i = 0; i < list.length; i++) {
			grades[i] = new Grade(list[i]);
		}
	}

	public void setGrade(int pos, double grade) {
		grades[pos].setGrade(grade);
	}

	public double getSum() {
		double total = 0;
		for (Grade num : grades) {
			total += num.getNumericGrade();
		}
		return total;
	}

	public double getLowGrade() {
		double small = grades[0].getNumericGrade();
		for (Grade num : grades) {
			if (small > num.getNumericGrade()) {
				small = num.getNumericGrade();
			}
		}
		return small;
	}

	public double getHighGrade() {
		double high = grades[0].getNumericGrade();
		for (Grade num : grades) {
			if (high < num.getNumericGrade()) {
				high = num.getNumericGrade();
			}
		}
		return high;
	}

	public int getNumGrades() {
		return grades.length;
	}
	
	public Grade[] getGArr() {
		return grades;
	}

	public String toString() {
		String s = "";
		for (Grade num : grades) {
			s += " " + num.toString();
		}
		return s;
	}
}