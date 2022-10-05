package sec03_generic_method;

public class SwapTestWrongEx {
	
	// call by value (매서드 호출시 값으로 전달함)
	public static void swap(Integer x, Integer y) {
		Integer tmp;
		tmp = x;
		x = y;
		y = tmp;
	}
	
	public static void main(String[] args) {
		
		// call by value (매서드 호출시 값으로 전달함)
		Integer a = 10;
		Integer b = 20;
				
		System.out.printf("교환 전 : a = %d, b = %d\n", a, b);
		swap(a,b);
		System.out.printf("교환 후 : a = %d, b = %d\n", a, b);
		// 값이 변해야 하지만 swap매서드의 x, y는 로컬변수라 main매서드까지 적용이 안됨.
		// call stack에서 메인이 1, 스왑이 2번째인데 스왑이 수행되면 그 결과물이 그냥 수행이 끝남과 동시에 날라감.
		// 주소값으로 넘겨줘야 값이 저장됨.

	}

}
