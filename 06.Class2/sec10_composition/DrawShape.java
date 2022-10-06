package sec10_composition;

class Shape {
	String color = "검정";
	
	void draw() {
		System.out.printf("%s색으로 도형을 그립니다.\n", color);
	}
}

class Point {
	int x;
	int y;
	
	public Point() {
		this(0, 0);
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	String getXY() {
		return "(" + x + ", " + y + ")";
	}
}

class Circle extends Shape {
	Point center;
	int r;
	
	// 원점:(0, 0), 반지름:100
	public Circle() {
		this(new Point(0,0), 100);
	}
	
	public Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}
	
	void draw() {
		System.out.printf("원을 그립니다. [center=(%d, %d), r=%d, color=%s]\n", center.x, center.y, r, color);
	}
}

class Triangle extends Shape {
	Point[] p = new Point[3];
	
	Triangle(Point[] p) {
		this.p = p;
	}
	
	void draw() {
		System.out.printf("삼각형을 그립니다: [p1=%s, p2=%s, p3=%s]\n", p[0].getXY(), p[1].getXY(), p[2].getXY());
	}
}

public class DrawShape {

	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		Circle c2 = new Circle(new Point(20, 30), 50);
		c1.draw();
		c2.draw();
		
		// Point[] p1 = new Point[3]; // 아래와 동일
		// p1[0] = new Point(100, 100);
		// p1[1] = new Point(50, 50);
		// p1[2] = new Point(150, 50);

		Point[] p = {				  // 배열을 먼저 선언해줘야 아래서 객체생성 가능
				new Point(100, 100),
				new Point(50, 50),
				new Point(150, 50)
		};
		Triangle t1 = new Triangle(p);
		t1.draw();
		
	}

}
