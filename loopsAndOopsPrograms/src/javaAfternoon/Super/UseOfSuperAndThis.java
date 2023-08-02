package javaAfternoon.Super;

class Sport {

	String type;
	String players;

	public Sport(String type, String players) {

		this.type = type;
		this.players = players;

	}

	public void sports() {
		System.out.println("It comes under sports category");

	}

}

class Cricket extends Sport {
	int players;

	public Cricket() {

		super("Outdoor", "Depends on Game"); // always call parent's constructor first

	}

	public Cricket(int players) {
		this(); // to call parameterless constructor of Cricket subclass
		this.players = players;

	}

	public void details() {

		System.out.println("Cricket is a " + type + " sport");
		System.out.println(
				"There are " + players + " players in cricket, normally in all sports no. of players " + super.players);
		super.sports(); // to access instance variables and methods of parent in child

	}

}

public class UseOfSuperAndThis {

	public static void main(String[] args) {

		Cricket c1 = new Cricket(11);
		c1.details();

	}

}
