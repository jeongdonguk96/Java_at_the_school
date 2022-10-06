package sec07_method_retrun;

public class Calculator {
	
//	int add(int a, int b) {
//		int result = a+b;
//		return result;
//	}
	
	int mul_total;
	
	int add(int a, int b) {
		return a+b;
	}
	
	int subtract(int a, int b) {
		return a-b;
	}
	
	// multiply는 void라 반환값이 나오지 않음.
	// 그래서 mul_total이라는 변수를 메인필드에 선언 후 매서드에 초기화해 사용(간접배송) 
	void multiply(int a, int b) {
		mul_total = a*b;
	}
	
	void dispResult() {
		System.out.println(mul_total);
	}
	
	// 매개변수의 갯수를 알 수 없는 경우
	int sum(int... val) {
		int total = 0;
		for(int i=0; i<val.length; i++) {
			total += val[i];
		}
		return total;
	}
	
	int max(int a, int b) {
		if(a>b) 
			return a;
		else
			return b;
	}

	
}
