package sec10_static_member;

class Calculator {
	
	static double pi = 3.14159;
	
}

public class CalculatorTest {

	public static void main(String[] args) {
		
		double area = 10.0*10.*Calculator.pi;
		System.out.println("반지름이 10인 원의 면적 = " + area);
		
		double perimeter = 2*10.0*Calculator.pi;
		System.out.println("반지름이 10인 원의 둘레 = " + perimeter);
		
	}

}
