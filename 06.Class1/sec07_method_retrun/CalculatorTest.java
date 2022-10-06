package sec07_method_retrun;

public class CalculatorTest {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		
		//return이 있는 매서드를 호출한 경우
		int add_total = c1.add(7, 14);
		System.out.printf("a=7, b=14일 때 합 = %d\n", add_total);
		
		//return이 없는 void를 호출한 경우
		c1.multiply(7, 14);	// void매서드에 값을 입력 후
		System.out.println(c1.mul_total); 
		// void매서드 내에서 값이 입력된 mul_total이 메인필드의 mul_total에 입력돼서 그 mul_total을 출력
		
		int sum_total = c1.sum(2, 3, 5);
		System.out.println(sum_total);
		
		int max_total = c1.max(6, 2);
		System.out.println(max_total);
		
		
	}
	
}
