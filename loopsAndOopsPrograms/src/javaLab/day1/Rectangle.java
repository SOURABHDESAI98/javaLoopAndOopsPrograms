package javaLab.day1;

import java.util.Scanner;

// problem statement- find area and perimeter of rectangle 

public class Rectangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("provide length:");

		int length = input.nextInt();

		System.out.println("provide breadth:");

		int breadth = input.nextInt();

		int area = length * breadth;
		int perimeter = 2 * (length + breadth);

		System.out.println("Area of rectangle is " + area + " Perimeter of rectangle is " + perimeter);
		input.close();
	}

}
