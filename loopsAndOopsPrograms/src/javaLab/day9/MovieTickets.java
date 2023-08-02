package javaLab.day9;

public class MovieTickets {

	private int id;
	private int price;
	static int availableTickets = 25;

	public void setId(int id) {
		this.id = id;

	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setTickets(int tickets) {

		availableTickets = availableTickets - tickets;

	}

	public int getTickets() {

		return availableTickets;

	}

	public int calculatePrice(int tickets) {

		return price * tickets;

	}

}
