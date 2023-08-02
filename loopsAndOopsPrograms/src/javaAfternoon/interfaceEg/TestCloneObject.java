package javaAfternoon.interfaceEg;
//cloneable

class Employee implements Cloneable {
	int eid;
	String ename;
	double esal;

	Employee(int eid, String ename, double esal) {
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}

	@Override
	public String toString() {
		return "Employee eid=" + eid + ", ename=" + ename + ", esal=" + esal;
	}

//	protected Object clone() {
	// return super.clone();
//	}

}

public class TestCloneObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(101, "rahul", 45000);
		// Employee e2=e1;

		// System.out.println(e1);
		// System.out.println(e2);
		// System.out.println(e1.equals(e2));
		// Employee e2 = (Employee) e1.clone();
	}

}
