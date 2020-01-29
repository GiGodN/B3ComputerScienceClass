package module5.grade;

public class Class {
	private String name;
	private Student[] studentList;

	public Class(String name, int stuCount) {
		this.name = name;
		this.studentList = new Student[stuCount];
	}

	public void addStudent(int stuNum, Student s) {
		studentList[stuNum] = s;
	}

	public String getClassName() {
		return name;
	}

	public double getStudentAverage(int stuNum) {
		return studentList[stuNum].getAverage();
	}

	public double getStudentAverage(String stuName) {
		for (int i = 0; i < studentList.length; i++) {
			if (studentList[i].getName().equals(stuName)) {
				return studentList[i].getAverage();
			}
		}
		return -1.0;
	}

	public String getStudentName(int stuNum) {
		return studentList[stuNum].getName();
	}

	public double getClassAverage() {
		double avg = 0;
		double total = 0;
		for (int i = 0; i < studentList.length; i++) {
			total += studentList[i].getAverage();
		}
		avg = total / studentList.length;
		return avg;
	}

	public String getStudentWithHighestAverage() {
		Student high = studentList[0];
		for (int i = 0; i < studentList.length; i++) {
			if (high.getAverage() < studentList[i].getAverage()) {
				high = studentList[i];
			}
		}
		return high.getName();
	}

	public String getStudentWithLowestAverage() {
		Student low = studentList[0];
		for (int i = 0; i < studentList.length; i++) {
			if (low.getAverage() > studentList[i].getAverage()) {
				low = studentList[i];
			}
		}
		return low.getName();
	}

	public String getFailureList(double failingGrade) {
		String list = "";
		for (int i = 0; i < studentList.length; i++) {
			if (failingGrade > studentList[i].getAverage()) {
				if (list.equals("")) {
					list = studentList[i].getName();
				} else {
					list += ", " + studentList[i].getName();
				}
			}
		}
		return list;
	}

	public String toString() {
		String s1 = "";
		s1 += name + "\n";
		for (int i = 0; i < studentList.length; i++) {
			s1 += studentList[i].toString() + "\t" + studentList[i].getAverage() + "\n";
		}
		return s1;
	}
}