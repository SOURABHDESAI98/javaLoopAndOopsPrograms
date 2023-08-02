package javaAfternoon.interfaceEg;

interface language {
	void showName(String name);
}

class ProgrammingLangauge implements language {

	ProgrammingLangauge() {

	}

	@Override
	public void showName(String name) {

		System.out.println("Programming langauge Name:" + name);
	}

}

class CommunicationLangauge implements language {

	@Override
	public void showName(String name) {

		System.out.println("Communication language Name:" + name);
	}

}

public class TestInterfaceDemo2 {

	public static void main(String[] args) {

		language ob;

		ob = new ProgrammingLangauge();
		ob.showName("java");

		ob = new CommunicationLangauge();
		ob.showName("english");
	}

}
