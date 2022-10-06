package exercise;

class Rectangle {
	
	float length = 1.0f;
	float width = 1.0f;
	
	public Rectangle(){}

	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}
	
	public float getLength() {
		return length;
	}
	
	public void setLength(float length) {
		this.length = length;
	}
	
	public float getWidth() {
		return width;
	}
	
	public void setWidth(float width) {
		this.width = width;
	}
	
	public float getArea() {
		return length*width;
	}
	
	public float getPerimeter() {
		return (length+width)*2;
	}
	
	public String toString() {
		return "Rectangle[length = " + length + ", width = " + width + "]";
	}
	
}

public class RectangleTest {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(2, 2);
		Rectangle r3 = new Rectangle(3, 3);
		Rectangle r4 = new Rectangle(4, 4);

		System.out.println("r1의 length는 " + r1.length + ", width는 " + r1.width);
		System.out.println("r2의 length는 " + r2.getLength() + ", width는 " + r2.getWidth());
		System.out.println("r3의 length는 " + r3.getLength() + ", width는 " + r3.getWidth() + ", Area는 " + r3.getArea() + ", Periment는 " + r3.getPerimeter());
		System.out.println("r4.toString은 " + r4.toString());
		System.out.println("r4는 " + r4);
		
	}

}
