package java_basic;

import java.util.Arrays;

class Student implements Comparable<Student> {
	private String name;
	private int kscor;
	private int escor;
	private int total;

	public Student() {
	}

	public Student(String name, int kscor, int escor) {
		this.name = name;
		this.kscor = kscor;
		this.escor = escor;
		total = kscor + escor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKscor() {
		return kscor;
	}

	public void setKscor(int kscor) {
		this.kscor = kscor;
	}

	public int getEscor() {
		return escor;
	}

	public void setEscor(int escor) {
		this.escor = escor;
	}

	public int getTotal() {
		return kscor + escor;
	}

	@Override
	public int compareTo(Student student) {
		return this.name.compareTo(student.name);
	}

}

public class StudentScore {
	public static void main(String[] args) {
		Student[] students = {
				new Student("홍길동", 60, 75),
				new Student("강호동", 70, 80),
				new Student("유재석", 80, 66),
				new Student("박명수", 90, 100)

		};

		Arrays.sort(students);

		for (int i = 0; i < students.length; i++) {
			int rank = 1;
			for (int j = 0; j < students.length; j++)
				if (students[i].getTotal() < students[j].getTotal()) {
					rank++;
				}
			System.out.println(
					"이름: " + students[i].getName() + 
					"  총점: " + students[i].getTotal() + "점 " 
							+ "순위: " + rank + "등");
		}
	}
}
