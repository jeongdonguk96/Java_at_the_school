package sec02_interface_extends;

interface Movable1 {
	void moveUP();
	void moveDown();
	void moveLeft();
	void moveRight();
}

class MovablePoint implements Movable1 {
	int x;
	int y;
	int xSpeed;
	int ySpeed;
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getxSpeed() {
		return xSpeed;
	}

	public int getySpeed() {
		return ySpeed;
	}

	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	@Override
	public void moveUP() {
		y -= ySpeed;
	}

	@Override
	
	public void moveDown() {
		y += ySpeed;
	}

	@Override
	public void moveLeft() {
		x -= xSpeed;
	}

	@Override
	public void moveRight() {
		x += xSpeed;
	}
	
	@Override
	public String toString() {
		return "MovablePoint [x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + "]";
	}
}

class MovableCircle implements Movable1 {
	private int radius;
	private MovablePoint center;

	public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
		this.radius = radius;
		this.center = new MovablePoint(x, y, xSpeed, ySpeed);
	}

	@Override
	public String toString() {
		return "MovableCircle [radius=" + radius + ", center=" + center + "]";
	}

	@Override
	public void moveUP() {
		center.y -= center.ySpeed;	
	}

	@Override
	public void moveDown() {
		center.y += center.ySpeed;
	}

	@Override
	public void moveLeft() {
		center.x -= center.xSpeed;
	}

	@Override
	public void moveRight() {
		center.x += center.xSpeed;
	}
}


public class MovableTest {

	public static void main(String[] args) {
		
		
		Movable1 m1 = new MovablePoint(3, 2, 5, 5);
		System.out.println(m1);
		m1.moveLeft();
		System.out.println(m1);
		System.out.println();
		
		Movable1 m2 = new MovableCircle(2, 1, 2, 2, 20);
		System.out.println(m2);
		m2.moveRight();
		System.out.println(m2);
		
	}

}
