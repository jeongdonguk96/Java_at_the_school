package sec07_polymorphism;

class Shape {
	
	void draw() {
		System.out.println("도형을 그립니다.");
	}
	
}

class Rectangle extends Shape{
	
	void draw() {
		System.out.println("사각형을 그립니다.");
	}
	
	void getArea() {
		System.out.println("사각형의 면적을 계산합니다.");
	}
	
}



public class ShapeTest {

	public static void main(String[] args) {
		
		Shape s = null;
		Shape s1 = new Rectangle();
		Rectangle r = new Rectangle();

		s1.draw();
		r.draw();
		r.getArea();
		
	}

}
