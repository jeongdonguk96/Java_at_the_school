package sec04_abstract_interface.compare1;

interface Example21 {
	void display1();
}

interface Example22 {
	void display2();
}

interface Example23 extends Example21, Example22 {
}

class Example24 implements Example23 {

	@Override
	public void display1() {
		System.out.println("diesplay1 method");
	}

	@Override
	public void display2() {
		System.out.println("diesplay2 method");
	}
	
}


public class InterfaceTest1 {

	public static void main(String[] args) {
		Example24 a = new Example24();
		a.display1();
		a.display2();
	}

}
