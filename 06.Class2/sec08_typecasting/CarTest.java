package sec08_typecasting;

class Car {
	
	void drive() {
		System.out.println("차가 달립니다.");
	}
	
	void stop() {
		System.out.println("차가 멈춥니다.");
	}
	
}

class FireEngine extends Car {
	
	void water() {
		System.out.println("물을 뿌립니다.");
	}
	
}

class Ambulance extends Car {
	
	void siren() {
		System.out.println("사이렌을 울립니다.");
	}
	
}

public class CarTest {

	public static void main(String[] args) {
		
		Car c = null;
		FireEngine fe = new FireEngine();
		fe.drive();
		fe.stop();
		fe.water();
		
		c = fe;
		c.drive();
		c.stop();
		
		
	}

}
