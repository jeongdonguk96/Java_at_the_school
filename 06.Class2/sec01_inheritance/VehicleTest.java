package sec01_inheritance;

class Vehicle {
	
	String color;
	int speed;
	int tire;
	
	void attributes() {
		
		System.out.println("Color = " + color);
		System.out.println("Speed = " + speed);
		System.out.println("tire = " + tire);
		
	}
	
}


class Car extends Vehicle {
	
	int engine;
	int gears;
	String model;
	
	void attributesCar() {
		
		System.out.println("차의 Color = " + color);
		System.out.println("차의 Speed = " + speed);
		System.out.println("차의 tire = " + tire);
		System.out.println("차의 engine = " + engine);
		System.out.println("차의 gears = " + gears);
		System.out.println("차의 model = " + model);
		
	}
	
}


public class VehicleTest {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.color = "흰색";
		c1.speed = 120;
		c1.tire = 20;
		
		c1.attributes();
		System.out.println("");
		
		c1.engine = 2000;
		c1.gears = 5;
		c1.model = "소나타";
		
		c1.attributesCar();

	}

}
