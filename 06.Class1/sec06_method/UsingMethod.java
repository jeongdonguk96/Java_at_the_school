package sec06_method;

// 매서드 사용의 필요성
public class UsingMethod {

	public static void main(String[] args) {
		
		int[] arr1 = {45, 34, 25, 70, 15};
		// 배열의 초기값을 출력
		dispArray(arr1);
		
		arr1[0] = 99;
		// 내용이 변경된 배열을 출력
		dispArray(arr1);
		
		//arr1[0]과 arr1[1]의 내용을 교환 (int변수 tmp를 만들어서 밀어넣기)
		int tmp = arr1[0];
		arr1[0] = arr1[1];
		arr1[1] = tmp;
		// 내용이 변경된 배열을 출력
		dispArray(arr1);
		
	}

	public static void dispArray(int[] arr1) {
		for(int i=0; i<arr1.length; i++) {
			System.out.printf("%d ", arr1[i]);
		}
		System.out.println();
	}
	
}
