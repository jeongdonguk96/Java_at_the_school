package Exercise;

public class CylinderTest extends Cylinder {

	public static void main(String[] args) {
		
		Cylinder c1 = new Cylinder();
		
		System.out.println("***** c1의 정보는 *****");
		sout(c1);
		
		Cylinder c2 = new Cylinder(10.0);
		
		System.out.println("***** c2의 정보는 *****");
		sout(c2);
		
		Cylinder c3 = new Cylinder(2.0, 10.0);
		
		System.out.println("***** c3의 정보는 *****");
		sout(c3);
		
		System.out.println(c3.toString());
	
	}

	private static void sout(Cylinder cyl) {

		System.out.println("radius는 = " + cyl.getRadius());
		System.out.println("height는 = " + cyl.getHeight());
		System.out.println("area는 = " + cyl.getArea());
		System.out.println("volume은 = " + cyl.getVolume());
		System.out.println("");
	}

}
