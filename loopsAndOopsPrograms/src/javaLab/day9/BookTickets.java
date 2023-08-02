package javaLab.day9;

import java.util.Scanner;

public class BookTickets {

	public static void main(String[] args) {

		MovieTickets m1 = new MovieTickets();
		Scanner sc = new Scanner(System.in);
		int t = MovieTickets.availableTickets;

		for (int i = 1; t > 0; i++) {

			System.out.println("Provide number of tickets you want to book :");
			int tickets = sc.nextInt();

			System.out.println("Provide ticket ID :");
			int id = sc.nextInt();

			System.out.println("Price of ticket :");
			int price = sc.nextInt();

			m1.setId(id);
			m1.setPrice(price);
			// m1.setTickets(tickets);
			MovieTickets.availableTickets = MovieTickets.availableTickets - tickets;
			t = MovieTickets.availableTickets;

			System.out.println("Your " + tickets + " tickets with id " + id + " are booked !!");
			System.out.println("Total price of tickets is :" + m1.calculatePrice(tickets) + " Rs.");
			System.out.println("Availabe tickets are :" + t);
			System.out.println();
		}

		sc.close();

	}

}
