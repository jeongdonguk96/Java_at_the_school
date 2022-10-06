package sec12_static_instance_method;

class MyMath {
	
	long a;
	long b;
	
	// static 매서드
	static long add(long x, long y) {
		return x+y;
	}
	
	static long subtract(long x, long y) {
		return x-y;
	}	
	
	static long multiply(long x, long y) {
		return x*y;
	}
	
	static long divide(long x, long y) {
		return x/y;
	}
	
	// 인스턴스 매서드
	long add() {
		return a+b;
	}
	
}


public class MyMathTest {

	public static void main(String[] args) {
		
		System.out.println(MyMath.add(250l, 820l));
		System.out.println(MyMath.subtract(800l, 300l));
		System.out.println(MyMath.multiply(50l, 15l));
		System.out.println(MyMath.divide(80l, 20l));
		System.out.println("");
		
		MyMath m1 = new MyMath();
		m1.a = 350l;
		m1.b = 890l;
		System.out.println(m1.add());
		
	}

}
