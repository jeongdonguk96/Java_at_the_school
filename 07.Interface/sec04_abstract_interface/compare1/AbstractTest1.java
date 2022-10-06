package sec04_abstract_interface.compare1;

class Example11 {
	public void display1() {
		System.out.println("display1 method");
	}
}

abstract class Example12 {
	public void display2() {
		System.out.println("display2 method");
	}
}

abstract class Example13 extends Example11 {
	abstract void display2();
}

class Example14 extends Example12 {
	public void display3() {
		System.out.println("display3 method");
	}
}


public class AbstractTest1 {
	
	public static void main(String[] args) {
		
		Example14 a = new Example14();
		a.display3();
		a.display2();
		
	}

}
