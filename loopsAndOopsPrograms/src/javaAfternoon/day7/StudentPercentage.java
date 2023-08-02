package javaAfternoon.day7;

import java.util.Scanner;

public class StudentPercentage {

	int id;
	String name;
	int science;
	int socialScience;
	int geography;
	double percentage;
	char grade;

	public void assignData(int a, String name, int c, int d, int f) {
		id = a;
		this.name = name;
		science = c;
		socialScience = d;
		geography = f;

		calculate();

	}

	public void calculate() {

		percentage = (science + socialScience + geography) / 3;

		if (percentage <= 50) {

			grade = 'C';

		} else if (percentage <= 75) {

			grade = 'B';
		} else {
			grade = 'A';
		}

		display(id, name, percentage, grade);

	}

	public void display(int a, String b, double c, char d) {

		System.out.println("Student Details :");
		System.out.println("ID :" + a);
		System.out.println("Name :" + b);
		System.out.println("Percentage :" + c);
		System.out.println("Grade :" + d);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("provide student name :");
		String studName = sc.next();
		System.out.println("Provide student id :");
		int studId = sc.nextInt();
		System.out.println("Provide marks obtained in science :");
		int sci = sc.nextInt();
		System.out.println("Provide marks obtained in social science :");
		int ss = sc.nextInt();
		System.out.println("Provide marks obtained in geography :");
		int geo = sc.nextInt();
		sc.close();

		StudentPercentage stud1 = new StudentPercentage();
		stud1.assignData(studId, studName, sci, ss, geo);

	}

}
