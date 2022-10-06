package sec01_inheritance_feature;
class Vehicle {
	
	private String color;
	private int speed;
	private int tire;
	
	public String getColor() {
		return color;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public int getTire() {
		return tire;
	}
	
	public void setColor(String color) {
		this.color = color; 
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void setTire(int tire) {
		this.tire = tire;
	}
	
	
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
		
		System.out.println("차의 Color = " + getColor());
		System.out.println("차의 Speed = " + getSpeed());
		System.out.println("차의 tire = " + getTire());
		System.out.println("차의 engine = " + engine);
		System.out.println("차의 gears = " + gears);
		System.out.println("차의 model = " + model);
		
	}
	
}


public class VehicleTest2 {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.setColor("White");
		c1.setSpeed(120);
		c1.setTire(20);
		
		c1.attributes();
		System.out.println("");
		
		c1.engine = 2000;
		c1.gears = 5;
		c1.model = "소나타";
		
		c1.attributesCar();

	}

}
