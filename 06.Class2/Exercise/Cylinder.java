package Exercise;

	public class Cylinder extends Circle {
		
		double height = 1.0;
		
		Cylinder () {}
		
		Cylinder (double height) {
			this.height = height;
		}
		
		Cylinder (double radius, double height){
			super(radius); // setRadius(radius)와 같이 사용가능
			this.height = height;
		}
		
		public double getHeight() {
			return height;
		}
		
		public void setHeight(double height) {
			this.height = height;
		}
		
		public double getVolume() {
			return height*super.getArea();
		}
		
		public double getArea() {
			return (2*Math.PI)*getRadius()+(2*super.getArea());
		}
		
		public String toString() {
			return "Cylinder [radius=" + getRadius() + ", color=" + getColor() + ", height = " + getHeight() + "]";
		}

}
