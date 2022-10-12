package sec01_runtime_exception;

public class NumberFormatException {

	public static void main(String[] args) {
		String data1 = "123";
		String data2 = "asd123";
		
		int value1 = Integer.valueOf(data1); // 숫자로만 구성된 문자열 -> 정수형 변환 가능
		int value2 = Integer.valueOf(data2); // 문자가 포함된 문자열 -> 정수형 변환 불가
	
	}

}
