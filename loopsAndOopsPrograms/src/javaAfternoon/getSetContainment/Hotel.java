package javaAfternoon.getSetContainment;

class Item {

	int iId;
	String iName;
	int price;

	public Item(int iId, String iName, int price) {
		this.iId = iId;
		this.iName = iName;
		this.price = price;

	}

	public String toString() {
		return iId + " " + iName + "=>" + "price :" + price + " Rs.";
	}

}

class Menu {

	int mId;
	String mName;
	Item i1;

	public Menu(int mId, String mName, Item i1) {

		this.mId = mId;
		this.mName = mName;
		this.i1 = i1;

	}

	public String toString() {

		return mId + " " + mName + "=> " + i1;

	}

}

public class Hotel {

	int id;
	String name;
	Menu m1;

	public Hotel(int id, String name, Menu m1) {
		this.id = id;
		this.name = name;
		this.m1 = m1;

	}

	public String toString() {

		return id + " " + name + "=>" + m1;
	}

	public static void main(String[] args) {

		Hotel h = new Hotel(1, "Signature", new Menu(11, "Indian", new Item(111, "Paneer chilli", 150)));
		System.out.println(h);

	}

}
