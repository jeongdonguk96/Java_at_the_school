package exercise;

class Circle {
	double radius = 1.0;
	String color = "red";
}

class Circle2 {
	double radius;
	String color;
	
	Circle2(){}
	
	Circle2(double radius){
		this.radius = radius;
	}
	
	Circle2(String color){
		this.color = color;
	}
	
	Circle2(String color, double radius){
		this.color = color;
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return radius*radius*3.14;
	}
	
	public String toString() {
		return "Circle2 [color = " + color + " & radius = " + radius + "]";
	}
	
}


public class CircleTest {

	public static void main(String[] args) {
		
		Circle c1 = new Circle(); // red 1.0 출력
		Circle2 c2 = new Circle2(); // null 0.0 출력
		Circle2 c3 = new Circle2(3.0); // null 3.0 출력
		Circle2 c4 = new Circle2("red", 5.0); // red 5.0 출력 
		Circle2 c5 = new Circle2("blue", 4.0);
		
		System.out.println(c1.color + "\n" + c1.radius + "\n");
		System.out.println(c2.color + "\n" + c2.radius + "\n");
		System.out.println(c3.color + "\n" + c3.radius + "\n" + c3.getRadius() + "\n" + c3.getArea() + "\n");		
		System.out.println(c4.color + "\n" + c4.radius + "\n" + c4.getRadius() + "\n" + c4.getArea() + "\n");
		System.out.println(c5.toString());
		System.out.println("c5.toString()의 내용 = " + c5);
		System.out.println(c5);
		
	}

}
