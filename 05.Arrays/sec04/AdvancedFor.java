package sec04;

public class AdvancedFor {

	public static void main(String[] args) {
		
		int[] code = {10, 20, 30, 40, 50};
		int sum = 0;
		
		for(int code1:code) {
			System.out.printf("%d ", code1);
//			System.out.printf(code1 + " ");
			sum += code1;
		}
		System.out.printf("\n총합은 = %d", sum);
		
	}
}