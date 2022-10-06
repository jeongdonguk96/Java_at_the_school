package sec03_overriding;

class Car {
	
	public int speedLimit() {
		return 100;
	}
	
}

class Ford extends Car {
	@Override
	public int speedLimit() {
		return 120;
	}
	
}

public class CarTest {

	public static void main(String[] args) {
		
		Car c = new Car();
		System.out.println("c의 speedLimit은 " + c.speedLimit());
		
		Ford f = new Ford();
		System.out.println("f의 speedLimit은 " + f.speedLimit());
		
		int num = 10;
		System.out.println((num>0) ? "양수" : (num<0) ? "음수" : "0");

	}

}
