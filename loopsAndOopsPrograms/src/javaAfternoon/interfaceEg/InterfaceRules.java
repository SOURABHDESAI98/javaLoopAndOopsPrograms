package javaAfternoon.interfaceEg;

/*
 *interface is same like class ,only instead of class we have to use
   interface keyword
 
 *interface can be public or default
  
 * interface variables are by default public ,static and final
   so it should always assign 
 
 * interface methods are by default public and abstract, you don't need to mention abstract to interface and to it's
  abstract classes
  
 * so when subclass implementing any interface , overriding method
   should use public access modifier
 
 
 * like abstract class,interface object can not be created
  
 * interface can't have constructor so it doesn't have instance variables.
 
 * Methods in interface -
                        1. Abstract methods- must be overridden in non abstract child class
                        2. SFC & Default methods- can'be overridden in child class
 
 * Interface doesn't have methods other than above methods i.e interface doesn't have concrete methods
 
 * Interface can be extended by another interface
 
 * Interface can be implemented by abstract class 

 * In default method default is a keyword, not a access modifier i. e if you haven't mention access modifier
   for default method then it is taken as "public default"
 
 * interface doesn't have a constructor but you can add constructor in it's child classes, 
  it will not show error. Refer ChildClassConstructor.java file in interfaceEg package
 
 
 * */
interface H {

	int a = 10;

	// Interfaces cannot have constructors
	/*
	 * Printable(){
	 * 
	 * }
	 */
	void showMsg();// by default public and abstract
}

class L implements H {

	public void showMsg() {
		System.out.println("printing msg");
	}
}

public class InterfaceRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		L l = new L();
		l.showMsg();

		// Printable p2=new Printable(); //CE-can not create instance
		L l1 = new L();
		l1.showMsg();
	}

}
