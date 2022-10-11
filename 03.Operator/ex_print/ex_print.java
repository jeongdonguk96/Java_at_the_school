package ex_print;

public class ex_print {

	public static void main(String[] args) {
		float f1 = 0.10f; // 0.10을 의미
		float f2 = 1e1f; // 1 * 10^1 = 10.0을 의미
		float f3 = 3.14e3f; // 3.14 * 10^3 = 3140.0
		
		
		System.out.printf("f1=%f, %e\n", f1, f1);
		System.out.printf("f2=%f, %e\n", f2, f2);
		System.out.printf("f3=%f, %e\n", f3, f3);

		double d = 1.23456789;
		System.out.printf("d=%f\n", d); // 소수 이하 자리가 6자리로 표현
		System.out.printf("d=[%14.10f]\n", d);
		System.out.printf("d=[%-14.10f]\n", d);
		
		System.out.println(100<<1);
		System.out.println(100>>1);
		System.out.println(100<<2);
		System.out.println(100>>2);
		System.out.println(100<<3);
		System.out.println(100>>3);
		
	}
}
