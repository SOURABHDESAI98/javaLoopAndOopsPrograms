package javaAfternoon.overriding;

class Human {

	private String name;
	private String gender;
	private String elder;
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getElder() {
		return elder;
	}

	public void setElder(String elder) {
		this.elder = elder;
	}

	public String getName() {
		return name;
	}

	public void findElder(int a, int b) {
		elder = a > b ? "Man" : "Woman";

		System.out.println(elder + " is older");

	}

}

class Man extends Human {

	Man(String name, String gender) {

	}

}

class Woman extends Human {

	Woman(String name, String gender) {

	}

}

public class Assignment3 {

	public static void main(String[] args) {

		Man m1 = new Man("John", "Male");

		m1.setAge(25);

		Woman w1 = new Woman("Nita", "Female");
		w1.setAge(30);

		w1.findElder(m1.getAge(), w1.getAge());

		Human h = new Human();
		h.findElder(0, 0);
		new Human().findElder(m1.getAge(), w1.getAge());
	}

}
