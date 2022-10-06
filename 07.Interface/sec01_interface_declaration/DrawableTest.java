package sec01_interface_declaration;

interface Drawable {
	int red = 1;
	int green = 2;
	int blue  = 3;
	int black = 4;
	int white = 5;
	
	// 정수형을 문자로 불러내는 방법. 문자열배열을 만들어서 인덱스자리에 정수형을 넣기
	String[] colorname = {
			"null", "red",
			"green", "blue",
			"black", "white"
	};
	
	
	void draw(int color);
}


class Circle implements Drawable {
	private int x;
	private int y;
	private double radius;
	
	public Circle(int x, int y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	@Override
	public void draw(int color) {
		System.out.printf("(%d, %d)위치에 반지름 %2.1f, 색깔이 %s인 원을 그립니다\n", x, y, radius, colorname[color]);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public double getRadius() {
		return radius;
	}
}


class Rectangle implements Drawable {
	private int x1, y1;
	private int x2, y2;
	
	public Rectangle(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	@Override
	public void draw(int color) {
		System.out.printf("왼쪽 위의 좌표가(%d, %d), 오른쪽 아래의 좌표가 (%d, %d), 색깔이 %s인 사각형을 그립니다."
				+ "\n", x1, y1, x2, y2, colorname[color]);
	}

	public int getX1() {
		return x1;
	}

	public int getY1() {
		return y1;
	}

	public int getX2() {
		return x2;
	}

	public int getY2() {
		return y2;
	}
}


public class DrawableTest {

	public static void main(String[] args) {
		
		// 부모클래스로 참조와 객체생성을 동시에 해서 자식클래스들을 배열로 불러낼 수 있다.
		Drawable[] drawables = {
						new Circle(80, 20, 15),
						new Circle(30, 20, 10),
						new Rectangle(5, 8, 8, 9)
						};
				
		for(Drawable d : drawables) {
			d.draw(5);
		}

	}

}
