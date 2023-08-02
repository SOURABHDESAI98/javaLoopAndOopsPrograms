package javaAfternoon.day3;
import java.util.Scanner;

// problem statement- calculate power of given base and power

public class PowerCalculator {

	public static void main(String[] args) {
		   Scanner input = new Scanner(System.in);

	        System.out.println("input number");

	        int number = input.nextInt();

	        System.out.println("input power");

	        int power = input.nextInt();

	        double result = Math.pow(number, power);

	        System.out.println("output is " + result);

	        input.close();

	}

}
