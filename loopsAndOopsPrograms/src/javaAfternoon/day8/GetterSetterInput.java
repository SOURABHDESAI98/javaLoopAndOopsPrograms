package javaAfternoon.day8;

import java.util.Scanner;

public class GetterSetterInput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Provide model id :");

		int id = sc.nextInt();

		System.out.println("Provide car name :");

		String cname = sc.next();

		System.out.println("Provide speed :");

		int cspeed = sc.nextInt();

		if (cspeed > 200 || cspeed < 0) {

			System.out.println("Please provide speed less than 200");

		}
		sc.close();

		GettersSetterseEncapsulation c1 = new GettersSetterseEncapsulation();
		c1.setId(id);
		c1.setname(cname);
		c1.setspeed(cspeed);

		id = c1.getId();
		cname = c1.getname();
		cspeed = c1.getspeed();

		System.out.println("Car Details :");
		System.out.println("Car Id :" + id);
		System.out.println("Car name :" + cname);
		System.out.println("Car max speed :" + cspeed + "km/hr");

	}

}
